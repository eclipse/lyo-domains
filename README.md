# Lyo Domains

The *oslc-domains* project contains a set of Java classes that implement a set of OSLC Domain Specifications. The classes are annotated using OSLC4J, and are hence ready to use using [Lyo](https://wiki.eclipse.org/Lyo).  

## Installation

1. Clone this repository

2. run ```mvn install``` on the *oslc-domains* project.

3. Add the following dependency to your project:
```xml
<dependency>
	<groupId>oslc-domains</groupId>
	<artifactId>oslc-domains</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```

**NOTE!** Make sure this library uses the same version of Lyo Core as your project, by updating the ```<version.lyo.core>``` property in the pom.xml file.