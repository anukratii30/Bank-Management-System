create database bankmanagementsystem;

show databases;
use bankmanagementsystem;
CREATE TABLE signup (
    formno VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100),
    father_name VARCHAR(100),
    dob DATE,
    gender VARCHAR(10),
    email VARCHAR(100),
    marital_status VARCHAR(20),
    address VARCHAR(255),
    city VARCHAR(100),
    pin VARCHAR(10),
    state VARCHAR(100)
);
show tables;
select*from signup;