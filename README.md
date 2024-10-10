Servlet Jsp Demo

Đề bài: Dùng servlet, jdbc, jsp để tạo 1 trang hiển thị các dữ liệu User get từ Database

Cách làm:
- Khởi tạo project Dynamicweb -> convert sang Maven
- Sau đó thêm các dependencies vào file pom.xml
- Khởi tạo các folder: Model, Controller, Dao
- Khởi tạo view (các trang .jsp)

Database:

// Tao Database:
- use demo;

// Tao table:
- create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);

// Insert dữ liệu
- INSERT INTO `demo`.`users` (`id`, `name`, `email`, `country`) VALUES ('3', 'test', 'testGitHub@gmail.com', 'Ho Chi Minh');

// Select dữ liệu
- select * from users;
