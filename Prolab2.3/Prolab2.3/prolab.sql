-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 01, 2019 at 04:01 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prolab`
--

-- --------------------------------------------------------

--
-- Table structure for table `manufacturer`
--

CREATE TABLE `manufacturer` (
  `Companyname` varchar(30) DEFAULT NULL,
  `City` varchar(30) DEFAULT NULL,
  `rawmaterials` varchar(30) DEFAULT NULL,
  `materialcosts` int(11) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `product` varchar(30) DEFAULT NULL,
  `components` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manufacturer`
--

INSERT INTO `manufacturer` (`Companyname`, `City`, `rawmaterials`, `materialcosts`, `stock`, `product`, `components`) VALUES
('OzDilek', 'Istanbul', 'iron', 2000, 5000, 'table', 'iron');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `ID` int(11) NOT NULL,
  `Companyname` varchar(30) DEFAULT NULL,
  `Country` varchar(20) DEFAULT NULL,
  `Products` varchar(30) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL,
  `Productiondate` varchar(10) DEFAULT NULL,
  `Shelflife` int(11) DEFAULT NULL,
  `Saleprice` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`ID`, `Companyname`, `Country`, `Products`, `Quantity`, `Productiondate`, `Shelflife`, `Saleprice`) VALUES
(1, 'BlackWake', 'Sweden', 'carbon', 500, '13052019', 4, 1200),
(2, 'MineSearcher', 'Norway', 'iron', 1000, '13052019', 20, 500),
(3, 'MinerBrothers', 'Bulgaria', 'copper', 12000, '13052019', 10, 5000),
(4, 'DiggerCaseys', 'Mexico', 'silver', 4000, '13052019', 15, 20000),
(5, 'GoldMiner', 'Zambiya', 'gold', 200, '20102010', 40, 200000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
