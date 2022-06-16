-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 14, 2021 at 11:03 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

CREATE DATABASE `universityapplication`;

--
-- Database: `universityapplication`
--

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE `comment` (
  `id` int(10) NOT NULL,
  `text` varchar(160) NOT NULL,
  `user` varchar(32) NOT NULL,
  `subjectId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--


-- --------------------------------------------------------

--
-- Table structure for table `friends`
--

CREATE TABLE `friends` (
  `userId` int(10) NOT NULL,
  `friendId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



-- --------------------------------------------------------

--
-- Table structure for table `major`
--

CREATE TABLE `major` (
  `id` int(10) NOT NULL,
  `name` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `major`
--

INSERT INTO `major` (`id`, `name`) VALUES
(1, 'Finance'),
(2, 'Computer Science'),
(3, 'Law');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `id` int(10) NOT NULL,
  `time` varchar(32) NOT NULL,
  `place` varchar(32) NOT NULL,
  `majorId` int(10) NOT NULL,
  `professor` varchar(32) NOT NULL,
  `name` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`id`, `time`, `place`, `majorId`, `professor`, `name`) VALUES
(1, 'Thu 10:00', 'Lab 1', 1, 'Professor 1', 'Finance 1'),
(2, 'Thu 12:00', 'Lab 2', 1, 'Professor 2', 'Finance 2'),
(3, 'Fri 12:00', 'Lab 1', 1, 'Professor 1', 'Finance 3'),
(4, 'Fri 10:00', 'Lab 3', 1, 'Professor 3', 'Finance 4'),
(5, 'Tue 12:00', 'Lab 1', 1, 'Professor 2', 'Finance 5'),
(6, 'Wed 12:00', 'Lab 3', 1, 'Professor 3', 'Finance 6'),
(7, 'Wed 10:00', 'Lab 2', 1, 'Professor 3', 'Finance 7'),
(8, 'Wed 12:00', 'Lab 2', 2, 'Professor 4', 'Computer Science 1'),
(9, 'Fri 12:00', 'Lab 4', 2, 'Professor 5', 'Computer Science 2'),
(10, 'Mon 10:00', 'Lab 3', 2, 'Professor 4', 'Computer Science 3'),
(11, 'Mon 12:00', 'Lab 3', 2, 'Professor 6', 'Computer Science 4'),
(12, 'Tue 10:00', 'Lab 5', 2, 'Professor 5', 'Computer Science 5'),
(13, 'Wed 12:00', 'Lab 4', 2, 'Professor 4', 'Computer Science 6'),
(14, 'Thu 12:00', 'Lab 7', 2, 'Professor 4', 'Computer Science 7'),
(15, 'Fri 12:00', 'Lab 6', 3, 'Professor 7', 'Law 1'),
(16, 'Fri 12:00', 'Lab 6', 3, 'Professor 6', 'Law 2'),
(17, 'Mon 10:00', 'Lab 7', 3, 'Professor 8', 'Law 3'),
(18, 'Mon 12:00', 'Lab 7', 3, 'Professor 7', 'Law 4'),
(19, 'Tue 10:00', 'Lab 8', 3, 'Professor 9', 'Law 5'),
(20, 'Wed 12:00', 'Lab 8', 3, 'Professor 8', 'Law 6'),
(21, 'Thu 12:00', 'Lab 8', 3, 'Professor 6', 'Law 7');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(10) NOT NULL,
  `name` varchar(32) NOT NULL,
  `surname` varchar(32) NOT NULL,
  `email` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `major` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--

-- --------------------------------------------------------

--
-- Table structure for table `usersubject`
--

CREATE TABLE `usersubject` (
  `userId` int(10) NOT NULL,
  `subjectId` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



--
-- Indexes for dumped tables
--

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `major`
--
ALTER TABLE `major`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comment`
--
ALTER TABLE `comment`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `major`
--
ALTER TABLE `major`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `subjects`
--
ALTER TABLE `subjects`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
