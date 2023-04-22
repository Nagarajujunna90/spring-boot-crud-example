FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-crud-example-0.0.1-SNAPSHOT.jar springboot-docker.jar
ENTRYPOINT ["java","-jar","/springboot-docker.jar"]