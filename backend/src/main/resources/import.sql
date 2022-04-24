INSERT INTO tb_user(email) VALUES ('eduardo@duel.com.br');
INSERT INTO tb_user(email) VALUES ('eduardodurieuxlopes@gmail.com');

INSERT INTO tb_tank (name, description, heigth, width, length, volume) VALUES ('Crescimento 01', 'Aquário de crescimento e separação de casais', '50', '40', '100', '200');
INSERT INTO tb_tank (name, description, heigth, width, length, volume) VALUES ('Cubo 01', 'Aquário de desova 01', '50', '50', '50', '125');
INSERT INTO tb_tank (name, description, heigth, width, length, volume) VALUES ('Aquário 01', 'Aquário de desova', '40', '30', '70', '78');

INSERT INTO tb_tank_user (tank_id, user_id) VALUES (1, 1);
INSERT INTO tb_tank_user (tank_id, user_id) VALUES (2, 1);
INSERT INTO tb_tank_user (tank_id, user_id) VALUES (3, 1);

