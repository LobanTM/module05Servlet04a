CREATE TABLE `module05hw`.`manufacturers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `module05hw`.`products` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `price` DECIMAL(19,2) NULL,
  `manufacturer_id` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_idx` (`manufacturer_id` ASC),
  CONSTRAINT `id`
    FOREIGN KEY (`manufacturer_id`)
    REFERENCES `module05hw`.`manufacturer02` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


INSERT INTO `module05hw`.`manufacturer` (`name`) VALUES ('ariston');
INSERT INTO `module05hw`.`manufacturer` (`name`) VALUES ('bmw');
INSERT INTO `module05hw`.`manufacturer` (`name`) VALUES ('lexus');
INSERT INTO `module05hw`.`manufacturer` (`name`) VALUES ('lenovo');
INSERT INTO `module05hw`.`manufacturer` (`name`) VALUES ('dell');
INSERT INTO `module05hw`.`manufacturer` (`name`) VALUES ('Abb');
INSERT INTO `module05hw`.`manufacturer` (`name`) VALUES ('Intel');

INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('phone', '120', '3');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('house', '1000', '2');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('car', '500', '7');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('notebook', '20', '5');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('phone', '120', '1');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('house', '1000', '1');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('car', '500', '1');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('notebook', '20', '6');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('phone', '120', '6');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('house', '1000', '6');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('car', '500', '7');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('notebook', '20', '5');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('phone', '120', '7');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('house', '1000', '7');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('car', '500', '7');
INSERT INTO `module05hw`.`products` (`name`, `price`, `manufacturer_id`) VALUES ('notebook', '20', '4');
