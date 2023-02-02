CREATE DATABASE `codingTest`;
USE `codingTest`;

-- 상품정보 table
CREATE TABLE ITEM_TB (
    item_id INT(50) UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT '상품 id',
    item_nm TEXT NOT NULL COMMENT '상품명',
    item_price TEXT NOT NULL COMMENT '상품금액',
    item_reg_date DATE NOT NULL COMMENT '상품등록일자',
    com_id INT NOT NULL COMMENT '등록업체id',
    com_nm TEXT NOT NULL COMMENT '등록업체명'
    );

INSERT INTO `ITEM_TB` (item_nm,item_price,item_reg_date,com_id) VALUES
('진주알비비',20000,NOW(),1),
('앵두알틴트',8000,NOW(),1),
('촉촉바디로션',15000,NOW(),2),
('밀크핸드크림',7000,NOW(),2),
('어성초크림',22000,NOW(),3),
('어성초토너',21000,NOW(),3),
('메이크업픽서',11000,NOW(),4),
('판테놀에센스',15000,NOW(),4),
('어썸파운데이션',28000,NOW(),5),
('강력썬크림',13000,NOW(),5),
('썬팩트',18000,NOW(),5),
('망고바디로션',20000,NOW(),6),
('베리핸드크림',7000,NOW(),6),
('아로마핸드크림',7000,NOW(),6),
('블링아이쉐도우',13500,NOW(),7),
('아이브로우',8000,NOW(),7);

-- 등록업체 tb
CREATE TABLE COMPANY_TB (
    com_id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '등록업체id',
    com_nm TEXT NOT NULL COMMENT '등록업체명',
    com_bossNm TEXT NOT NULL COMMENT '대표자명',
    com_ctn TEXT NOT NULL COMMENT '등록업체연락처'
);

INSERT INTO `COMPANY_TB` (com_nm,com_bossNm,com_ctn) VALUES
('(주) 앵두팩토리','최진혁','02-734-9852'),
('(주) 네이쳐스킨','김희정','02-454-4578'),
('(주) 스킨뷰티','홍현미','02-634-8436'),
('(주) 메이크메이크업','김진영','031-527-8812'),
('(주) 퍼스트퍼시픽','박주미','02-344-3567'),
('(주) 후르츠바디','라미란','02-624-1453'),
('(주) 아이투아이','성보라','02-514-3304');

-- 구매자 tb
CREATE TABLE CUSTOMER_TB (
    ctm_id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '구매자id',
    ctm_nm TEXT NOT NULL COMMENT '구매자이름',
    ctm_hp TEXT NOT NULL COMMENT '구매자연락처'
);

INSERT INTO `CUSTOMER_TB` (`ctm_nm`,ctm_hp) VALUES
('임윤아','010-5483-2641'),
('정수영','010-9631-4524'),
('강지영','010-9647-2571'),
('김태연','010-4158-5852'),
('박규리','010-3489-9712'),
('한승연','010-1568-2675'),
('허영지','010-3648-7556'),
('송지효','010-1568-8365'),
('한소희','010-5978-3258'),
('장나라','010-4589-1237');

-- 구매정보 tb
CREATE TABLE CTMINFO_TB (
    ctminfo_buySeq INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '구매정보/구매번호',
    ctminfo_reg_date DATETIME NOT NULL COMMENT '구매정보/구매일자',
    item_id INT NOT NULL COMMENT '상품정보/상품id',
    ctm_id INT NOT NULL COMMENT '구매자/구매자id'
);

INSERT INTO `CTMINFO_TB` (ctminfo_reg_date, item_id, ctm_id) VALUES
(NOW(), 9, 1),
(NOW(), 1, 2),
(NOW(), 2, 3),
(NOW(), 3, 4),
(NOW(), 4, 5),
(NOW(), 5, 6),
(NOW(), 6, 7),
(NOW(), 7, 8),
(NOW(), 8, 9),
(NOW(), 9, 10),
(NOW(), 10, 1),
(NOW(), 11, 2),
(NOW(), 12, 3),
(NOW(), 13, 4),
(NOW(), 14, 5),
(NOW(), 15, 6),
(NOW(), 16, 7);

SELECT * FROM ITEM_TB;
SELECT COUNT(*) FROM ITEM_TB
SELECT * FROM COMPANY_TB;
SELECT * FROM CUSTOMER_TB;
SELECT * FROM CTMINFO_TB;
