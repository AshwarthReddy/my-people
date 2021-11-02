FROM openjdk:16-alpine
VOLUME /tmp
ARG EXTRACTED=./build/
COPY ${EXTRACTED}/libs/ ./
COPY ${EXTRACTED}/spring-boot-loader/ ./
COPY ${EXTRACTED}/snapshot-dependencies/ ./
COPY ${EXTRACTED}/application/ ./
ENTRYPOINT ["java","org.springframework.boot.loader.JarLauncher"]