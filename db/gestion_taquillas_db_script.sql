CREATE DATABASE IF NOT EXISTS gestion_taquillas
CHARACTER SET utf8mb4
COLLATE utf8mb4_spanish_ci;

USE gestion_taquillas;

CREATE TABLE IF NOT EXISTS taquillas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    vestuario VARCHAR(50) NOT NULL,
    sexo ENUM('M', 'F', 'O') NOT NULL,
    codigo_taquilla VARCHAR(50) NOT NULL UNIQUE,
    nombre_apellidos VARCHAR(100) NOT NULL,
    categoria_profesional VARCHAR(50) NOT NULL,
    servicio VARCHAR(100) NOT NULL,
    telefono VARCHAR(20),
    empresa_externa BOOLEAN NOT NULL DEFAULT FALSE,
    CONSTRAINT UC_Taquilla UNIQUE (vestuario, codigo_taquilla)
) ENGINE=InnoDB
CHARACTER SET utf8mb4
COLLATE utf8mb4_spanish_ci;