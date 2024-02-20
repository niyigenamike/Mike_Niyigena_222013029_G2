-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 20, 2024 at 04:16 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schooladmin`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE `adminlogin` (
  `Name` varchar(90) DEFAULT NULL,
  `ID` varchar(90) NOT NULL,
  `Password` varchar(90) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`Name`, `ID`, `Password`) VALUES
('mike', '12', 'mike'),
('mmmm', '90797', 'mmmm');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `name` varchar(90) DEFAULT NULL,
  `contact` varchar(90) DEFAULT NULL,
  `age` varchar(90) DEFAULT NULL,
  `gender` varchar(90) DEFAULT NULL,
  `saraly` varchar(90) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `id` int(11) NOT NULL,
  `stud_id` int(11) DEFAULT NULL,
  `course` varchar(90) DEFAULT NULL,
  `marks` varchar(90) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `stdrec`
--

CREATE TABLE `stdrec` (
  `SchNo` int(11) NOT NULL,
  `Name` varchar(90) DEFAULT NULL,
  `FatherName` varchar(90) DEFAULT NULL,
  `MotherName` varchar(90) DEFAULT NULL,
  `DOB` varchar(90) DEFAULT NULL,
  `Cno` varchar(90) DEFAULT NULL,
  `Address` varchar(90) DEFAULT NULL,
  `DOA` varchar(90) DEFAULT NULL,
  `COA` varchar(90) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stdrec`
--

INSERT INTO `stdrec` (`SchNo`, `Name`, `FatherName`, `MotherName`, `DOB`, `Cno`, `Address`, `DOA`, `COA`) VALUES
(1, 'niyigena mike', 'habimana viateur', 'murekatete thoidosie', '1995/1/1', '123567890', 'rusizi', '2003/1/1', 'UKG'),
(111, 'mike', 'mike', 'mike', '1995/1/1', '1111', 'mike', '2003/1/1', 'UKG');

-- --------------------------------------------------------

--
-- Table structure for table `teacherrec`
--

CREATE TABLE `teacherrec` (
  `Tid` int(11) NOT NULL,
  `Name` varchar(90) DEFAULT NULL,
  `Dept` varchar(90) DEFAULT NULL,
  `DOB` varchar(90) DEFAULT NULL,
  `Cno` varchar(90) DEFAULT NULL,
  `Address` varchar(90) DEFAULT NULL,
  `Position` varchar(90) DEFAULT NULL,
  `Salary` varchar(90) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacherrec`
--

INSERT INTO `teacherrec` (`Tid`, `Name`, `Dept`, `DOB`, `Cno`, `Address`, `Position`, `Salary`) VALUES
(2, 'mike', 'Physics', '1956/1/1', '12345678', 'kamembe', 'HOD', '200000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminlogin`
--
ALTER TABLE `adminlogin`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `marks`
--
ALTER TABLE `marks`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `stdrec`
--
ALTER TABLE `stdrec`
  ADD PRIMARY KEY (`SchNo`);

--
-- Indexes for table `teacherrec`
--
ALTER TABLE `teacherrec`
  ADD PRIMARY KEY (`Tid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `marks`
--
ALTER TABLE `marks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
