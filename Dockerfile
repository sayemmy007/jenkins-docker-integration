FROM openjdk:17
EXPOSE 8080
ADD target/jenkins-docker-integrataion.jar jenkins-docker-integration.jar
ENTRYPOINT ["java","-jar","/jenkins-docker-integration.jar"]