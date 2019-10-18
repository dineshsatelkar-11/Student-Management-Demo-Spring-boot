-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.67-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema studenttable
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ studenttable;
USE studenttable;

--
-- Table structure for table `studenttable`.`student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `avg` double NOT NULL,
  `chemistry` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `maths` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `physics` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studenttable`.`student`
--

/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`,`avg`,`chemistry`,`email`,`maths`,`name`,`physics`,`total`) VALUES 
 (1,85,85,'niteshsatelkar@gmail.com',85,'Nitest',85,255),
 (2,0,0,'akshayp@gmail.com',0,'Akshay',0,0),
 (3,0,0,'snehasatoskar@gmail.com',0,'sneha',0,0);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;


--
-- Table structure for table `studenttable`.`teacher`
--

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `marks` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `studentid` bigint(20) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studenttable`.`teacher`
--

/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` (`id`,`marks`,`name`,`studentid`,`subject`) VALUES 
 (1,85,'Nikhil',1,'Chemistry'),
 (2,85,'Govind',1,'Maths'),
 (3,85,'Akash',1,'Physics');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
