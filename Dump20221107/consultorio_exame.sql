-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: consultorio
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `exame`
--

DROP TABLE IF EXISTS `exame`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exame` (
  `cd_Exame` int NOT NULL AUTO_INCREMENT,
  `nm_Paciente` varchar(40) DEFAULT NULL,
  `ds_Exame` varchar(60) DEFAULT NULL,
  `ds_Resultado` varchar(100) DEFAULT NULL,
  `dt_Exame` date DEFAULT NULL,
  PRIMARY KEY (`cd_Exame`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exame`
--

LOCK TABLES `exame` WRITE;
/*!40000 ALTER TABLE `exame` DISABLE KEYS */;
INSERT INTO `exame` VALUES (1,'Leonardo','Endoscopia','Exame detectou alterações no estômago','1990-02-21'),(10,'Antonio','Laringoscopia','Exame detectou alterações na laringe','2010-10-31'),(12,'Maria','Exame de Sangue','Alto indice glicêmico','2022-01-12'),(13,'Joana','Mamografia','Sem alterações anormais','2015-12-30'),(16,'Raquel','Endocrinológico ','Hormônios normais','2020-02-12'),(24,'Leandro ','Toque','Ex-gordo','2022-10-28'),(25,'Rodinei','Radiografia','Problema no joelho','2022-09-28');
/*!40000 ALTER TABLE `exame` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-07 16:08:45
