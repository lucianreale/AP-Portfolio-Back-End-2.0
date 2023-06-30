-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bxdptjymggttfduawctr-mysql.services.clever-cloud.com:3306
-- Generation Time: Jun 30, 2023 at 04:58 PM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bxdptjymggttfduawctr`
--

-- --------------------------------------------------------

--
-- Table structure for table `education`
--

CREATE TABLE `education` (
  `id` bigint(20) NOT NULL,
  `career` varchar(255) DEFAULT NULL,
  `end` int(11) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `school` varchar(255) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `start` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `userid` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `education`
--

INSERT INTO `education` (`id`, `career`, `end`, `img`, `school`, `score`, `start`, `title`, `user_id`, `userid`) VALUES
(1, 'Licenciatura en Administracion de Empresas', 2005, 'https://8982375b4e.cbaul-cdnwnd.com/ca2ba11af957900e305b79430a1015e0/200000075-7807879fc7/escudo%20naval.JPG', 'Hogar Naval Stella Maris', 74, 1999, 'Tecnico en Computacion', 2, NULL),
(2, 'Licenciatura en Administracion de Empresas', 2014, 'https://nyc3.digitaloceanspaces.com/orienten-prod/media/uploads/institutions/logos/thumbnails/329-universidad-caece-logo_73Fy5km.png', 'CAECE', 66, 2007, 'Ingenieria / Licenciatura en Sistemas', 2, NULL),
(3, 'Licenciatura en Administracion de Empresas', 2018, 'https://www.facebook.com/lasiglo21/photos/a.465619890160709/3667061526683180/?__tn__=%3C', 'Universidad Siglo XXI', 66, 2016, 'Licenciatura en Administracion de Empresas', 2, NULL),
(4, 'Licenciatura en Administracion de Empresas', 2018, 'https://www.facebook.com/lasiglo21/photos/a.465619890160709/3667061526683180/?__tn__=%3C', 'Universidad Siglo XXI', 66, 2016, 'Licenciatura en Administracion de Empresas', 1, NULL),
(52, 'Licenciatura en Administracion de Empresas', 2018, 'https://www.facebook.com/lasiglo21/photos/a.465619890160709/3667061526683180/?__tn__=%3C', 'Universidad Siglo XXI', 66, 2016, 'Licenciatura en Administracion de Empresas', NULL, 1),
(53, 'Licenciatura en Administracion de Empresas', 2018, 'https://www.facebook.com/lasiglo21/photos/a.465619890160709/3667061526683180/?__tn__=%3C', 'Universidad Prueba XXI', 66, 2016, 'Licenciatura en Administracion de Empresas', NULL, 1),
(54, 'Licenciatura en Administracion de Empresas', 2018, 'https://www.facebook.com/lasiglo21/photos/a.465619890160709/3667061526683180/?__tn__=%3C', 'Universidad Prueba XXI', 66, 2016, 'Licenciatura en Administracion de Empresas', NULL, 2),
(55, 'Licenciatura en Administracion de Empresas', 2018, 'https://www.facebook.com/lasiglo21/photos/a.465619890160709/3667061526683180/?__tn__=%3C', 'Universidad CAECE XXI', 66, 2016, 'Licenciatura en Administracion de Empresas', NULL, 2),
(56, 'Licenciatura en Administracion de Empresas', 2018, 'https://www.facebook.com/lasiglo21/photos/a.465619890160709/3667061526683180/?__tn__=%3C', 'Argentina Programa', 66, 2016, 'Licenciatura en Administracion de Empresas', NULL, 2),
(102, 'Licenciatura en Administracion de Empresas', 2018, 'https://www.facebook.com/lasiglo21/photos/a.465619890160709/3667061526683180/?__tn__=%3C', 'Argentina Programa En User 1', 66, 2016, 'Licenciatura en Administracion de Empresas', NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `education_seq`
--

CREATE TABLE `education_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `education_seq`
--

INSERT INTO `education_seq` (`next_val`) VALUES
(251);

-- --------------------------------------------------------

--
-- Table structure for table `experience`
--

