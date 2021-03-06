# SpringBoot & Jersey2 demo

This is demo application showing integration of SpringBoot and Jersey 2 as JAX-RS referential
implementation.

## Building application

This project is using Gradle as a build tool. In order to make deliverable, Spring-Boot JAR file
you will need to execute following from project root folder:

```

$ ./gradlew clean build

```

As a result, in ${PROJECT.ROOT}/build/libs will be generated file:

demo-jersey2-0.0.1-SNAPSHOT.jar


## Starting application

Currently there is just one active profile that can be used: develop.

Spring profile develop assumes that there is H2 In-Memory DB. Also, this project relays on
usage of Liquibase, source control for DB.
Scripts that will be excuted on H2 are given in following file:
${PROJECT.ROOT}/src/main/resources/liquibase-changeLog.xml

Starting application is easy.

Go to, 
${PROJECT.ROOT}/build/libs

and execute following:

```

java -jar demo-jersey2-0.0.1-SNAPSHOT.jar --spring.profiles.active=develop

```


## Verify DB accessabillity, H2-Console

Since H2-Console is enabled (you can configure/check this in application.yml file),

```

spring:
  h2:
    console:
      enabled: true

```

![H2-Console in web browser](/images/h2-console/h2-console-001.png) 

Click on connect, and you will get to SQL client:

![H2-Console SQL client](/images/h2-console/h2-console-002.png)

Check if there are manufacturers:

![H2-Console in web browser](/images/h2-console/h2-console-003.png)

## Verify JAX-RS, Jersey Endpoints

Now you can open browsers and hit following URL's:

1. To get all manufacturers:

```

http://localhost:8080/api/v1/manufacturers

```

Response in this case is:
![JSON Response](/images/jersey/jersey-001.png)


2. To get one manufacturer:

```

http://localhost:8080/api/v1/manufacturers/1

```

Response in this case is:
![JSON Response](/images/jersey/jersey-002.png)


3. To get all phone models:

```

http://localhost:8080/api/v1/phonemodels

```

Response in this case is:
![JSON Response](/images/jersey/jersey-003.png)


4. To get one phone model:

```

http://localhost:8080/api/v1/phonemodels/2

```

Response in this case is:
![JSON Response](/images/jersey/jersey-004.png)

