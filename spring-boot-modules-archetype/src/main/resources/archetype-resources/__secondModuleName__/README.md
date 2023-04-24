# Project ${secondModuleName}

* [Preparation of Environment](#preparation-of-environment)
* [Install and Run](#install-and-run)
* [Check](#check)

# Preparation of Environment
To work with the ${secondModuleName} project, you need to install the following components:
* Java Development Kit version 17.
* Maven for building the project.


# Install and Run

1. Navigate to the directory:
```
cd ${outputDirectory}/${rootArtifactId}
```
2. Create an empty Git repository for git-commit-id-maven-plugin:
```
git init
```
3. Build the project:
```
mvn clean install
```
4. Run the project:
```
java -jar ./${secondModuleName}/target/${secondModuleName}-${version}.jar
```

# Check
1. Check probes:
``` 
curl -v http://localhost:8282/monitoring/health/readiness
curl -v http://localhost:8282/monitoring/health/liveness 
curl -v http://localhost:8282/monitoring/info 
```

2. Get Prometheus metrics:
``` 
curl -v http://localhost:8282/monitoring/prometheus 
```

3. Check logging level:
``` 
curl -v http://localhost:8282/monitoring/loggers 
```

4. Switch logging level without restarting the app:
``` 
curl -v -i -X POST -H 'Content-Type: application/json' -d '{"configuredLevel": "DEBUG"}' http://localhost:8282/monitoring/loggers/org.springframework 
```

5. Shutdown the app:
``` 
curl -v -X POST http://localhost:8282/monitoring/shutdown 
``` 