## 野爹社区

## 资料
[spring文档](https://spring.io/guides/)

[Spring Web文档](https://spring.io/guides/gs/serving-web-content/)

[es社区](https://elasticsearch.cn/)

[BootStrap文档](https://v3.bootcss.com/getting-started/)

[Github OAuth](https://www.bilibili.com/video/av65117012?p=8)


## 工具
[git下载工具](https://git-scm.com/downloads)

[Visual Paradigm](https://www.visual-paradigm.com/cn/)

## 脚本
```sql
create table USER
(
	ID INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_F7D4F462_5BEF_4C7C_83A2_1ED30A591D79) auto_increment,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT,
	constraint USER_PK
		primary key (ID)
);


```

