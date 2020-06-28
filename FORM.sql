create database FORM;
use FORM;
create table biodata(
id int primary key,
nama varchar(20),
alamat varchar(50),
jk enum('PRIA','WANITA'),
email varchar(20));

