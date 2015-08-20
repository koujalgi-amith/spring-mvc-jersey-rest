# spring-rest-server
Simple REST server with Spring integration

### Here's how to create different kinds of Jersey projects:

### Create a sample Jersey 2.3.1 project that produces a .war that can be run in a webcontainer (Tomcat/Jetty):

```sh
mvn archetype:generate -DarchetypeGroupId=org.glassfish.jersey.archetypes -DarchetypeArtifactId=jersey-quickstart-webapp -DarchetypeVersion=2.21 -DgroupId=com.group-xyz -DartifactId=spring-mvc-jersey-rest -DinteractiveMode=false
```

### Create a sample Jersey 2.3.1 project comes with an embedded Grizzly web server:
```sh
mvn archetype:generate -DarchetypeGroupId=org.glassfish.jersey.archetypes -DarchetypeArtifactId=jersey-quickstart-grizzly2 -DarchetypeVersion=2.21 -DgroupId=com.group-xyz -DartifactId=spring-mvc-jersey-rest -DinteractiveMode=false
```

### If you need Spring MVC with Jersey 2.3 which is deployable into a webcontainer, clone this project and run:
```sh
mvn clean package
```
