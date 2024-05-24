USE gestion_taquillas;

INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa)
VALUES
('A', 'M', 'A01', 'Juan Pérez', 'Administrativo', 'Recursos Humanos', NULL, FALSE),
('B', 'F', 'B01', 'María García', 'Limpieza', 'Mantenimiento', '555-1234', TRUE),
('C', 'O', 'C01', 'Álex López', 'Seguridad', 'Seguridad', '555-5678', TRUE),
('D', 'M', 'D01', 'Carlos Ruiz', 'Tecnico', 'Informática', NULL, FALSE),
('E', 'F', 'E01', 'Laura Fernández', 'Enfermera', 'Pediatría', NULL, FALSE),
('F', 'O', 'F01', 'Samira Khan', 'Doctora', 'Urgencias', NULL, FALSE),
('G', 'M', 'G01', 'Luis Martínez', 'Auxiliar', 'Quirófano', NULL, FALSE),
('H', 'F', 'H01', 'Sofía González', 'Administrativo', 'Administración', NULL, FALSE),
('I', 'O', 'I01', 'Erick Hernández', 'Seguridad', 'Seguridad', '555-9876', TRUE),
('J', 'M', 'J01', 'Tomás Ortega', 'Mantenimiento', 'Mantenimiento', '555-6543', TRUE),
('A', 'F', 'A02', 'Ana López', 'Administrativo', 'Recursos Humanos', NULL, FALSE),
('B', 'M', 'B02', 'Pedro Sánchez', 'Limpieza', 'Mantenimiento', '555-2222', TRUE),
('C', 'F', 'C02', 'Isabel Castro', 'Seguridad', 'Seguridad', '555-3333', TRUE),
('D', 'O', 'D02', 'Andrea Vargas', 'Tecnico', 'Informática', NULL, FALSE),
('E', 'M', 'E02', 'Javier Gómez', 'Enfermero', 'Pediatría', NULL, FALSE),
('F', 'F', 'F02', 'Clara Torres', 'Doctora', 'Urgencias', NULL, FALSE),
('G', 'O', 'G02', 'Omar Ahmed', 'Auxiliar', 'Quirófano', NULL, FALSE),
('H', 'M', 'H02', 'Miguel Ramírez', 'Administrativo', 'Administración', NULL, FALSE),
('I', 'F', 'I02', 'Lucía Silva', 'Seguridad', 'Seguridad', '555-9999', TRUE),
('J', 'O', 'J02', 'Gabriel Jiménez', 'Mantenimiento', 'Mantenimiento', '555-0000', TRUE),
('A', 'M', 'A03', 'José Pérez', 'Administrativo', 'Recursos Humanos', NULL, FALSE),
('B', 'F', 'B03', 'María Santos', 'Limpieza', 'Mantenimiento', '555-1234', TRUE),
('C', 'O', 'C03', 'Alexis Ruiz', 'Seguridad', 'Seguridad', '555-5678', TRUE),
('D', 'M', 'D03', 'Carlos Hernández', 'Tecnico', 'Informática', NULL, FALSE),
('E', 'F', 'E03', 'Laura Díaz', 'Enfermera', 'Pediatría', NULL, FALSE),
('F', 'O', 'F03', 'Samira Mohamed', 'Doctora', 'Urgencias', NULL, FALSE),
('G', 'M', 'G03', 'Luis Fernández', 'Auxiliar', 'Quirófano', NULL, FALSE),
('H', 'F', 'H03', 'Sofía López', 'Administrativo', 'Administración', NULL, FALSE),
('I', 'O', 'I03', 'Erick González', 'Seguridad', 'Seguridad', '555-9876', TRUE),
('J', 'M', 'J03', 'Tomás Martínez', 'Mantenimiento', 'Mantenimiento', '555-6543', TRUE),
('A', 'F', 'A04', 'Ana García', 'Administrativo', 'Recursos Humanos', NULL, FALSE),
('B', 'M', 'B04', 'Pedro Ramírez', 'Limpieza', 'Mantenimiento', '555-3210', TRUE),
('C', 'F', 'C04', 'Isabel Fernández', 'Seguridad', 'Seguridad', '555-4321', TRUE),
('D', 'O', 'D04', 'Andrea López', 'Tecnico', 'Informática', NULL, FALSE),
('E', 'M', 'E04', 'Javier Rodríguez', 'Enfermero', 'Pediatría', NULL, FALSE),
('F', 'F', 'F04', 'Clara Hernández', 'Doctora', 'Urgencias', NULL, FALSE),
('G', 'O', 'G04', 'Omar López', 'Auxiliar', 'Quirófano', NULL, FALSE),
('H', 'M', 'H04', 'Miguel Sánchez', 'Administrativo', 'Administración', NULL, FALSE),
('I', 'F', 'I04', 'Lucía González', 'Seguridad', 'Seguridad', '555-8765', TRUE),
('J', 'O', 'J04', 'Gabriel Pérez', 'Mantenimiento', 'Mantenimiento', '555-5432', TRUE),
('A', 'M', 'A05', 'José García', 'Administrativo', 'Recursos Humanos', NULL, FALSE),
('B', 'F', 'B05', 'María Ruiz', 'Limpieza', 'Mantenimiento', '555-2345', TRUE),
('C', 'O', 'C05', 'Alexis García', 'Seguridad', 'Seguridad', '555-6789', TRUE),
('D', 'M', 'D05', 'Carlos Fernández', 'Tecnico', 'Informática', NULL, FALSE),
('E', 'F', 'E05', 'Laura Rodríguez', 'Enfermera', 'Pediatría', NULL, FALSE),
('F', 'O', 'F05', 'Samira López', 'Doctora', 'Urgencias', NULL, FALSE),
('G', 'M', 'G05', 'Luis Hernández', 'Auxiliar', 'Quirófano', NULL, FALSE),
('H', 'F', 'H05', 'Sofía Martínez', 'Administrativo', 'Administración', NULL, FALSE),
('I', 'O', 'I05', 'Erick Pérez', 'Seguridad', 'Seguridad', '555-9870', TRUE),
('J', 'M', 'J05', 'Tomás Gómez', 'Mantenimiento', 'Mantenimiento', '555-6541', TRUE);


INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('A', 'M', 'A100', 'Juan Pérez', 'Administrativo', 'Recursos Humanos', '555-1234', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('A', 'M', 'A101', 'José García', 'Médico', 'Urgencias', '555-5678', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('A', 'M', 'A102', 'Luis Fernández', 'Enfermero', 'Pediatría', '555-8765', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('A', 'M', 'A103', 'Carlos Rodríguez', 'Técnico', 'Radiología', '555-4321', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('A', 'M', 'A104', 'Miguel López', 'Seguridad', 'Seguridad', '555-0000', true);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('A', 'M', 'A105', 'Andrés Martínez', 'Limpieza', 'Limpieza', '555-1111', true);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('A', 'M', 'A106', 'Pedro Sánchez', 'Administrativo', 'Recursos Humanos', '555-2222', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('A', 'M', 'A107', 'Jorge González', 'Médico', 'Urgencias', '555-3333', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('A', 'M', 'A108', 'Sergio Ruiz', 'Enfermero', 'Pediatría', '555-4444', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('A', 'M', 'A109', 'Antonio Hernández', 'Técnico', 'Radiología', '555-5555', false);
-- Add 40 more for men in similar manner
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('B', 'F', 'B100', 'Ana Pérez', 'Administrativo', 'Recursos Humanos', '555-1234', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('B', 'F', 'B101', 'María García', 'Médico', 'Urgencias', '555-5678', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('B', 'F', 'B102', 'Laura Fernández', 'Enfermero', 'Pediatría', '555-8765', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('B', 'F', 'B103', 'Carmen Rodríguez', 'Técnico', 'Radiología', '555-4321', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('B', 'F', 'B104', 'Isabel López', 'Seguridad', 'Seguridad', '555-0000', true);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('B', 'F', 'B105', 'Sofía Martínez', 'Limpieza', 'Limpieza', '555-1111', true);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('B', 'F', 'B106', 'Marta Sánchez', 'Administrativo', 'Recursos Humanos', '555-2222', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('B', 'F', 'B107', 'Lucía González', 'Médico', 'Urgencias', '555-3333', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('B', 'F', 'B108', 'Elena Ruiz', 'Enfermero', 'Pediatría', '555-4444', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('B', 'F', 'B109', 'Teresa Hernández', 'Técnico', 'Radiología', '555-5555', false);
-- Add 40 more for women in similar manner
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('C', 'M', 'C100', 'Juan Pérez', 'Administrativo', 'Recursos Humanos', '555-1234', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('C', 'F', 'C101', 'Ana García', 'Administrativo', 'Recursos Humanos', '555-5678', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('C', 'M', 'C102', 'José Pérez', 'Administrativo', 'Recursos Humanos', '555-8765', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('C', 'F', 'C103', 'María López', 'Administrativo', 'Recursos Humanos', '555-4321', false);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('C', 'M', 'C104', 'Carlos Sánchez', 'Administrativo', 'Recursos Humanos', '555-0000', false);
-- Add more for 'O' (others)
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('A', 'M', 'A150', 'Pedro Gómez', 'Limpieza', 'Limpieza', '555-1111', true);
INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES ('A', 'F', 'A151', 'Marta Ruiz', 'Seguridad', 'Seguridad', '555-2222', true);
-- Add more entries to cover 100 inserts


INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa)
VALUES
('A', 'M', 'A05', 'Pedro García', 'Administrativo', 'Recursos Humanos', '555-1111', FALSE),
('B', 'F', 'B05', 'Laura Sánchez', 'Limpieza', 'Mantenimiento', '555-2222', TRUE),
('C', 'O', 'C05', 'Álex Fernández', 'Seguridad', 'Seguridad', '555-3333', TRUE),
('D', 'M', 'D05', 'Miguel Martínez', 'Técnico', 'Informática', '555-4444', FALSE),
('E', 'F', 'E05', 'Carmen Rodríguez', 'Enfermera', 'Pediatría', '555-5555', FALSE),
('F', 'O', 'F05', 'Omar García', 'Doctor', 'Urgencias', '555-6666', TRUE),
('G', 'M', 'G05', 'Juan López', 'Auxiliar', 'Quirófano', '555-7777', FALSE),
('H', 'F', 'H05', 'Ana Pérez', 'Administrativo', 'Administración', '555-8888', FALSE),
('I', 'O', 'I05', 'Gabriel Sánchez', 'Seguridad', 'Seguridad', '555-9999', TRUE),
('J', 'M', 'J05', 'Carlos Ruiz', 'Mantenimiento', 'Mantenimiento', '555-0000', TRUE),
('A', 'F', 'A06', 'María González', 'Administrativo', 'Recursos Humanos', '555-1111', FALSE),
('B', 'M', 'B06', 'Luis Fernández', 'Limpieza', 'Mantenimiento', '555-2222', TRUE),
('C', 'F', 'C06', 'Elena Martínez', 'Seguridad', 'Seguridad', '555-3333', TRUE),
('D', 'O', 'D06', 'Samira Rodríguez', 'Técnico', 'Informática', '555-4444', FALSE),
('E', 'M', 'E06', 'Pedro Hernández', 'Enfermero', 'Pediatría', '555-5555', FALSE),
('F', 'F', 'F06', 'Laura Sánchez', 'Doctora', 'Urgencias', '555-6666', TRUE),
('G', 'O', 'G06', 'Erick García', 'Auxiliar', 'Quirófano', '555-7777', FALSE),
('H', 'M', 'H06', 'Javier López', 'Administrativo', 'Administración', '555-8888', FALSE),
('I', 'F', 'I06', 'Isabel Pérez', 'Seguridad', 'Seguridad', '555-9999', TRUE),
('J', 'O', 'J06', 'Omar González', 'Mantenimiento', 'Mantenimiento', '555-0000', TRUE),
('A', 'M', 'A07', 'Antonio García', 'Administrativo', 'Recursos Humanos', '555-1111', FALSE),
('B', 'F', 'B07', 'Sofía Sánchez', 'Limpieza', 'Mantenimiento', '555-2222', TRUE),
('C', 'O', 'C07', 'Gabriel Fernández', 'Seguridad', 'Seguridad', '555-3333', TRUE),
('D', 'M', 'D07', 'Carlos Martínez', 'Técnico', 'Informática', '555-4444', FALSE),
('E', 'F', 'E07', 'Ana Rodríguez', 'Enfermera', 'Pediatría', '555-5555', FALSE),
('F', 'O', 'F07', 'Samira López', 'Doctora', 'Urgencias', '555-6666', TRUE),
('G', 'M', 'G07', 'Luis Pérez', 'Auxiliar', 'Quirófano', '555-7777', FALSE),
('H', 'F', 'H07', 'Carmen Sánchez', 'Administrativo', 'Administración', '555-8888', FALSE),
('I', 'O', 'I07', 'Álex García', 'Seguridad', 'Seguridad', '555-9999', TRUE),
('J', 'M', 'J07', 'Juan Hernández', 'Mantenimiento', 'Mantenimiento', '555-0000', TRUE),
('A', 'F', 'A08', 'Teresa Fernández', 'Administrativo', 'Recursos Humanos', '555-1111', FALSE),
('B', 'M', 'B08', 'Jorge Martínez', 'Limpieza', 'Mantenimiento', '555-2222', TRUE),
('C', 'F', 'C08', 'Isabel Rodríguez', 'Seguridad', 'Seguridad', '555-3333', TRUE),
('D', 'O', 'D08', 'Omar Sánchez', 'Técnico', 'Informática', '555-4444', FALSE),
('E', 'M', 'E08', 'Carlos López', 'Enfermero', 'Pediatría', '555-5555', FALSE),
('F', 'F', 'F08', 'María Pérez', 'Doctora', 'Urgencias', '555-6666', TRUE),
('G', 'O', 'G08', 'Gabriel García', 'Auxiliar', 'Quirófano', '555-7777', FALSE),
('H', 'M', 'H08', 'Pedro Hernández', 'Administrativo', 'Administración', '555-8888', FALSE),
('I', 'F', 'I08', 'Laura Sánchez', 'Seguridad', 'Seguridad', '555-9999', TRUE),
('J', 'O', 'J08', 'Álex Martínez', 'Mantenimiento', 'Mantenimiento', '555-0000', TRUE),
('A', 'M', 'A09', 'Luis García', 'Administrativo', 'Recursos Humanos', '555-1111', FALSE),
('B', 'F', 'B09', 'Elena Sánchez', 'Limpieza', 'Mantenimiento', '555-2222', TRUE),
('C', 'O', 'C09', 'Gabriel Fernández', 'Seguridad', 'Seguridad', '555-3333', TRUE),
('D', 'M', 'D09', 'Juan Martínez', 'Técnico', 'Informática', '555-4444', FALSE),
('E', 'F', 'E09', 'Sofía Rodríguez', 'Enfermera', 'Pediatría', '555-5555', FALSE),
('F', 'O', 'F09', 'Erick López', 'Doctor', 'Urgencias', '555-6666', TRUE),
('G', 'M', 'G09', 'Carlos Pérez', 'Auxiliar', 'Quirófano', '555-7777', FALSE),
('H', 'F', 'H09', 'Carmen García', 'Administrativo', 'Administración', '555-8888', FALSE),
('I', 'O', 'I09', 'Omar Sánchez', 'Seguridad', 'Seguridad', '555-9999', TRUE),
('J', 'M', 'J09', 'Pedro Fernández', 'Mantenimiento', 'Mantenimiento', '555-0000', TRUE);

INSERT INTO taquillas (vestuario, sexo, codigo_taquilla, nombre_apellidos, categoria_profesional, servicio, telefono, empresa_externa) VALUES 
('A', 'M', 'A11', 'Carlos García', 'Médico', 'Cardiología', '600111222', false),
('A', 'F', 'A12', 'María López', 'Enfermera', 'Urgencias', '600112233', false),
('B', 'M', 'B11', 'Luis Fernández', 'Auxiliar', 'Quirófano', '600113344', true),
('B', 'F', 'B12', 'Ana Martínez', 'Médico', 'Pediatría', '600114455', false),
('C', 'M', 'C11', 'Javier Sánchez', 'Enfermero', 'Geriatría', '600115566', true),
('C', 'F', 'C12', 'Elena Ramírez', 'Médico', 'Oncología', '600116677', false),
('D', 'M', 'D11', 'Miguel Torres', 'Auxiliar', 'Radiología', '600117788', true),
('D', 'F', 'D12', 'Sara Gómez', 'Enfermera', 'UCI', '600118899', false),
('E', 'M', 'E11', 'Pablo Díaz', 'Médico', 'Neurología', '600119900', false),
('E', 'F', 'E12', 'Laura Álvarez', 'Auxiliar', 'Laboratorio', '600120011', true),
('F', 'M', 'F11', 'Adrián Ruiz', 'Enfermero', 'Psiquiatría', '600121122', false),
('F', 'F', 'F12', 'Patricia Moreno', 'Médico', 'Dermatología', '600122233', true),
('G', 'M', 'G11', 'Manuel Jiménez', 'Auxiliar', 'Farmacia', '600123344', false),
('G', 'F', 'G12', 'Beatriz Navarro', 'Enfermera', 'Traumatología', '600124455', true),
('H', 'M', 'H11', 'Víctor Romero', 'Médico', 'Gastroenterología', '600125566', false),
('H', 'F', 'H12', 'Isabel Ortega', 'Auxiliar', 'Neonatología', '600126677', true),
('I', 'M', 'I11', 'Roberto Santos', 'Enfermero', 'Oftalmología', '600127788', false),
('I', 'F', 'I12', 'Alicia Castro', 'Médico', 'Endocrinología', '600128899', true),
('J', 'M', 'J11', 'Alfredo Mendoza', 'Auxiliar', 'Fisioterapia', '600129900', false),
('J', 'F', 'J12', 'Marta Reyes', 'Enfermera', 'Nefrología', '600130011', true),
('A', 'M', 'A13', 'Francisco Suárez', 'Médico', 'Hematología', '600131122', false),
('A', 'F', 'A14', 'Natalia Vega', 'Auxiliar', 'Anestesiología', '600132233', true),
('B', 'M', 'B13', 'Ricardo Herrera', 'Enfermero', 'Ginecología', '600133344', false),
('B', 'F', 'B14', 'Raquel Castillo', 'Médico', 'Reumatología', '600134455', true),
('C', 'M', 'C13', 'Héctor Rivas', 'Auxiliar', 'Patología', '600135566', false),
('C', 'F', 'C14', 'Eva Domínguez', 'Enfermera', 'Urología', '600136677', true),
('D', 'M', 'D13', 'Alejandro Vázquez', 'Médico', 'Infectología', '600137788', false),
('D', 'F', 'D14', 'Teresa Iglesias', 'Auxiliar', 'Odontología', '600138899', true),
('E', 'M', 'E13', 'Fernando Silva', 'Enfermero', 'Geriatría', '600139900', false),
('E', 'F', 'E14', 'Clara Vilar', 'Médico', 'Pneumología', '600140011', true),
('F', 'M', 'F13', 'Iván Guerrero', 'Auxiliar', 'Psiquiatría', '600141122', false),
('F', 'F', 'F14', 'Rosa Pardo', 'Enfermera', 'Endocrinología', '600142233', true),
('G', 'M', 'G13', 'Sergio Parra', 'Médico', 'Neurocirugía', '600143344', false),
('G', 'F', 'G14', 'Yolanda Lozano', 'Auxiliar', 'Traumatología', '600144455', true),
('H', 'M', 'H13', 'Gabriel Lara', 'Enfermero', 'Hepatología', '600145566', false),
('H', 'F', 'H14', 'Lorena Herrera', 'Médico', 'Medicina Interna', '600146677', true),
('I', 'M', 'I13', 'Eduardo Ramos', 'Auxiliar', 'Rehabilitación', '600147788', false),
('I', 'F', 'I14', 'Sandra Marín', 'Enfermera', 'Oncología', '600148899', true),
('J', 'M', 'J13', 'Raúl Cano', 'Médico', 'Cardiología', '600149900', false),
('J', 'F', 'J14', 'Andrea Serrano', 'Auxiliar', 'Laboratorio', '600150011', true),
('A', 'M', 'A15', 'Tomás Benítez', 'Enfermero', 'Urgencias', '600151122', false),
('A', 'F', 'A16', 'Silvia Montero', 'Médico', 'Pediatría', '600152233', true),
('B', 'M', 'B15', 'Pedro Cortés', 'Auxiliar', 'Quirófano', '600153344', false),
('B', 'F', 'B16', 'Gloria Peña', 'Enfermera', 'Radiología', '600154455', true),
('C', 'M', 'C15', 'Mario Arias', 'Médico', 'Dermatología', '600155566', false),
('C', 'F', 'C16', 'Verónica Rivera', 'Auxiliar', 'Gastroenterología', '600156677', true),
('D', 'M', 'D15', 'Esteban Núñez', 'Enfermero', 'UCI', '600157788', false),
('D', 'F', 'D16', 'Lidia Méndez', 'Médico', 'Neurología', '600158899', true);
