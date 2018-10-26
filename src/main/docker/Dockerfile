FROM openjdk:9.0.1-jre-slim
ARG finalName
ADD $finalName /burn.jar
ENTRYPOINT ["java","-jar","maven/${project.name}-${project.version}.jar"]