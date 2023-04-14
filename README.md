# Maven-Archetypes

This repository contains Maven archetypes that can be used as project templates. 

Follow the steps below to use this project:

1. Clone this git repository

```
git clone git@github.com:FedorIzvekov/maven-archetypes.git
```

2. Navigate to the folder `maven-archetypes`
   
3. Publish the archetype to the local Maven repository (.m2)

```
mvn install
```

4.Use the archetype to bootstrap a new project:

```
mvn archetype:generate \
    -DarchetypeCatalog=local \
    -DarchetypeGroupId=com.fedorizvekov \
    -DarchetypeArtifactId=<archetype_name> \
    -DarchetypeVersion=<latest_archetype_version> \
    -Darchetype.filteredExtensions=java,xml,md \
    -DoutputDirectory=<directory_path> \
    -DgroupId=<group_id> \
    -DartifactId=<artifact_id> \
    -Dpackage=<class_package> \
    -DmainClassName=<main_class_name> \
    -Dversion=<version> \
    -DkeepParent=true \
    -DinteractiveMode=false -X
```

Note: 
Replace: 
* <archetype_name> with the name of the archetype you want to use;
* <latest_archetype_version> with the latest version of the archetype; 
* <directory_path> with the desired output directory for the new project; 
* <group_id> with the desired group ID for the new project;
* <artifact_id> with the desired artifact ID for the new project;
* <class_package> with the desired package for the main Java class;
* <main_class_name> with the name of the main Java class.
