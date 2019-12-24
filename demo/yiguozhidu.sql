/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : yiguozhidu

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2019-12-21 23:41:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl
-- ----------------------------
DROP TABLE IF EXISTS `tbl`;
CREATE TABLE `tbl` (
  `cid` int(10) NOT NULL AUTO_INCREMENT,
  `country` varchar(50) NOT NULL,
  `capital` varchar(50) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl
-- ----------------------------
INSERT INTO `tbl` VALUES ('1', '中国', '北京');
INSERT INTO `tbl` VALUES ('2', '美国', '纽约');
INSERT INTO `tbl` VALUES ('3', '日本', '东京');
INSERT INTO `tbl` VALUES ('4', '韩国', '首尔');
INSERT INTO `tbl` VALUES ('5', '朝鲜', '平壤');
INSERT INTO `tbl` VALUES ('6', '越南', '河内');
INSERT INTO `tbl` VALUES ('7', '泰国', '曼谷');
INSERT INTO `tbl` VALUES ('8', '俄罗斯', '莫斯科');
INSERT INTO `tbl` VALUES ('9', '新加坡', '新加坡');
INSERT INTO `tbl` VALUES ('10', '澳大利亚', '堪培拉');
INSERT INTO `tbl` VALUES ('11', '英国', '伦敦');
INSERT INTO `tbl` VALUES ('12', '德国', '柏林');
INSERT INTO `tbl` VALUES ('13', '希腊', '罗马');
INSERT INTO `tbl` VALUES ('14', '西班牙', '里斯本');
INSERT INTO `tbl` VALUES ('15', '马来西亚', '吉隆坡');
INSERT INTO `tbl` VALUES ('16', '印度', '新德里');
INSERT INTO `tbl` VALUES ('17', '菲律宾', '马尼拉');
INSERT INTO `tbl` VALUES ('18', '巴勒斯坦', '耶路撒冷');
INSERT INTO `tbl` VALUES ('19', '伊朗', '德黑兰');
INSERT INTO `tbl` VALUES ('20', '法国', '巴黎');
INSERT INTO `tbl` VALUES ('21', '意大利', '罗马');
INSERT INTO `tbl` VALUES ('22', '希腊', '雅典');
INSERT INTO `tbl` VALUES ('23', '波兰', '华沙');
INSERT INTO `tbl` VALUES ('24', '葡萄牙', '里斯本');
INSERT INTO `tbl` VALUES ('25', '比利时', '布鲁塞尔');
INSERT INTO `tbl` VALUES ('26', '奥地利', '维也纳');
INSERT INTO `tbl` VALUES ('27', '马尔代夫', '马累');
INSERT INTO `tbl` VALUES ('28', '埃及', '开罗');
INSERT INTO `tbl` VALUES ('29', '摩洛哥', '拉巴特');
INSERT INTO `tbl` VALUES ('30', '南非', '开普敦');
INSERT INTO `tbl` VALUES ('31', '刚果', '布拉柴维尔');
INSERT INTO `tbl` VALUES ('32', '尼日利亚', '阿布贾');
INSERT INTO `tbl` VALUES ('33', '埃塞俄比亚', '亚的斯亚贝巴');
INSERT INTO `tbl` VALUES ('34', '加拿大', '渥太华');
INSERT INTO `tbl` VALUES ('35', '秘鲁', '利马');
INSERT INTO `tbl` VALUES ('36', '巴西', '巴西利亚');
INSERT INTO `tbl` VALUES ('37', '牙买加', '金斯顿');
INSERT INTO `tbl` VALUES ('38', '乌拉圭', '蒙得维的亚');
INSERT INTO `tbl` VALUES ('39', '古巴', '哈瓦那');
INSERT INTO `tbl` VALUES ('40', '阿根廷', '布宜诺斯艾利斯');
INSERT INTO `tbl` VALUES ('41', '哥伦比亚', '圣菲波哥大');
INSERT INTO `tbl` VALUES ('42', '新西兰', '惠灵顿');
INSERT INTO `tbl` VALUES ('43', '巴基斯坦', '伊斯兰堡');
INSERT INTO `tbl` VALUES ('44', '缅甸', '内比都');
INSERT INTO `tbl` VALUES ('45', '斯里兰卡', '科伦坡');
INSERT INTO `tbl` VALUES ('46', '不丹', '延布');
INSERT INTO `tbl` VALUES ('47', '阿富汗', '喀布尔');
INSERT INTO `tbl` VALUES ('48', '孟加拉国', '达卡');
INSERT INTO `tbl` VALUES ('49', '也门', '萨那');
INSERT INTO `tbl` VALUES ('50', '文莱', '斯里巴加湾市');
INSERT INTO `tbl` VALUES ('51', '东帝汶', '帝力');
INSERT INTO `tbl` VALUES ('52', '约旦', '安曼');
INSERT INTO `tbl` VALUES ('53', '沙特阿拉伯', '利雅得');
INSERT INTO `tbl` VALUES ('54', '卡塔尔', '多哈');
INSERT INTO `tbl` VALUES ('55', '黎巴嫩', '贝鲁特');
INSERT INTO `tbl` VALUES ('56', '土耳其', '安卡拉');
INSERT INTO `tbl` VALUES ('57', '蒙古', '乌兰巴托');
INSERT INTO `tbl` VALUES ('58', '塞浦路斯', '尼克西亚');
INSERT INTO `tbl` VALUES ('59', '瑞士', '伯尔尼');
INSERT INTO `tbl` VALUES ('60', '摩纳哥', '摩纳哥');
INSERT INTO `tbl` VALUES ('61', '瑞典', '斯德哥尔摩');
INSERT INTO `tbl` VALUES ('62', '捷克', '布拉格');
INSERT INTO `tbl` VALUES ('63', '荷兰', '阿姆斯特丹');
INSERT INTO `tbl` VALUES ('64', '芬兰', '赫尔辛基');
INSERT INTO `tbl` VALUES ('65', '乌克兰', '基辅');
INSERT INTO `tbl` VALUES ('66', '冰岛', '雷克雅未克');
INSERT INTO `tbl` VALUES ('67', '安哥拉', '罗安达');
INSERT INTO `tbl` VALUES ('68', '中非', '班吉');
INSERT INTO `tbl` VALUES ('69', '几内亚', '科纳克里');
INSERT INTO `tbl` VALUES ('70', '马里', '巴马科');
INSERT INTO `tbl` VALUES ('71', '卢旺达', '基加利');
INSERT INTO `tbl` VALUES ('72', '加纳', '阿克拉');
INSERT INTO `tbl` VALUES ('73', '坦桑尼亚', '达累斯萨拉姆');
INSERT INTO `tbl` VALUES ('74', '索马里', '摩加迪沙');
INSERT INTO `tbl` VALUES ('75', '加蓬', '利伯维尔');
INSERT INTO `tbl` VALUES ('76', '苏丹', '喀土穆');
INSERT INTO `tbl` VALUES ('77', '科特迪瓦', '亚穆苏克罗');
INSERT INTO `tbl` VALUES ('78', '莫桑比克', '马普托');
INSERT INTO `tbl` VALUES ('79', '海地', '太子港');
INSERT INTO `tbl` VALUES ('80', '巴拉圭', '亚松森');
INSERT INTO `tbl` VALUES ('81', '委内瑞拉', '加拉加斯');
INSERT INTO `tbl` VALUES ('82', '伯利兹', '贝尔莫潘');
INSERT INTO `tbl` VALUES ('83', '厄瓜多尔', '基多');
INSERT INTO `tbl` VALUES ('84', '多米尼克', '罗索');
INSERT INTO `tbl` VALUES ('85', '苏里南', '帕拉马里博');
INSERT INTO `tbl` VALUES ('86', '帕劳', '梅莱凯奥克');
INSERT INTO `tbl` VALUES ('87', '所罗门群岛', '霍尼亚拉');
INSERT INTO `tbl` VALUES ('88', '斐济', '苏瓦');
INSERT INTO `tbl` VALUES ('89', '汤加', '努库阿洛法');
INSERT INTO `tbl` VALUES ('90', '萨尔瓦多', '圣萨尔瓦多');
INSERT INTO `tbl` VALUES ('91', '哈萨克斯坦', '阿斯塔纳');
INSERT INTO `tbl` VALUES ('92', '乌兹别克斯坦', '塔什干');
INSERT INTO `tbl` VALUES ('93', '吉尔吉斯斯坦', '比什凯克');
INSERT INTO `tbl` VALUES ('94', '塔吉克斯坦', '杜尚别');
INSERT INTO `tbl` VALUES ('95', '伊拉克', '巴格达');
INSERT INTO `tbl` VALUES ('96', '梵蒂冈', '梵蒂冈城');
INSERT INTO `tbl` VALUES ('97', '斯洛文尼亚', '卢布尔雅那');
INSERT INTO `tbl` VALUES ('98', '黑山', '波德戈里察');
INSERT INTO `tbl` VALUES ('99', '马耳他', '瓦莱塔');
INSERT INTO `tbl` VALUES ('100', '巴哈马', '拿骚');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` char(50) DEFAULT NULL,
  `password` char(50) DEFAULT NULL,
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('yiguozhidu001', '123456', '1');
INSERT INTO `user` VALUES ('yiguozhidu002', '123456', '2');
INSERT INTO `user` VALUES ('yiguozhidu003', '123456', '3');
INSERT INTO `user` VALUES ('caizelin', '12345', '93');
INSERT INTO `user` VALUES ('111', '1', '94');
INSERT INTO `user` VALUES ('1211', '1', '95');
INSERT INTO `user` VALUES ('12312', '12312', '96');
INSERT INTO `user` VALUES ('蔡泽林', '121', '97');
INSERT INTO `user` VALUES ('asd', 'asd', '98');
INSERT INTO `user` VALUES ('12111', '12111', '99');
INSERT INTO `user` VALUES ('12112', '12112', '100');
INSERT INTO `user` VALUES ('1234', '12', '101');
INSERT INTO `user` VALUES ('1234', '1234', '102');
