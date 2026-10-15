FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY build/libs/agendador-tarefa-0.0.1-SNAPSHOT.jar /app/agendador-tarefa.jar

EXPOSE 8081

CMD ["java", "-jar", "/app/agendador-tarefa.jar"]