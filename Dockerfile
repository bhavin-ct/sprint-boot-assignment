FROM openjdk:11
ADD target/assignment-0.0.1-SNAPSHOT.jar assignment.jar
ENTRYPOINT ["java", "-jar", "assignment.jar"]
