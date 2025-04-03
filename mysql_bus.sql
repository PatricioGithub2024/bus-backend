-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: bus_civa
-- ------------------------------------------------------
-- Server version	8.4.3

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bus`
--

DROP TABLE IF EXISTS `bus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bus` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numero_bus` varchar(10) NOT NULL,
  `placa` varchar(15) NOT NULL,
  `fecha_creacion` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `caracteristicas` text,
  `marca_id` int NOT NULL,
  `activo` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `placa` (`placa`),
  KEY `marca_id` (`marca_id`),
  CONSTRAINT `bus_ibfk_1` FOREIGN KEY (`marca_id`) REFERENCES `marca` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bus`
--

LOCK TABLES `bus` WRITE;
/*!40000 ALTER TABLE `bus` DISABLE KEYS */;
INSERT INTO `bus` VALUES (1,'001','ABC-123','2025-03-31 21:29:43','Bus con aire acondicionado y WiFi',1,1),(2,'002','XYZ-456','2025-03-31 21:29:43','Bus de dos pisos con asientos reclinables',2,1),(3,'003','LMN-789','2025-03-31 21:29:43','Bus urbano con acceso para discapacitados',3,0),(4,'004','QWE-987','2025-03-31 21:29:43','Bus interprovincial con baño y TV',4,1),(15,'B001','ABS-123','2025-04-03 05:34:15','Asientos reclinables, aire acondicionado',1,1),(16,'B002','DEF-456','2025-04-03 05:34:15','WiFi, cargadores USB',2,1),(17,'B003','GHI-789','2025-04-03 05:34:15','Doble piso, entretenimiento a bordo',3,1),(18,'B004','JKL-101','2025-04-03 05:34:15','Sistema de seguridad avanzado',4,1),(19,'B005','MNO-202','2025-04-03 05:34:15','Baño a bordo, servicio de bebidas',3,1),(20,'B006','PQR-303','2025-04-03 05:34:15','Ventanas panorámicas',1,1),(21,'B007','STU-404','2025-04-03 05:34:15','Accesible para personas con discapacidad',2,1),(22,'B008','VWX-505','2025-04-03 05:34:15','Motor híbrido, ecológico',3,1),(23,'B009','YZA-606','2025-04-03 05:34:15','Servicio de TV en cada asiento',4,1),(24,'B010','BCD-707','2025-04-03 05:34:15','Asientos de lujo, climatización',2,1);
/*!40000 ALTER TABLE `bus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

LOCK TABLES `marca` WRITE;
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` VALUES (4,'MAN'),(3,'Mercedes-Benz'),(2,'Scania'),(1,'Volvo');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'bus_civa'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-03 10:50:03
