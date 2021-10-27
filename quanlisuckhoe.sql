-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.26 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for quanlisuckhoe
CREATE DATABASE IF NOT EXISTS `quanlisuckhoe` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `quanlisuckhoe`;

-- Dumping structure for table quanlisuckhoe.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `IDAdmin` int unsigned NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoDienThoai` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`IDAdmin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.admin: ~0 rows (approximately)
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.capnhatloikhuyen
CREATE TABLE IF NOT EXISTS `capnhatloikhuyen` (
  `IDAdmin` int unsigned NOT NULL,
  `TheTrang` int NOT NULL,
  `NgayCapNhat` date NOT NULL,
  KEY `IDAdmin` (`IDAdmin`),
  KEY `TheTrang` (`TheTrang`),
  CONSTRAINT `FK_capnhatloikhuyen_admin` FOREIGN KEY (`IDAdmin`) REFERENCES `admin` (`IDAdmin`) ON UPDATE RESTRICT,
  CONSTRAINT `FK_capnhatloikhuyen_loikhuyen` FOREIGN KEY (`TheTrang`) REFERENCES `loikhuyen` (`TheTrang`) ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.capnhatloikhuyen: ~0 rows (approximately)
/*!40000 ALTER TABLE `capnhatloikhuyen` DISABLE KEYS */;
/*!40000 ALTER TABLE `capnhatloikhuyen` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.capnhattrungtam
CREATE TABLE IF NOT EXISTS `capnhattrungtam` (
  `IDAdmin` int unsigned NOT NULL,
  `IDTrungTam` int NOT NULL,
  `NgayCapNhat` date NOT NULL,
  KEY `IDAdmin` (`IDAdmin`),
  KEY `IDTrungTam` (`IDTrungTam`),
  CONSTRAINT `FK_capnhattrungtam_admin` FOREIGN KEY (`IDAdmin`) REFERENCES `admin` (`IDAdmin`) ON UPDATE RESTRICT,
  CONSTRAINT `FK_capnhattrungtam_trungtam` FOREIGN KEY (`IDTrungTam`) REFERENCES `trungtam` (`IDTrungTam`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.capnhattrungtam: ~0 rows (approximately)
/*!40000 ALTER TABLE `capnhattrungtam` DISABLE KEYS */;
/*!40000 ALTER TABLE `capnhattrungtam` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.loikhuyen
CREATE TABLE IF NOT EXISTS `loikhuyen` (
  `TheTrang` int NOT NULL AUTO_INCREMENT,
  `TapLuyen` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Đinhuong` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`TheTrang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.loikhuyen: ~0 rows (approximately)
/*!40000 ALTER TABLE `loikhuyen` DISABLE KEYS */;
/*!40000 ALTER TABLE `loikhuyen` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.nhapthongtinvaloikhuyen
CREATE TABLE IF NOT EXISTS `nhapthongtinvaloikhuyen` (
  `UserID` int unsigned NOT NULL,
  `Day` date NOT NULL,
  `ChieuCao` int NOT NULL,
  `CanNang` int NOT NULL,
  `BMI` float NOT NULL,
  `TheTrang` int NOT NULL DEFAULT '0',
  KEY `UserID` (`UserID`),
  KEY `Day` (`Day`),
  KEY `TT` (`TheTrang`),
  CONSTRAINT `FK_nhapthongtinvaloikhuyen_loikhuyen` FOREIGN KEY (`TheTrang`) REFERENCES `loikhuyen` (`TheTrang`) ON UPDATE RESTRICT,
  CONSTRAINT `FK_nhapthongtinvaloikhuyen_user` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.nhapthongtinvaloikhuyen: ~0 rows (approximately)
/*!40000 ALTER TABLE `nhapthongtinvaloikhuyen` DISABLE KEYS */;
/*!40000 ALTER TABLE `nhapthongtinvaloikhuyen` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.trungtam
CREATE TABLE IF NOT EXISTS `trungtam` (
  `IDTrungTam` int NOT NULL AUTO_INCREMENT,
  `TenTrungTam` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `DiaChi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoDienThoai` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`IDTrungTam`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.trungtam: ~0 rows (approximately)
/*!40000 ALTER TABLE `trungtam` DISABLE KEYS */;
/*!40000 ALTER TABLE `trungtam` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.user
CREATE TABLE IF NOT EXISTS `user` (
  `UserID` int unsigned NOT NULL AUTO_INCREMENT,
  `HoDem` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Ten` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Ngaysinh` date NOT NULL,
  `DiaChi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoDienThoai` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.user: ~0 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
