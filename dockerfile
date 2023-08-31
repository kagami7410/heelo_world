FROM openjdk:17
COPY ./target/helloWorld-0.0.1-SNAPSHOT.jar /app/helloWorld.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "helloWorld.jar"]

