```
CREATE TABLE `tbl_product` (
  `pid` int(11) NOT NULL,
  `pname` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `pdesc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

```
INSERT INTO `tbl_product` VALUES ('1', 'iphone7', '888', '对这款手机表示呵呵哒');
INSERT INTO `tbl_product` VALUES ('2', '华为P系列', '6666', '支持国产');
INSERT INTO `tbl_product` VALUES ('3', '小米', '1333', '国产中的战斗机');
INSERT INTO `tbl_product` VALUES ('4', '三星', '2222', '面瘫的棒子');
INSERT INTO `tbl_product` VALUES ('5', 'Nokia', '555', '好怀念');
INSERT INTO `tbl_product` VALUES ('6', '魅族', '222', '好尴尬');
```
