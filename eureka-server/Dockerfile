## BUILD Maven project
FROM maven:3 as build
WORKDIR /app
COPY . .
RUN ["mvn","package","-DskipTests"]

## EXECUTE or LAUNCH application using OpenJDK8
FROM openjdk:8-jdk
WORKDIR /app
COPY --from=build /app/target/eureka-server-0.0.1-SNAPSHOT.jar /app/eureka-server.jar
CMD ["java","-jar","/app/eureka-server.jar"]  
