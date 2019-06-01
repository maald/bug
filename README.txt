1. Run MariaDB or MySQL database

2. Update persistence.xml properties

3. Run
	
	-	mvn clean
	
	-	mvn install
	
	-	java -jar target/assembly/eclipselink-jpa-2-7-4-test-0.0.1-SNAPSHOT-jar-with-dependencies.jar
		or
		java -jar target\assembly\eclipselink-jpa-2-7-4-test-0.0.1-SNAPSHOT-jar-with-dependencies.jar

4. Look at the generated DDL in createDDL.jdbc file. At least one FK will not have "ON DELETE CASCADE"