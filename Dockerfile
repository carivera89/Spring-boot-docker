FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/dockering-spring-web-0.0.1-SNAPSHOT.jar ejercicio-docker-spring-boot-1.0.0.jar 
ENTRYPOINT ["java","-jar","/ejercicio-docker-spring-boot-1.0.0.jar"] 


