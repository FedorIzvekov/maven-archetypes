# Maven-Archetypes

This repository contains Maven archetypes that can be used as project templates. 

Follow the steps below to use this project:

1. Clone this git repository

```
git clone git@github.com:FedorIzvekov/maven-archetypes.git
```

2. Navigate to the folder `/maven-archetypes/...`
   
3. Publish the archetype to the local Maven repository (.m2)

```
mvn install
```

4.Use the archetypes to bootstrap a new project:

4.1 spring-boot archetype:
```
mvn archetype:generate \
    -DarchetypeCatalog=local \
    -DarchetypeGroupId=com.fedorizvekov \
    -DarchetypeArtifactId=spring-boot \
    -DarchetypeVersion=LATEST \
    -Darchetype.filteredExtensions=java,xml,md \
    -DoutputDirectory=<directory_path> \
    -DgroupId=<group_id> \
    -DartifactId=<artifact_id> \
    -DmainClassName=<main_class_name> \
    -Dversion=<version> \
    -DkeepParent=true \
    -DinteractiveMode=false -X
```
4.2 spring-boot-modules archetype:
```
mvn archetype:generate \
    -DarchetypeCatalog=local \
    -DarchetypeGroupId=com.fedorizvekov \
    -DarchetypeArtifactId=spring-boot-modules \
    -DarchetypeVersion=LATEST \
    -Darchetype.filteredExtensions=java,xml,md \
    -DoutputDirectory=<directory_path> \
    -DgroupId=<group_id> \
    -DartifactId=<artifact_id> \
    -DfirstModuleName=<first_module_name> \
    -DsecondModuleName=<second_module_name> \
    -DfirstMainClassName=<first_main_class_name> \
    -DsecondMainClassName=<second_main_class_name> \
    -Dversion=<version> \
    -DkeepParent=true \
    -DinteractiveMode=false -X
```

Note: 
Replace: 
* `<directory_path>` with the desired output directory for the new project; 
* `<group_id>` with the desired group ID for the new project;
* `<artifact_id>` with the desired artifact ID for the new project;
* `<main_class_name>` with the name of the main Java class;
* `<module_name>` with the desired module name for the new project;
* `<version>` with the desired version for the new project.