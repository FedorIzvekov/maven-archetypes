# Project ${artifactId}

This project consists of code, configurations and instructions divided into modules:
* ${firstModuleName};
* ${secondModuleName};

# Table of Contents
* [Code Download](#code-download)
* [Preparation of Environment](#preparation-of-environment)
* [Building the Project](#building-the-project)
* [Module ${firstModuleName}](${firstModuleName}/README.md#module-${firstModuleName})
* [Module ${secondModuleName}](${secondModuleName}/README.md#module-${secondModuleName})


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
