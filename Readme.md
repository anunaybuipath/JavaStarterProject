# Dashboard user's metadata service

## How to's

### How to start the service

1. `.\mvnw spring-boot:run `.
2. OR can run directly from intellij/eclipse.

### How to prepare run on production ?

#### Step 1

Create a fat jar using the command :

`.\mvnw -Dspring.profiles.active=<PROFILE> clean package`

This will run all the test cases as well. To create a jar without running the test cases run the following command.

`.\mvnw clean install -DskipTests=true`

#### Step 2

Run this jar on the machine 

`start /min java -jar -Dspring.profiles.active=<PROFILE> target\dashboard-0.0.1-SNAPSHOT.jar`
