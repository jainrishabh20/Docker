FROM ubuntu:20.04

RUN apt-get update && apt-get install -y openjdk-17-jdk-headless
WORKDIR /opt

ENV PORT 8080
EXPOSE 8080

COPY target/*.jar /opt/app.jar

ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
