## BUILD Maven project
FROM maven:3 as build
WORKDIR /app
COPY . .
RUN ["mvn","package","-DskipTests"]

## EXECUTE or LAUNCH application using OpenJDK8
FROM openjdk:8-jdk
WORKDIR /app
COPY --from=build /app/target/sample-app-1.0.jar /app/sample-app-1.0.jar
CMD ["java","-jar","/app/sample-app-1.0.jar"]  
