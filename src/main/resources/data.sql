DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  address VARCHAR(250),
  phone VARCHAR(250)
);


insert into customer values(1,'sumit','kolhapur','789');
insert into customer values(2,'rahul','jalgaon','456');
insert into customer values(3,'savita','nagar','123');