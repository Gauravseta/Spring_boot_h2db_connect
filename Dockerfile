FROM openjdk:12
#COPY . /usr/src/myapp
#WORKDIR /usr/src/myapp
RUN mkdir myapp
WORKDIR myapp
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/myapp/app.jar"]
EXPOSE 8080