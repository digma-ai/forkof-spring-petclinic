[![digma-ai](https://circleci.com/gh/digma-ai/otel-sample-app-java.svg?style=svg)](https://circleci.com/gh/digma-ai/otel-sample-app-java)

# Digma Sample: Java SpringBoot PetClinic Sample

The following code is a sample application used to demonstrate how [Digma](https://github.com/digma-ai/digma) can help demystify code by providing visibility into code paths, breakdown, identifying performance bottlenecks and runtime errors. 

We took the original application of [PetClinic](https://github.com/spring-projects/spring-petclinic) and added some common coding anti-patterns that would often be detected in real-world codebases.

## Prerequisites

- [Java 17+](https://www.oracle.com/sa/java/technologies/javase/jdk17-archive-downloads.html)
- [IntelliJ IDEA 2022.3+](https://www.jetbrains.com/idea/download)

## Optional

- [Docker](https://www.docker.com/)

## Running the app with Digma Continuous Feedback

### Build the application and run it

1. Clone this project to your machine and open it in [IntelliJ](https://www.jetbrains.com/idea/download).
2. Make sure to select 'Gradle Project' when prompted
3. run the following command in order prepare the 
environment:
`./gradlew bootJar`

### Install the IDE extension and Digma

1.Install the [Digma Plugin](https://plugins.jetbrains.com/plugin/19470-digma-continuous-feedback) . You can also just search for it in the IDE settings Plugins section.
2.Click the 'Digma' icon on the right side of the screen and walk through the two quick setup steps.

#### There are a few options to run the application.

Notice that feedback will start appearing in the 'Observabiliy' panel below.
You may then click a specific endpoint to explore further, more insights and analytics will apear the more you use the application.

##### Option 1. Use the included Run Configuration

Select the 'petclinic-service' configuration and run or debug it locally.
You can either use the 'ClientTester' task to generate some actions or just browse directly to the PetClinic [main](http://localhost:9753/) page.

##### Option 2. Via docker which includes the App and Collector

Run the application using the included Docker Compose file

```shell
docker-compose up --build
```

### Use the application Manually

Browse to [Local PetClinic](http://localhost:9753/) and use the application freely.

### View Digma Insights via Plugin

Within few minutes Digma should have collect the traces and analyze them already.
Meanwhile you can open the UI of Digma Plugin, by clicking on 'Digma' at the left-bottom corner in the Intellij

![image](https://user-images.githubusercontent.com/104715391/203008076-9c8aac11-e499-4a2d-a003-d33ada281fde.png)

Now you can browse to class (shortcut <kbd>Ctrl</kbd> + <kbd>N</kbd>) `OwnerController` and you should see something like that:

![image](https://user-images.githubusercontent.com/104715391/203009185-408f35c0-b7f8-4257-9144-baf0a624a22c.png)

where LOCAL is your local environment, and the list contains linkable methods within this class.

as an example for Insights you can click on `findOwner` method and you should see something like that:

![image](https://user-images.githubusercontent.com/104715391/203009907-248b01b5-b054-4708-b457-753ef9f416fa.png)
