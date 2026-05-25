-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2026 at 03:59 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `abc training school`
--

-- --------------------------------------------------------

--
-- Table structure for table `classroom`
--

CREATE TABLE `classroom` (
  `RoomNo` int(11) NOT NULL,
  `Location` varchar(200) DEFAULT NULL,
  `SeatingCapacity` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `CourseCode` varchar(50) NOT NULL,
  `CourseName` varchar(45) NOT NULL,
  `Description` text NOT NULL,
  `Level` varchar(10) NOT NULL,
  `StaffNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `course_offering`
--

CREATE TABLE `course_offering` (
  `OfferingNo` int(11) NOT NULL,
  `StartDate` date NOT NULL,
  `TuitionFee` decimal(10,2) NOT NULL,
  `CourseCode` varchar(50) NOT NULL,
  `RoomNo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `enrollment`
--

CREATE TABLE `enrollment` (
  `StudentID` int(11) NOT NULL,
  `OfferingNo` int(11) NOT NULL,
  `EnrollmentDate` date DEFAULT NULL,
  `Grade` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `StudentID` int(11) NOT NULL,
  `SName` varchar(45) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Qualification` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tutor`
--

CREATE TABLE `tutor` (
  `StaffNo` int(11) NOT NULL,
  `TName` varchar(45) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `DateOfEmployment` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `classroom`
--
ALTER TABLE `classroom`
  ADD PRIMARY KEY (`RoomNo`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`CourseCode`),
  ADD KEY `StaffNo` (`StaffNo`);

--
-- Indexes for table `course_offering`
--
ALTER TABLE `course_offering`
  ADD PRIMARY KEY (`OfferingNo`),
  ADD KEY `CourseCode` (`CourseCode`),
  ADD KEY `RoomNo` (`RoomNo`);

--
-- Indexes for table `enrollment`
--
ALTER TABLE `enrollment`
  ADD PRIMARY KEY (`StudentID`,`OfferingNo`),
  ADD KEY `OfferingNo` (`OfferingNo`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`StudentID`);

--
-- Indexes for table `tutor`
--
ALTER TABLE `tutor`
  ADD PRIMARY KEY (`StaffNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `StudentID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tutor`
--
ALTER TABLE `tutor`
  MODIFY `StaffNo` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `course`
--
ALTER TABLE `course`
  ADD CONSTRAINT `course_ibfk_1` FOREIGN KEY (`StaffNo`) REFERENCES `tutor` (`StaffNo`);

--
-- Constraints for table `course_offering`
--
ALTER TABLE `course_offering`
  ADD CONSTRAINT `course_offering_ibfk_1` FOREIGN KEY (`CourseCode`) REFERENCES `course` (`CourseCode`),
  ADD CONSTRAINT `course_offering_ibfk_2` FOREIGN KEY (`RoomNo`) REFERENCES `classroom` (`RoomNo`);

--
-- Constraints for table `enrollment`
--
ALTER TABLE `enrollment`
  ADD CONSTRAINT `enrollment_ibfk_1` FOREIGN KEY (`StudentID`) REFERENCES `student` (`StudentID`),
  ADD CONSTRAINT `enrollment_ibfk_2` FOREIGN KEY (`OfferingNo`) REFERENCES `course_offering` (`OfferingNo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
