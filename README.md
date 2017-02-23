# Payment Broker Web Service

Seeks to integrate custodians and depending systems.





Prerequisites
=

Prepare environment & database as follows;




The environment
-

- Gradle 3.4

- Java 1.6

- Jboss 5.0

- PostgreSQL 9.4




Database preparation
-

1. Create a database called `paymentbroker`
2. Create a datasource in jboss called `paymentBrokerDS`



Building the application
=


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
	
4. Navigate to `/build/libs` and therein you'll find the `paymentbroker-ear-1.0.ear` deployable package.

5. Deploy `paymentbroker-ear-1.0.ear`  to jboss.

6. Access the web module via `/broker`
