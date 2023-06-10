#FROM maven:3-jdk-11 as builder
#RUN mvn clean install
FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-crud-example-0.0.1-SNAPSHOT.jar spring-boot-docker-example
ENTRYPOINT ["java","-jar","spring-boot-docker-example"]