To build this project use maven 3.6+ and java 11.

To run this project in dev mode please use the below command 
~~~
mvn quarkus:dev
~~~


- Hibernate ORM taking care of all CRUD operations
- RESTEasy powering the REST API
- ArC, a CDI based dependency injection framework
- the Narayana Transaction Manager coordinating all transactions
- Agroal, the high performance Datasource implementation
- Infinispan used as    2nd level caching: enabled on both entities and queries
- The Undertow webserve
- Hibernate custom Naming Strategies


https://github.com/quarkusio/quarkus-quickstarts/tree/main/hibernate-orm-quickstart
https://quarkus.io/guides/datasource
https://quarkus.io/guides/hibernate-orm
https://quarkus.io/guides/logging
https://quarkus.io/guides/transaction
