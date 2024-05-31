CREATE DATABASE gestion_taquillas CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci;
USE gestion_taquillas;

CREATE TABLE vestuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    sexo ENUM('M', 'F', 'O') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

CREATE TABLE taquillas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    vestuario_id INT NOT NULL,
    codigo_taquilla VARCHAR(50) NOT NULL UNIQUE,
    nombre_apellidos VARCHAR(255),
    categoria_profesional VARCHAR(30),
    servicio VARCHAR(30),
    telefono VARCHAR(9),
    empresa_externa BOOLEAN,
    FOREIGN KEY (vestuario_id) REFERENCES vestuarios(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;