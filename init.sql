CREATE DATABASE IF NOT EXISTS `tasks`;

CREATE TABLE IF NOT EXISTS `tasks`.`current_tasks` (
  `idcurrent_tasks` BIGINT(8) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `is_done` TINYINT NOT NULL,
  PRIMARY KEY (`idcurrent_tasks`));

