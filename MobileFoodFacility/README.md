# MobileFoodFacility
This Spring Boot project holds complete information about mobile food vendors on their licensing status, location, fooditems and much more.  

## Description
This Project holds the information of Applicants( Mobile Food Vendors) which are stored in the In-Memory H2 Database.

## Project Packages/ Classes

com.assignment- It is base package of this Project.
 
Below are the classes:
- SpringBoot Main Application Class
- 1 Controller class
- 1 Service class
- 1 Data Model class
- 1 Repository class 

## Resources/Files
- Apllication.properties
- 1 CSV file(datasets_mobile-food-facility-permit.csv)

## Database
-  H2 Database(IN-Memory) 


## EndPoints
   Using the following endpoints, different operations can be achieved:
- /api/csvload - It will read the CSV file,parse it to Java objects and load into the Database(H2 Db)
- /api/fetchdata - It will fetch complete data.
- /api/addData - It will add new data into the Database.
- /api/deletedata - It will delete data from Database.
- /api/fetchdata/{applicant} - Based on the key(applicant),it will fetch data.
- /api/fetchdata/{facilityType} - Based on the key(facilityType),it will fetch data.
- /api/fetchdata/{status} -  Based on the key(status),it will fetch data.
- /api/expired-foodtrucks - It will fetch data for the vendors with expired license. 

## Libraries used
- Spring Boot
- Spring Configuration
- Spring Web
- Spring Data JPA
- H2
- Development Tools
- OpenCSV
- Springfox Swagger2
- Springfox Swagger UI
- JDBC

## API Documentation
- http://localhost:8080/v2/api-docs

## Compilation Command
- mvn clean install 
