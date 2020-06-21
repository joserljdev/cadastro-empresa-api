insert into tipo (id, descricao) values (1, 'Matriz');
insert into tipo (id, descricao) values (2, 'Filial');

insert into empresa (cnpj, nome, razao_social, contato, email, cep, estado, bairro, cidade, logradouro, complemento, tipo_id) values	
('89851107000157', 'Supermercado Menor Preço', 'Super Menor Preço LTDA', 'João Grilo', 'menorpreco@gmail.com', '73045152', 'DF', 'Sobradinho', 'Brasília', 'Quadra 15 Conjunto B', 'Próximo ao açougue do Chicó', 1);
insert into empresa (cnpj, nome, razao_social, contato, email, cep, estado, bairro, cidade, logradouro, complemento, tipo_id) values	
('45897063000120', 'Restaurante Sabor Baiano 2', 'Sabor Baiano LTDA', 'Maria', 'saborbaiano@gmail.com', '40170110', 'BA', 'Ondina', 'Salvador', 'Avenida Adhemar de Barros', 'Próximo à UFBA', 2);