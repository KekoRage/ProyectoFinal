-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-01-2020 a las 14:56:51
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mascotas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `animales`
--

CREATE TABLE `animales` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) DEFAULT NULL,
  `tipo` varchar(200) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `animales`
--

INSERT INTO `animales` (`id`, `nombre`, `tipo`, `precio`) VALUES
(7, 'Kiko', 'Perro', 350),
(8, 'Nala', 'Gato', 80),
(9, 'Pipo', 'Perro', 560),
(10, 'Atila', 'Perro', 343),
(11, 'Goku', 'Gato', 123);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `dni` varchar(11) NOT NULL,
  `nombre` varchar(200) DEFAULT NULL,
  `apellido` varchar(200) DEFAULT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `localidad` varchar(200) DEFAULT NULL,
  `correo` varchar(200) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`dni`, `nombre`, `apellido`, `direccion`, `localidad`, `correo`, `telefono`) VALUES
('50486131Z', 'Carlos', 'Fernandez', 'C/Armanda', 'Madrid', 'correo@correo.com', '678423890'),
('53494590V', 'José Fernando', 'Molina Garcia', 'Avenida Valdelasfuentes', 'San Sebastian de los Reyes', 'KekoRage@gmail.com', '635765738'),
('78234122G', 'Eva', 'Madera', 'C/Jacaranda', 'Barcelona', 'email@correo.com', '690000777');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historico`
--

CREATE TABLE `historico` (
  `id` int(11) NOT NULL,
  `dni` varchar(11) DEFAULT NULL,
  `usuario` varchar(200) DEFAULT NULL,
  `tipo` varchar(200) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  `fecha_venta` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `historico`
--

INSERT INTO `historico` (`id`, `dni`, `usuario`, `tipo`, `precio`, `fecha_venta`) VALUES
(1, '78234122G', 'mariauser', 'Puercospin', 300, '2012-06-18'),
(2, '78234122G', 'mariauser', 'Puercospin', 300, '2012-06-18'),
(3, '78234122G', 'mariauser', 'Puercospin', 300, '2012-06-18'),
(4, '78234122G', 'Geruxia', 'delfin', 545, '2020-01-30'),
(5, '53494590V', 'Geruxia', 'hamster', 545, '2020-01-30');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `telefono` int(10) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `password` varchar(13) NOT NULL,
  `rol` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Id`, `nombre`, `apellido`, `telefono`, `usuario`, `password`, `rol`) VALUES
(6, 'Ruth C', 'Ramos', 696059501, 'KekoRage', '12345678', 0),
(7, 'José Fernando', 'Molina Garcia', 635765738, 'Kiko', '8&rc?#9g2Jm', 0),
(8, 'José Fernando', 'Molina Garcia', 635765738, 'aafaf', '3g6S9l\"!$,', 0),
(9, 'Jacinto', 'Ramos', 696059501, 'Geruxia', '12345678', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `animales`
--
ALTER TABLE `animales`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `historico`
--
ALTER TABLE `historico`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `animales`
--
ALTER TABLE `animales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `historico`
--
ALTER TABLE `historico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
