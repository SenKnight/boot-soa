DROP TABLE IF EXISTS user;
/*USER表*/
CREATE TABLE USER (
  ID char(13) NOT NULL COMMENT 'ID',
  NAME varchar(10) NOT NULL COMMENT '用户名',
  CODE varchar(10) NOT NULL COMMENT '用户编码',
  PASSWORD varchar(15) NOT NULL COMMENT '用户密码',
  PHONE char(11) DEFAULT NULL COMMENT '用户手机',
  AGE int(11) DEFAULT NULL COMMENT '用户年龄',
  PRIMARY KEY (ID),
  UNIQUE KEY CODE (CODE)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;