# order
 order backend apis

###How to run in local
1. Rename ``src/main/resources/application.properties.example`` to ``src/main/resources/application.properties``.
1. Change the Application Properties (E.g. username/password of DB) present in ``resources/application.properties``  according to your local mysql-server.
1. Go to application.properties and comment / uncomment the corresponding front-end url and enter the STRIPE API Keys
1. Create a database called `order` with ``CHARACTER SET utf8mb4`` and `COLLATE utf8mb4_0900_ai_ci`. MariaDB does not support `COLLATE utf8mb4_0900_ai_ci`. So, if you are using MariaDB, open `database-dump.sql` file and replace `COLLATE utf8mb4_0900_ai_ci` with `COLLATE utf8mb4_general_ci`  
1. Import `database-dump.sql` in it.
1. To run the application, run the command ``sh run.sh`` i.e. execute the ``run.sh`` file. 
1. After starting application, go to http://localhost:8080/api/swagger-ui.html/
   
## Category/Update/{id}
* The input for updating the category via API is
```
{
    "categoryName":"name",
    "imageUrl":"url",
    "description":"desc"
}
```


### In case of "java.lang.IllegalStateException: Unable to load cache item error":
- Go into pom.xml and comment out the scope for the "spring-boot-starter-tomcat" dependency


## How to use prod profile
mvn package
java -jar -Dspring.profiles.active=prod <package name in target>

## Run in production server with latest changes in master


#admin access
email: admin@gmail.com
password: admin
firstname: admin

