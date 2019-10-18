# Student-Management-Demo-Spring-boot
### 1. You can clone it from github by running following command
```
  $ git clone https://github.com/dineshsatelkar-11/Student-Management-Demo-Spring-boot.git
 ```
### 2. Import project into eclipse
```
  File -> Import -> Maven -> Existing Maven Projects -> Browse Project from cloned location
  ```
### 3. Right click on project in eclipse and then Maven -> Update Projects
### 4. Import src/main/java/resources/New Project 20191018 1403.sql into MySQL database
### 5. Update database credential and other configuration into application.properties available in src/main/java/resources
# for student
```
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url= jdbc:mysql://localhost:3306/studenttable
spring.datasource.username= root
spring.datasource.password= root
spring.datasource.tomcat.max-wait= 20000
spring.datasource.tomcat.max-active= 50
spring.datasource.tomcat.max-idle= 20
spring.datasource.tomcat.min-idle= 15
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQLDialect
spring.jpa.properties.hibernate.id.new_generator_mappings = false
spring.jpa.properties.hibernate.format_sql = true
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=none
logging.level.org.hibernate.SQL= DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder= TRACE
```
# for teacher
```
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url= jdbc:mysql://localhost:3306/studenttable
spring.datasource.username= root
spring.datasource.password= root
spring.datasource.tomcat.max-wait= 20000
spring.datasource.tomcat.max-active= 50
spring.datasource.tomcat.max-idle= 20
spring.datasource.tomcat.min-idle= 15
server.port=8081
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQLDialect
spring.jpa.properties.hibernate.id.new_generator_mappings = false
spring.jpa.properties.hibernate.format_sql = true
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=none
logging.level.org.hibernate.SQL= DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder= TRACE
```
### 6. Right click on StudentServiceApplication.java and TeacherServiceApplication.java  file and run as Java Application
##Once Sprint Boot Application will be started successfully then we can call following Endpoints by using POSTMAN
### 7. To get list of student call following endpoint with GET Request
```
  http://localhost:8080/studentservice/students
  ```
### 8.To Create New Student use following url with POST Request
```
  http://localhost:8080/studentservice/students
  ```
  ```
  {
    "name": "Nitest",
    "email": "niteshsatelkar@gmail.com"
  }
  ```
  set content type as in header as application/json
set request body as raw with JSON payload
### 9.To get a particular book, use following url with GET request type in postman
```
  http://localhost:8080/studentservice/students/<id>
  ```
### 10.Now to add teacher use the following url with POST Request
  ```
  http://localhost:8081/teacherservice/teachers
  ```
  ```
  {
    "name": "Nikhil",
    "subject": "Chemistry",
    "marks": 85,
    "studentid":1
  }
  ```
  (Subjects should be Physics,Maths,Chemistry)
### 11.To get list of teachers by using GET Request.
  ```
http://localhost:8081/teacherservice/teachersCorrectedList/1
```
  ```
    {
        "id": 1,
        "name": "Nikhil",
        "subject": "Chemistry",
        "marks": 85,
        "studentid": 1
    },
    {
        "id": 2,
        "name": "Govind",
        "subject": "Maths",
        "marks": 85,
        "studentid": 1
    },
    {
        "id": 3,
        "name": "Akash",
        "subject": "Physics",
        "marks": 85,
        "studentid": 1
    }

```
