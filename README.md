# SPRINGBOOT_JDBC_TEMPLATE


properties  data jpa application.properties

=======================================================
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/jpacustommethodsdb
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.hibernate.ddl=true
spring.jpa.show-sql=true

------------------------------------------------------------------------
application.properties file for JDBC Template

spring.datasource.url=jdbc:mysql://localhost:3306/jdbcapp
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver


-------------------------------------------------------------------------------------
<hibernate.version>4.3.11.Final</hibernate.version>


-------------------------------------------------------------------------------------
Swagger UI Dependency

        <dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.5.12</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.7.0</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.7.0</version>
		</dependency>
		
		
		--------------------------------------------------------------
		
		
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.31</version>
		</dependency>
		
		------------------------------------------------------------------
		
		<!-- Hibernate -->
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>${hibernate.version}</version>
		</dependency>
		
		------------------------------------------------------------------
		
------------Hibernate cfg file-----------	
	
		
		<?xml version = "1.0" encoding = "utf-8"?>
<!DOCTYPE hibernate-configuration SYSTEM
        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
    <session-factory>

        <property name = "hibernate.dialect">
            org.hibernate.dialect.MySQLDialect
        </property>

        <property name = "hibernate.connection.driver_class">
            com.mysql.cj.jdbc.Driver
        </property>

        <!-- Assume springcrudhibernate is the database name -->

        <property name = "hibernate.connection.url">
            jdbc:mysql://localhost:3306/springcrudhibernate
        </property>

        <property name = "hibernate.connection.username">
            root
        </property>

        <property name = "hibernate.connection.password">
            root
        </property>

        <property name = "hibernate.hbm2ddl.auto">
            create
        </property>

        <property name = "hibernate.show_sql">
            true
        </property>

        <!-- List of POJO class files -->
        <mapping class = "com.csi.model.Employee"/>

    </session-factory>
</hibernate-configuration>

----------------------------------------------------------------------------------------------------------------------------------------

Mockito Setup-
<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			<scope>test</scope>
		</dependency>
		<dependency>
    <groupId>org.powermock</groupId>
    <artifactId>powermock-core</artifactId>
    <version>2.0.0-RC.4</version>
    <scope>test</scope>
    </dependency>
<dependency>
    <groupId>org.powermock</groupId>
    <artifactId>powermock-module-junit4</artifactId>
    <version>2.0.0-beta.5</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>org.powermock</groupId>
    <artifactId>powermock-api-mockito2</artifactId>
    <version>2.0.0-beta.5</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>cglib</groupId>
    <artifactId>cglib</artifactId>
    <version>3.2.9</version>
</dependency>
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-inline</artifactId>
    <version>2.15.0</version>
</dependency>
		