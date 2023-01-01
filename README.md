# codigTestFromRm
- 열심히 노력해 보았으나 아직 실력이 미흡하여 docker를 이용한 서버 구축은 하지 못 했습니다.
- 하지만 할 수 있는데까지 열심히 해 보았습니다. 기회를 주신다면 열심히 배우고 공부하겠습니다. 감사합니다.

DATABASE MySQL: codingTest /
JAVA / STS4 / Springboot
- 각 코드에서 파라미터를 활용하여 검색 -> 데이터 관계성 확인 

----

## ITEM_TB : 상품 정보
```
    item_id INT(50) UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT '상품 id',
    item_nm TEXT NOT NULL COMMENT '상품명',
    item_price TEXT NOT NULL COMMENT '상품금액',
    item_reg_date DATE NOT NULL COMMENT '상품등록일자',
    com_id INT NOT NULL COMMENT '등록업체id',
    com_nm TEXT NOT NULL COMMENT '등록업체명'
```

```
testCode

http://localhost:8088/result/itemList
```
```
result msg

// http://localhost:8088/result/itemList

 "total_item_count": 16,
  "list": [
    {
      "item_id": 1,
      "item_nm": "진주알비비",
      "item_price": "20000",
      "item_reg_date": "2023-01-01",
      "com_id": 1,
      "company": "(주) 앵두팩토리"
    }

```
----

## COMPANY_TB : 등록 업체
```
    com_id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '등록업체id',
    com_nm TEXT NOT NULL COMMENT '등록업체명',
    com_bossNm TEXT NOT NULL COMMENT '대표자명',
    com_ctn TEXT NOT NULL COMMENT '등록업체연락처'
```

```
testCode

http://localhost:8088/result/comList
```
```
result msg

// http://localhost:8088/result/comList

{
  "total_item_count": 7,
  "list": [
    {
      "com_id": 1,
      "com_nm": "(주) 앵두팩토리",
      "com_bossNm": "최진혁",
      "com_ctn": "02-734-9852"
    }
```

----

## CUSTOMER_TB : 구매자
```
    ctm_id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '구매자id',
    ctm_nm TEXT NOT NULL COMMENT '구매자이름',
    ctm_hp TEXT NOT NULL COMMENT '구매자연락처'
```

```
testCode

http://localhost:8088/result/ctmList
```
```
result msg

//http://localhost:8088/result/ctmList

{
  "total_item_count": 10,
  "list": [
    {
      "ctm_id": 1,
      "ctm_nm": "임윤아",
      "ctm_hp": "010-5483-2**1"
    }
```

----

## CTMINFO_TB : 구매 정보
```
    ctminfo_buySeq INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '구매정보/구매번호',
    ctminfo_reg_date DATETIME NOT NULL COMMENT '구매정보/구매일자',
    item_id INT NOT NULL COMMENT '상품정보/상품id',
    ctm_id INT NOT NULL COMMENT '구매자/구매자id'
```

```
testCode

http://localhost:8088/result/cifList
```
```
result msg
// http://localhost:8088/result/cifList

{
  "total_item_count": 17,
  "list": [
    {
      "ctminfo_buySeq": 1,
      "ctminfo_reg_date": "2023-01-01 08:29:35",
      "ctm_id": 1,
      "item_id": 9,
      "ctm_nm": "임윤아",
      "item_nm": "어썸파운데이션",
      "item_price": "28000"
    }
```

