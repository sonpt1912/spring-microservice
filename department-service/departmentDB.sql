CREATE DATABASE microservice;

CREATE TABLE `microservice`.department(
    id BIGINT primary key auto_increment,
    name VARCHAR(45)
);

CREATE TABLE `microservice`.employee(
	id BIGINT primary key auto_increment,
    id_department BIGINT,
    name VARCHAR(45),
    age INT, 
    position VARCHAR(45),
    
    FOREIGN KEY (id_department) REFERENCES `microservice`.department(id)
);


insert into `microservice`.department(name) values ('FPT'), ('FIS'), ("FSOFT");

insert into `microservice`.employee(id_department, name, age, position) values (1, 'Pham Thanh Son', 19, 'Dev');
insert into `microservice`.employee(id_department, name, age, position) values (2, 'Nguyen Hong Phuong', 19, 'Ba');