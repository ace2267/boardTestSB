create database test;
use test;
boardcreate table board(
bno int AUTO_INCREMENT PRIMARY KEY,
userName varchar(10),
contents text);
insert into board(userName, contents) values("user1","welcome2!!!");