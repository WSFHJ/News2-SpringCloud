/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.5.27 : Database - mybatisdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatisdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybatisdb`;

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `category` */

insert  into `category`(`id`,`cname`) values (1,'军事');
insert  into `category`(`id`,`cname`) values (2,'国际');
insert  into `category`(`id`,`cname`) values (3,'国内');
insert  into `category`(`id`,`cname`) values (4,'娱乐');
insert  into `category`(`id`,`cname`) values (5,'游戏');
insert  into `category`(`id`,`cname`) values (6,'综艺');
insert  into `category`(`id`,`cname`) values (7,'看点');

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoryid` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `summary` varchar(500) NOT NULL,
  `author` varchar(50) NOT NULL,
  `createdate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `news` */

insert  into `news`(`id`,`categoryid`,`title`,`summary`,`author`,`createdate`) values (1,1,'中国若武统 美军出手也没用','海外网11月15日电美国一份提交给国会的报告宣称，美军的震慑能力正在弱化','海外网','2019-06-04 10:49:24');
insert  into `news`(`id`,`categoryid`,`title`,`summary`,`author`,`createdate`) values (2,3,'习近平会见巴布亚新几内亚总督达达埃','新华社莫尔兹比港11月16日电（记者黄尹甲子蒋国鹏）国家主席习近平16日在莫尔兹比港会见巴布亚新几内亚总督达达埃。','新华网','2019-06-04 10:49:24');
insert  into `news`(`id`,`categoryid`,`title`,`summary`,`author`,`createdate`) values (3,2,'土耳其阿勒泰坦克终于量产 但是啥时候能生产出来？','11月9日，已经进行了多年的土耳其新一代主战坦克终于迎来了里程碑的时刻。土耳其国防工业管理部门（SSB）与土耳其BMC集团正式签署了价值数十亿美元的阿勒泰坦克生产合同。合同涉及首批250辆坦克的生产、全生命周期的后勤支持，以及由BMC建立坦克技术的研发中心作为合同的一部分','新华网','2019-06-04 10:49:24');
insert  into `news`(`id`,`categoryid`,`title`,`summary`,`author`,`createdate`) values (4,2,'国际赛事','要打比赛了。。。。。','张三','2019-06-22 19:56:59');
insert  into `news`(`id`,`categoryid`,`title`,`summary`,`author`,`createdate`) values (5,1,'军事报道','造了飞机。。。。。','王五','2019-06-19 19:58:45');
insert  into `news`(`id`,`categoryid`,`title`,`summary`,`author`,`createdate`) values (6,3,'国内报道','明星什么什么什么事','老王','2019-06-03 19:59:27');
insert  into `news`(`id`,`categoryid`,`title`,`summary`,`author`,`createdate`) values (9,7,'世界','你好','张三2019','2019-06-05 20:40:09');
insert  into `news`(`id`,`categoryid`,`title`,`summary`,`author`,`createdate`) values (10,2,'11','新年好','2019','2019-06-06 10:05:33');
insert  into `news`(`id`,`categoryid`,`title`,`summary`,`author`,`createdate`) values (12,3,'12','567','34','2019-06-06 10:46:03');
insert  into `news`(`id`,`categoryid`,`title`,`summary`,`author`,`createdate`) values (14,4,'66','233333333','666','2019-06-10 10:52:37');
insert  into `news`(`id`,`categoryid`,`title`,`summary`,`author`,`createdate`) values (15,4,'77','7777','777','2019-06-10 11:06:23');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
