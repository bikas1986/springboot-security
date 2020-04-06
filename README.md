# springboot-security with JPA using MySQL
Springboot security example using MySql db 

We will use docker to run mysql:

docker container run --name springboot-security-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_USER=spring-user -e MYSQL_PASSWORD=password -e MYSQL_DATABASE=spring-security-db -d mysql:latest


To enter the running instance of mysql using bash mode:

docker container exec -it springboot-security-mysql bash

Now we are in bash mode of the container. To login to mysql server instance:

mysql -u spring-user -p

Now enter the password as 'password'

show databases;

Here we will see 2 databases including 'spring-security-db' 



Reference guide:

https://www.youtube.com/watch?v=TNt3GHuayXs&list=PLqq-6Pq4lTTYTEooakHchTGglSvkZAjnE&index=8


Spring security docs: 

https://docs.spring.io/spring-security/site/docs/current/reference/html5/#servlet-authentication-userdetailsservice


MySql docker :

https://hub.docker.com/_/mysql


