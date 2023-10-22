FROM openjdk:8
EXPOSE 8760
ADD target/FreelanceCRUD-0.0.1-SNAPSHOT.jar FreelanceCRUD-0.0.1.jar
ENTRYPOINT ["java", "-jar", "FreelanceCRUD-0.0.1.jar"]