FROM openjdk:19-jdk
VOLUME /tmp
COPY target/k8-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]