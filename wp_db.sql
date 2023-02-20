-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 24, 2023 at 12:57 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wp_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_table`
--

CREATE TABLE `admin_table` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_table`
--

INSERT INTO `admin_table` (`username`, `password`) VALUES
('Joe pascua', '202cb962ac59075b964b07152d234b70'),
('asd', 'a8f5f167f44f4964e6c998dee827110c'),
('joe', '2f2923f3c15c844d4ad7352d919ebef3');

-- --------------------------------------------------------

--
-- Table structure for table `drivers_info`
--

CREATE TABLE `drivers_info` (
  `driver_ID` int(11) NOT NULL,
  `plate_number` varchar(100) NOT NULL,
  `car_brand` varchar(100) NOT NULL,
  `time_in` varchar(100) NOT NULL,
  `time_out` varchar(100) NOT NULL,
  `payment` int(11) NOT NULL,
  `date` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `drivers_info`
--

INSERT INTO `drivers_info` (`driver_ID`, `plate_number`, `car_brand`, `time_in`, `time_out`, `payment`, `date`) VALUES
(1, 'BXA23B', 'Toyota', '9:46pm', '10:00pm', 250, '1/21/23'),
(2, 'XAAT2312', 'NISSAN', '9:46pm', '10:00pm', 250, '1/21/23'),
(3, 'XAET13CR', 'NISSAN', '9:46pm', '10:00pm', 0, '1/21/23');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `drivers_info`
--
ALTER TABLE `drivers_info`
  ADD PRIMARY KEY (`driver_ID`),
  ADD UNIQUE KEY `plate_number` (`plate_number`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `drivers_info`
--
ALTER TABLE `drivers_info`
  MODIFY `driver_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
