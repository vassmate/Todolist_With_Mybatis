CREATE DATABASE todo_db;

USE todo_db;

CREATE TABLE `todo` (
  `todo_id` int(11) NOT NULL AUTO_INCREMENT,
  `todo_name` varchar(45) NOT NULL,
  `todo_description` varchar(200) NOT NULL,
  PRIMARY KEY (`todo_id`)
);

INSERT INTO `todo` VALUES 
(1, 'Milk', 'Get milk'),
(2, 'Bread', 'Get some bread'),
(3, 'Car', 'Pay weight tax'),
(4, 'Gym start', 'Get to the gym at 8:00'),
(5, 'Key', 'Get the gym locker key');
