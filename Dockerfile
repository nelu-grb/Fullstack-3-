FROM amazoncorretto:21-alpine-jdk
WORKDIR /app
COPY build/libs/*[!plain].jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

