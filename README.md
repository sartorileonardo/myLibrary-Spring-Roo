# MyLibrary-Spring-Roo
This is one spring roo project with the technologies (Java 8, Spring Boot, Spring MVC, Hibernate, JPA, Apache Maven and Hypersonic DB).

# Spring Roo
Spring Roo is one power generator code based in Spring Boot and Spring MVC.

# Spring Roo Doc
For a full documentation, acess: https://docs.spring.io/spring-roo/reference/html/command-index.html

# For create this project was used in CLI Spring Roo:

//Setup Project <br>
project setup --topLevelPackage com.mylibrary --projectName "myLibrary" --java 8 --packaging JAR

//Setup database, jpa and hiernate <br>
jpa setup --provider HIBERNATE --database HYPERSONIC_IN_MEMORY

//Create domain class <br>
entity jpa --class ~.domain.Book

//Create new field(s) <br>
field string --fieldName title --notNull <br>
field string --fieldName author --notNull <br>
field number --fieldName price --type java.lang.Float <br>
field string --fieldName publishingCompany --notNull <br>
field string --fieldName isbn --notNull <br>

//Repositório configuration <br>
repository jpa --entity ~.domain.Book

//Service configuration <br>
service --all 

//Web MVC configuration <br>
web mvc setup

//web mvc with thymeleaf <br>
web mvc view setup --type THYMELEAF

//Controller configuration <br>
web mvc controller --entity ~.domain.Book --responseType THYMELEAF

//Api configuration <br>
web mvc controller --all --pathPrefix /api

//Exit project <br>
quit

//Run <br>
mvn spring-boot:run

# Open Project Code
For open the code, acess Eclipse IDE > Import Maven Project > <myLibrary_directory with pom.xml>.

# Run this project
<ol>
  <li>git clone <current_project_link> </li><br>
  <li>Unzip the file myLibrary.zip <br>
  <li>Into local directory of \myLibrary <br>
  <li>Execute mvn spring-boot:run <br>
  <li>Open in your browser: http://localhost:8080/  <br>
</ol>

# View history of spring roo commands
Acess \myLibrary\log.roo

# Show My Library Demo
![demo_my_library](https://user-images.githubusercontent.com/7613528/51220011-9f104b00-191a-11e9-92b5-de1d1c5a6256.gif)





