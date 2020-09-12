# Project ${artifactId}

# Table of Contents
* [Code Download](#code-download)
* [Preparation of Environment](#preparation-of-environment)
* [Building the Project](#building-the-project)
* [Running the Project](#running-the-project)
* [Checking Actuator](#checking-actuator)


# Code Download
To download the '${artifactId}' project code to your local machine, use the following command:
```
git clone <git_url>
```


# Preparation of Environment
To work with the '${artifactId}' project, you need to install the following components:
* Java Development Kit version 17;
* Maven for building the project;
* Docker and Docker Compose for container deployment and management.


# Building the Project
To build the project, follow these steps:

1. Navigate to the project directory:
```
cd <projects_directory>/${artifactId}
```
2. Create an empty Git repository for the 'git-commit-id-maven-plugin':
```
git init
```
3. Build the project using Maven:
```
mvn clean install
```


# Running the Project
Run the project using the following command:
```
java -jar ./target/${artifactId}-${version}.jar
```


# Checking Actuator
To check the actuator endpoints of the '${artifactId}' project, follow these steps:

1. Check probes:
``` 
curl -v http://localhost:8181/monitoring/health/readiness
curl -v http://localhost:8181/monitoring/health/liveness 
curl -v http://localhost:8181/monitoring/info 
```
2. Get Prometheus metrics:
``` 
curl -v http://localhost:8181/monitoring/prometheus 
```
3. Check logging level:
``` 
curl -v http://localhost:8181/monitoring/loggers 
```
4. Switch logging level without restarting the app:
``` 
curl -v -i -X POST -H 'Content-Type: application/json' -d '{"configuredLevel": "DEBUG"}' http://localhost:8181/monitoring/loggers/org.springframework 
```
5. Shutdown the app:
``` 
curl -v -X POST http://localhost:8181/monitoring/shutdown 
``` 