-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: db_comedor
-- ------------------------------------------------------
-- Server version	5.5.56

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `reportediario`
--

DROP TABLE IF EXISTS `reportediario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reportediario` (
  `id_empleado` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `area` varchar(45) DEFAULT NULL,
  `tipocomida` varchar(45) DEFAULT NULL,
  `hora` varchar(45) NOT NULL,
  `Asistencia` varchar(45) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`hora`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reportediario`
--

LOCK TABLES `reportediario` WRITE;
/*!40000 ALTER TABLE `reportediario` DISABLE KEYS */;
INSERT INTO `reportediario` VALUES ('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','00:15:19 PM','','2017-10-05'),('437818,','ALVAREZ NAVARRETE, JULIO ALBERTO','Sistemas','Normal','00:43:08 AM','','2017-10-07'),('437818,','ALVAREZ NAVARRETE, JULIO ALBERTO','Sistemas','Normal','00:47:26 AM','','2017-10-07'),('430089,','APODACA MONGE, VICTORIA ROMELIA','Recursos Humanos','Normal','00:49:22 AM','','2017-10-07'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','01:02:57 PM','','2017-10-05'),('290632,','SOTO GUERRA, DIEGO RAUL','Interiores 1er Turno','Normal','01:03:14 PM','','2017-10-05'),('290795,','LOPEZ VAZQUEZ, MIGUEL ANGEL','Acabado 1er Turno','Normal','01:03:33 PM','','2017-10-05'),('307375,','SOSA CHAVEZ, JESUS ANTONIO','Entrenamiento','Normal','01:14:47 PM','','2017-10-05'),('309038,','VAZQUEZ PAYAN, SERGIO OCTAVIO','Molduradoras','Normal','01:15:16 PM','','2017-10-05'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','01:16:07 PM','','2017-10-05'),('297916,','VALDEZ FLORES, PRIMITIVO','Mantenimiento 1er Turno','LIGHT','01:16:28 AM','Tiempo Extra','2017-10-05'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','01:16:47 AM','Tiempo Extra','2017-10-05'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','01:17:06 AM','Tiempo Extra','2017-10-05'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','01:41:59 PM','Alerta!! Estas fuera de Hora','2017-10-04'),('476724,','','','','02:54:48 PM','','2017-10-05'),('424146,','BARANDA LAURENCIO, FRIDA DANIELA','Recursos Humanos','Normal','02:55:06 PM','','2017-10-05'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','03:03:40 PM','Alerta!! Estas fuera de Hora','2017-10-04'),('437818,','ALVAREZ NAVARRETE, JULIO ALBERTO','Sistemas','Normal','03:04:50 PM','Alerta!! Estas fuera de Hora','2017-10-04'),('437818,','ALVAREZ NAVARRETE, JULIO ALBERTO','Sistemas','Normal','03:15:06 PM','','2017-10-05'),('424146,','BARANDA LAURENCIO, FRIDA DANIELA','Recursos Humanos','Normal','03:15:22 PM','','2017-10-05'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','03:21:07 PM','','2017-10-04'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','03:35:09 PM','','2017-10-04'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','03:36:13 PM','','2017-10-04'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','03:40:05 PM','','2017-10-04'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','04:25:43 PM','Tiempo Extra Primer turno','2017-10-04'),('437818,','ALVAREZ NAVARRETE, JULIO ALBERTO','Sistemas','Normal','04:26:17 PM','Tiempo Extra Primer turno','2017-10-04'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','04:27:31 PM','TIEMPO EXTRA PRIMER TURNO','2017-10-04'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','04:31:19 PM','','2017-10-04'),('437818,','ALVAREZ NAVARRETE, JULIO ALBERTO','Sistemas','Normal','04:43:30 PM','Alerta!! Estas fuera de Hora','2017-10-04'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','04:49:26 AM','','2017-10-05'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','04:50:17 PM','Tiempo Extra','2017-10-05'),('306285,','MIRAMONTES LEON, EDUARDO GUADALUPE','Control de Calidad','Normal','04:50:32 PM','Tiempo Extra','2017-10-05'),('296806,','DURAN HOLGUIN, JESUS','Ingenieria','Normal','04:51:16 PM','','2017-10-05'),('437818,','ALVAREZ NAVARRETE, JULIO ALBERTO','Sistemas','Normal','05:56:35 PM','','2017-10-03'),('437818,','ALVAREZ NAVARRETE, JULIO ALBERTO','Sistemas','Normal','07:02:45 PM','','2017-10-09'),('437818,','ALVAREZ NAVARRETE, JULIO ALBERTO','Sistemas','Normal','07:23:42 PM','Excelente','2017-10-04'),('437818,','ALVAREZ NAVARRETE, JULIO ALBERTO','Sistemas','Normal','07:25:13 PM','Excelente','2017-10-04'),('430893,','MAYNEZ ESCOBEDO, BRENDA MICHELLE','Ingenieria','Normal','08:16:29 AM','','2017-10-06'),('461851,','OCHOA CARRILLO, MONICA DANIELA','Recursos Humanos','Normal','08:18:53 AM','','2017-10-06'),('450772,','MEZA TAPIA, MARIA SARAHI','Contraloria','Normal','08:19:18 AM','','2017-10-06'),('424146,','BARANDA LAURENCIO, FRIDA DANIELA','Recursos Humanos','Normal','08:19:38 AM','','2017-10-06'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','09:14:00 AM','','2017-10-05'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','11:33:49 AM','','2017-10-05'),('442238,','HERNANDEZ DE LA ROSA, EDUARDO','Sistemas','LIGHT','11:34:33 AM','Tiempo Extra','2017-10-05'),('290625,','NUNEZ MONTANEZ, MANUEL','Gerencia de Planta','Normal','11:35:18 AM','Tiempo Extra','2017-10-05'),('290634,','PENA SOLIS, TEOFILO','Mantenimiento 1er Turno','Normal','11:37:15 AM','Tiempo Extra','2017-10-05'),('295036,','SAENZ QUIROZ, MANUEL ARMANDO','Produccion 2do. Turno','Normal','11:39:29 AM','','2017-10-05');
/*!40000 ALTER TABLE `reportediario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-09 20:41:35
