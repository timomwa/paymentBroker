# paymentBroker

Prerequisites

- Gradle 3.4

- Java 1.6

- Jboss 5.0


1. Build and install the ejb module first by entering the below sequence of commands below; 

	cd ejb
	gradle clean install
	cd ..
	
2. Build the web module by entering the sequence of commands below;

	cd web
	gradle clean install
	cd ..
	
3. Build the ear file by running the following sequence of commands;

	gradle ear
	
4. 
