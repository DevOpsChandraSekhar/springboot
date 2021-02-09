# springboot
# Clone or Fork this entire repository into your lcoal machine/git
  https://github.com/DevOpsChandraSekhar/springboot.git 

# Enabling Eureka Server -Spring boot microservices

1. Modify application.properties file
  *spring.application.name=Eureka-Server 
  *server.port=8761
  
2. Enable @EnableEurekaServer in main application 

# Spring Boot Custom Banner 
  This article shows you how to replace the default Spring’s banner below with your custom banner.
  1. To add a custom banner in Spring Boot application, create a banner.txt file and put it into the resources folder.
  
  2. Review the content of banner.txt, this ASCII Art is created by this “ASCII Art Java example“, and the ANSI colors are added manually.
  
  3. Start Spring Boot app and see console ouput.



# Spring Boot Jetty: Embedded Container

*https://github.com/DevOpsChandraSekhar/Spring-Boot-Jetty.git

1. By default, Spring Boot use Tomcat as the default embedded server, to change it to Jetty, just exclude Tomcat and include Jetty like this

2. Exclude tomcat from pom.xml file 
    <!-- Tomcat embedded container to be removed -->

        <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
			<exclusions>
				<exclusion>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-starter-tomcat</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
		
3. Add the dependency Jetty 

        <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-jetty</artifactId>
		</dependency>

4. Run spring boot app that's it.


# Creating simple springboot application
 *Mutiple ways to create Spring Boot Application
  1. Spring starter project
  2. Spring  Initializer
  3. Spring Boot CLI
 
# Springboot with jsp application
  Technologies used :

  1. Spring Boot 2.4.1 RELEASE
  2. Spring 4.3.4.RELEASE
  3. Tomcat Embed 8.5.6
  4. Maven 3
  5. Java 8
 
 1. Create the following folders manually :
   *webapp and subfolders
   
 2. Project Dependencies
    <!-- Tomcat embedded container -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
			<scope>provided</scope>
		</dependency>

		<!-- JSTL for JSP -->
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
		</dependency>

		<!-- Need this to compile JSP -->
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
			<scope>provided</scope>
		</dependency>

		<!-- Need this to compile JSP, tomcat-embed-jasper version is not working, 
			no idea why -->
		<dependency>
			<groupId>org.eclipse.jdt.core.compiler</groupId>
			<artifactId>ecj</artifactId>
			<version>4.6.1</version>
			<scope>provided</scope>
		</dependency>
 3. This SpringBootServletInitializer run a SpringApplication from a traditional WAR deployment
 
 4. A simple Spring controller class.
 
 5. JSP + Resources + Static files 
    * src/main/webapp/WEB-INF/jsp/
 6. For static files like CSS or Javascript, put in 
    * /src/main/resources/static/
 7. For properties files, put in 
    * /src/main/resources/
 8. Start the Spring Boot web app and Access 
    http://localhost:8080
    

# Tomcat Server startup issue fixed ?
  * Tomcat Serve startup Issue fixed while starting server 
  * For more updates Follow our YouTube Channel 
   ** https://youtu.be/J_sVvpCX0O4  
 
# Maven spring mvc application 
  Its a web Application -spring MVC with maven  
  files :
  1. index.jsp 
  2. csr-servlet.xml And 
  3. web.xml ( Deployment Descriptor )
  4. Controller 

# Maven standalone application
  