CREATE TABLE `experience` (
  `id` bigint(20) NOT NULL,
  `company` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `end` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `start` varchar(255) DEFAULT NULL,
  `userid` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experience`
--

INSERT INTO `experience` (`id`, `company`, `description`, `end`, `img`, `position`, `start`, `userid`) VALUES
(1, 'OSPSIP', 'Jornada Completa, Administracion de Servidores e Infraestructura', 'actualidad', 'http://www.laguiadequilmes.com/uploads/imagenes/clasificados/608/principal/200xAuto/140227051813636879.jpg', 'Administrador de Servidoressss', '2006', 2),
(2, 'OSPSIP2', 'Jornada Completa, Administracion de Servidores e Infraestructura', 'actualidad', 'http://www.laguiadequilmes.com/uploads/imagenes/clasificados/608/principal/200xAuto/140227051813636879.jpg', 'Administrador de Servidores', '2006', 2),
(3, 'Otro Ospsip', 'Jornada Completa, Administracion de Servidores e Infraestructura', '2020', 'http://www.laguiadequilmes.com/uploads/imagenes/clasificados/608/principal/200xAuto/140227051813636879.jpg', 'Administrador de Servidores', '2006', 2),
(4, 'Edyx', 'Jornada Completa, Tecnico en Reparacion de PC', '2006', '', 'Tecnico', '2004', 2);

-- --------------------------------------------------------

--
-- Table structure for table `experience_seq`
--

CREATE TABLE `experience_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experience_seq`
--

INSERT INTO `experience_seq` (`next_val`) VALUES
(151);

-- --------------------------------------------------------

--
-- Table structure for table `proyect`
--

CREATE TABLE `proyect` (
  `id` bigint(20) NOT NULL,
  `company` varchar(255) DEFAULT NULL,
  `end` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `start` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `userid` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyect`
--

INSERT INTO `proyect` (`id`, `company`, `end`, `name`, `start`, `url`, `userid`) VALUES
(2, 'Argentina Programa', '2023', 'BackEnd - Junior', '2023', '#', 2),
(3, 'Argentina Programa', '2023', 'FrontEnd - Junior', '2023', '#', 2),
(4, 'UTN', '2021', 'FrontEnd - React', '2020', '#', 2);

-- --------------------------------------------------------

--
-- Table structure for table `proyect_seq`
--

CREATE TABLE `proyect_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyect_seq`
--

INSERT INTO `proyect_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Table structure for table `skill`
--

CREATE TABLE `skill` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `rating` varchar(255) DEFAULT NULL,
  `skill` int(11) DEFAULT NULL,
  `userid` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `skill`
--

INSERT INTO `skill` (`id`, `name`, `rating`, `skill`, `userid`) VALUES
(1, 'DB - MySQL', '%', 40, 2),
(2, 'Desarrollo Back-End', '%', 65, 2),
(3, 'Desarrollo Front-End', '%', 45, 2);

-- --------------------------------------------------------

--
-- Table structure for table `skill_seq`
--

CREATE TABLE `skill_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `skill_seq`
--

INSERT INTO `skill_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `banner_img` varchar(255) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `prof_img` varchar(255) DEFAULT NULL,
  `actual_company` varchar(255) DEFAULT NULL,
  `actual_company_img` varchar(255) DEFAULT NULL,
  `actual_company_url` varchar(255) DEFAULT NULL,
  `about` varchar(255) DEFAULT NULL,
  `localization` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `banner_img`, `mail`, `name`, `pass`, `position`, `prof_img`, `actual_company`, `actual_company_img`, `actual_company_url`, `about`, `localization`) VALUES
(1, NULL, 'petert@gmail.com', 'Pedro P. Thompson', '12345', 'Abogado', NULL, NULL, NULL, NULL, NULL, NULL),
(2, 'https://www.conceptseating.com/wp-content/uploads/2021/01/Market-Programming-Banner.jpg', 'lucianreale@gmail.com', 'Lucian H. Reale', 'lucianreale', 'Informatico', 'https://media.licdn.com/dms/image/C4D03AQFmNSLTI6f82A/profile-displayphoto-shrink_800_800/0/1630701598297?e=2147483647&v=beta&t=_xtV-CDo8gj6f4aPw3HVf3yK3E5K5PZ8iSqs-Ke4i74', 'OSPSIP', 'http://www.laguiadequilmes.com/uploads/imagenes/clasificados/608/principal/200xAuto/140227051813636879.jpg', 'ospsip.org.ar', 'Conocimientos en la administración de servidores Linux (visualización, script bash y batch, raid).', 'BS AS - Argentina'),
(52, NULL, NULL, NULL, 'lucianreale', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(152, 'https://www.conceptseating.com/wp-content/uploads/2021/01/Market-Programming-Banner.jpg', 'lucianreal@gmail.com', 'Juan D. Lospalotes', '12345', 'Informatico', 'https://media.licdn.com/dms/image/C4D03AQFmNSLTI6f82A/profile-displayphoto-shrink_800_800/0/1630701598297?e=2147483647&v=beta&t=_xtV-CDo8gj6f4aPw3HVf3yK3E5K5PZ8iSqs-Ke4i74', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `user_seq`
--

CREATE TABLE `user_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_seq`
--

INSERT INTO `user_seq` (`next_val`) VALUES
(251);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `education`
--
ALTER TABLE `education`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `experience`
--
ALTER TABLE `experience`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `proyect`
--
ALTER TABLE `proyect`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `skill`
--
ALTER TABLE `skill`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
