FROM openjdk:8-jdk-alpine

RUN mkdir /app
COPY target/messageboard*.jar  /app

WORKDIR /app
CMD java -jar app/messageboard*.jar
