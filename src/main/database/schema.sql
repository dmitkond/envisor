CREATE TABLE part_group (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    parent_id INT UNSIGNED DEFAULT NULL,

    PRIMARY KEY (id),
    UNIQUE KEY un_part_group_name (name),
    KEY fk_part_group_parent_id (parent_id),
    CONSTRAINT fk_part_group_parent_id
        FOREIGN KEY (parent_id) REFERENCES part_group(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE unit (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(15) NOT NULL,

    PRIMARY KEY (id),
    UNIQUE KEY un_unit_name (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE part (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    code VARCHAR(16) NOT NULL,
    name VARCHAR(128) NOT NULL,
    type CHAR(1) NOT NULL,
    group_id INT UNSIGNED NOT NULL,
    unit_id INT UNSIGNED NOT NULL,

    PRIMARY KEY (id),
    UNIQUE KEY un_part_code (code),
    UNIQUE KEY un_part_name (name),
    KEY fk_part_group_id (group_id),
    KEY fk_part_unit_id (unit_id),
    CONSTRAINT fk_part_group_id
        FOREIGN KEY (group_id) REFERENCES part_group(id),
    CONSTRAINT fk_part_unit_id
        FOREIGN KEY (unit_id) REFERENCES unit(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
