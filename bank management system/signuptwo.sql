show databases;
show processlist;
select*from signup;
show tables;
CREATE TABLE signuptwo (
    formno VARCHAR(20),
    religion VARCHAR(20),
    category VARCHAR(20),
    income VARCHAR(20),
    education VARCHAR(50),
    occupation VARCHAR(50),
    pan VARCHAR(10),
    aadhar VARCHAR(12),
    seniorcitizen VARCHAR(3),
    existingaccount VARCHAR(3),
    PRIMARY KEY (formno)
);