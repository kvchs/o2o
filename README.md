```
USE o2o;

CREATE TABLE tb_area (
	area_id INT (2) NOT NULL AUTO_INCREMENT,
	area_name VARCHAR (200) NOT NULL,
	priority INT (2) NOT NULL DEFAULT '0',
	create_time datetime DEFAULT NULL,
	last_edit_time datetime DEFAULT NULL,
	PRIMARY KEY (area_id),
	UNIQUE KEY UK_AREA (area_name)
) ENGINE = INNODB auto_increment = 1 DEFAULT CHARSET = utf8;

create table tb_person_info(
	user_id int(10) not null auto_increment,
	name varchar(32) default null,
	profile_img varchar(1024) default null,
	email varchar(1024) default null,
	gender varchar(2) default null,
	enable_status int(2) not null default '0' COMMENT '0:禁止使用本商场  1:允许使用本商场',
	user_type int(2) not null default '1' comment '1:顾客,2:店家, 3:超级管理员',
	create_time datetime DEFAULT NULL,
	last_edit_time datetime DEFAULT NULL,
	primary key (user_id)
) ENGINE = INNODB auto_increment = 1 DEFAULT CHARSET = utf8;


create table tb_product_category(
	product_category_id int(11) not null auto_increment,
	product_category_name varchar(100) not null,
	priority int(2) default '0',
	create_time datetime default null,
	shop_id int(20) not null default '0',
	primary key (product_category_id),
	constraint 'fk_procate_shop' foreign key 'shop_id' REFERENCES 'tb_shop' 'shop_id'
)ENGINE = INNODB auto_increment = 1 DEFAULT CHARSET = utf8;
```

### SpringMVC命名空间 ###
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:aop="http://www.springframework.org/schema/aop"
	xmlns:c="http://www.springframework.org/schema/c"
	xmlns:cache="http://www.springframework.org/schema/cache"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:jdbc="http://www.springframework.org/schema/jdbc"
	xmlns:jee="http://www.springframework.org/schema/jee"
	xmlns:lang="http://www.springframework.org/schema/lang"
	xmlns:mvc="http://www.springframework.org/schema/mvc"
	xmlns:p="http://www.springframework.org/schema/p"
	xmlns:task="http://www.springframework.org/schema/task"
	xmlns:tx="http://www.springframework.org/schema/tx"
	xmlns:util="http://www.springframework.org/schema/util"
	xsi:schemaLocation="http://www.springframework.org/schema/jee http://www.springframework.org/schema/jee/spring-jee-4.3.xsd
		http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-4.3.xsd
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.3.xsd
		http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-4.3.xsd
		http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util-4.3.xsd
		http://www.springframework.org/schema/jdbc http://www.springframework.org/schema/jdbc/spring-jdbc-4.3.xsd
		http://www.springframework.org/schema/cache http://www.springframework.org/schema/cache/spring-cache-4.3.xsd
		http://www.springframework.org/schema/task http://www.springframework.org/schema/task/spring-task-4.3.xsd
		http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/lang http://www.springframework.org/schema/lang/spring-lang-4.3.xsd
		http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-4.3.xsd ">
```

### ssm重点知识 ###
1. DispatcherServlet  
2. IOC和AOP  
3. MyBaits-ORM