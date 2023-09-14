FROM amazoncorretto:17.0.8-alpine3.18

ARG JAR_FILE_PATH=build/libs/*.jar

COPY ${JAR_FILE_PATH} application.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "application.jar"]
