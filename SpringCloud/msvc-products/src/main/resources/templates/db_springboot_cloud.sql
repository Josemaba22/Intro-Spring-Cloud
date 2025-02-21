create database db_springboot_cloud;

use db_springboot_cloud;

create table products(
	id int not null auto_increment unique,
    name varchar(100) not null,
    price decimal(11,2) not null,
    create_at date not null
);

alter table products add constraint
PK_products primary key (id);

INSERT INTO products (name, price, create_at) VALUES('Panasonic', 800, NOW());
INSERT INTO products (name, price, create_at) VALUES('Sony', 700, NOW());
INSERT INTO products (name, price, create_at) VALUES('Apple', 1000, NOW());
INSERT INTO products (name, price, create_at) VALUES('Sony Notebook', 1000, NOW());
INSERT INTO products (name, price, create_at) VALUES('Hewlett Packard', 500, NOW());
INSERT INTO products (name, price, create_at) VALUES('Bianchi', 600, NOW());
INSERT INTO products (name, price, create_at) VALUES('Nike', 100, NOW());
INSERT INTO products (name, price, create_at) VALUES('Adidas', 200, NOW());
INSERT INTO products (name, price, create_at) VALUES('Reebok', 300, NOW());

SELECT * FROM products;