FROM amazoncorretto:17-alpine-jdk
MAINTAINER Belen Marconi
COPY target/backendAP-0.0.1-SNAPSHOT.jar backportfolio-app.jar
ENTRYPOINT ["java","-jar","/backportfolio-app.jar"]


