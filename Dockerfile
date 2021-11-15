FROM openjdk:16-alpine as builder
WORKDIR source
#RUN chmod +x gradlew
#RUN ./gradlew build
#COPY . .
#RUN chmod +x gradlew
#RUN ./gradlew build
ARG JAR_FILE=/build/libs/my-people-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar application.jar extract

FROM openjdk:16-alpine
WORKDIR application
COPY --from=builder source/dependencies/ ./
COPY --from=builder source/spring-boot-loader/ ./
COPY --from=builder source/snapshot-dependencies/ ./
COPY --from=builder source/application/ ./
ENTRYPOINT ["java","org.springframework.boot.loader.JarLauncher"]
