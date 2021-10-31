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
  `IDAdmin` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `HoTen` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `SoDienThoai` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`IDAdmin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.admin: ~4 rows (approximately)
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`IDAdmin`, `HoTen`, `SoDienThoai`, `Email`) VALUES
	('12345', '12345', '12345', '12345'),
	('123456', '12345', '12345', '12345'),
	('admin', 'admin', '0329689087', 'nhuan@gmail.com'),
	('nhuan12', 'Bùi Cảnh Nhuận', '0329689087', 'nhuan123@gmail.com');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.capnhatloikhuyen
CREATE TABLE IF NOT EXISTS `capnhatloikhuyen` (
  `IDAdmin` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `TheTrang` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgayCapNhat` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`IDAdmin`,`TheTrang`,`NgayCapNhat`) USING BTREE,
  KEY `FK_capnhatloikhuyen_loikhuyen` (`TheTrang`),
  CONSTRAINT `FK_capnhatloikhuyen_admin` FOREIGN KEY (`IDAdmin`) REFERENCES `admin` (`IDAdmin`),
  CONSTRAINT `FK_capnhatloikhuyen_loikhuyen` FOREIGN KEY (`TheTrang`) REFERENCES `loikhuyen` (`TheTrang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.capnhatloikhuyen: ~0 rows (approximately)
/*!40000 ALTER TABLE `capnhatloikhuyen` DISABLE KEYS */;
/*!40000 ALTER TABLE `capnhatloikhuyen` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.capnhattrungtam
CREATE TABLE IF NOT EXISTS `capnhattrungtam` (
  `IDAdmin` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `IDTrungTam` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgayCapNhat` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`IDAdmin`,`IDTrungTam`),
  KEY `FK_capnhattrungtam_trungtam` (`IDTrungTam`),
  CONSTRAINT `FK_capnhattrungtam_admin` FOREIGN KEY (`IDAdmin`) REFERENCES `admin` (`IDAdmin`),
  CONSTRAINT `FK_capnhattrungtam_trungtam` FOREIGN KEY (`IDTrungTam`) REFERENCES `trungtam` (`IDTrungTam`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.capnhattrungtam: ~0 rows (approximately)
/*!40000 ALTER TABLE `capnhattrungtam` DISABLE KEYS */;
/*!40000 ALTER TABLE `capnhattrungtam` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.loikhuyen
CREATE TABLE IF NOT EXISTS `loikhuyen` (
  `TheTrang` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TapLuyen` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `DinhDuong` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`TheTrang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.loikhuyen: ~0 rows (approximately)
/*!40000 ALTER TABLE `loikhuyen` DISABLE KEYS */;
INSERT INTO `loikhuyen` (`TheTrang`, `TapLuyen`, `DinhDuong`) VALUES
	('Bình thường', 'Nên tập luyện 30 phút mỗi ngày để duy trì sức khỏe', 'Ăn uống điều độ, hạn chế rượu bia, thuốc lá');
/*!40000 ALTER TABLE `loikhuyen` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.nhapthongtinvaloikhuyen
CREATE TABLE IF NOT EXISTS `nhapthongtinvaloikhuyen` (
  `UserID` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Day` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ChieuCao` double NOT NULL DEFAULT '0',
  `CanNang` double NOT NULL DEFAULT '0',
  `BMI` double NOT NULL DEFAULT '0',
  `TheTrang` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`UserID`,`Day`),
  KEY `FK_nhapthongtinvaloikhuyen_loikhuyen` (`TheTrang`),
  CONSTRAINT `FK_nhapthongtinvaloikhuyen_loikhuyen` FOREIGN KEY (`TheTrang`) REFERENCES `loikhuyen` (`TheTrang`),
  CONSTRAINT `FK_nhapthongtinvaloikhuyen_user` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.nhapthongtinvaloikhuyen: ~0 rows (approximately)
/*!40000 ALTER TABLE `nhapthongtinvaloikhuyen` DISABLE KEYS */;
INSERT INTO `nhapthongtinvaloikhuyen` (`UserID`, `Day`, `ChieuCao`, `CanNang`, `BMI`, `TheTrang`) VALUES
	('nhuan1234', 'java.text.SimpleDateFormat@d936eac0', 1.6, 65, 20.3125, 'Bình thường'),
	('nhuan12345', 'java.text.SimpleDateFormat@d936eac0', 1.6, 65, 20.3125, 'Bình thường'),
	('nhuan123456', '31/10/2021', 1.6, 65, 20.3125, 'Bình thường');
/*!40000 ALTER TABLE `nhapthongtinvaloikhuyen` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.taikhoan
CREATE TABLE IF NOT EXISTS `taikhoan` (
  `UserID` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `MatKhau` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`UserID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.taikhoan: ~8 rows (approximately)
/*!40000 ALTER TABLE `taikhoan` DISABLE KEYS */;
INSERT INTO `taikhoan` (`UserID`, `MatKhau`) VALUES
	('admin', '12345'),
	('nhuan1234', '12345'),
	('nhuan12345', '12345'),
	('nhuan123456', '1234'),
	('nhuan1234567', '123456'),
	('nt0000', '12345'),
	('nt0123', '12345'),
	('nt01234', '123456');
/*!40000 ALTER TABLE `taikhoan` ENABLE KEYS */;

-- Dumping structure for table quanlisuckhoe.trungtam
CREATE TABLE IF NOT EXISTS `trungtam` (
  `IDTrungTam` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
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
  `UserID` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'AUTO_INCREMENT',
  `HoDem` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Ten` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `NgaySinh` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
  `DiaChi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `SDT` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- Dumping data for table quanlisuckhoe.user: ~7 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`UserID`, `HoDem`, `Ten`, `NgaySinh`, `DiaChi`, `SDT`) VALUES
	('nhuan1234', 'Bui', 'Nhuan', '20/07/2001', 'Phu Tho', '0329689087'),
	('nhuan12345', 'Bui', 'Nhuan', '20/07/2001', 'Phu Tho', '0329689087'),
	('nhuan123456', 'Bùi Cảnh Nhuận', 'Cảnh', '20/07/2001', 'Phú Thọ', '0329689087'),
	('nhuan1234567', 'Bùi', 'Nhuận', '20/07/2007', 'Phú Thọ', '0329689087'),
	('nt0000', 'nt', 'h', '20/07/2001', 'Phú Thọ', '0329689087'),
	('nt0123', 'Bùi', 'Nhuận', '20/07/2001', 'Phú Thọ', '0329689087'),
	('nt01234', 'Bùi ', 'Nhuận', '20/07/2001', 'Phú Thọ', '0329689087');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
