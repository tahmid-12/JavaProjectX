-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2017 at 08:05 AM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `Name` varchar(30) DEFAULT NULL,
  `Address` varchar(40) DEFAULT NULL,
  `PhoneNumber` varchar(20) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Amount` decimal(15,5) DEFAULT NULL,
  `Username` varchar(10) DEFAULT NULL,
  `Password` varchar(15) DEFAULT NULL,
  `Repassword` varchar(15) DEFAULT NULL,
  `PersonId` varchar(15) NOT NULL,
  `Gender` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`Name`, `Address`, `PhoneNumber`, `Email`, `Amount`, `Username`, `Password`, `Repassword`, `PersonId`, `Gender`) VALUES
('Md.Tahmid Chowdhury', 'Wari', '01850452070', 'mdtahmid12@gmail.com', '15000.00000', 'tahmid_12', 'the123456', 'the123456', '8855141', 'Male');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`PersonId`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
