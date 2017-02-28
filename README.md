# Todolist With Mybatis
This is a small backend for a todolist app with MySQL and Mybatis in Java.
Also it uses Maven to get the necessary dependencies.

# Description
The todo-mapper.xml (in resources/mapper) contains the select statements that are handled in the TodoManager.java.
To join a different database, use the mybatis-config.xml (located in resources/config).
I also had to use version 5.1.39 mysql-connector because of some issues with the latest versions.
