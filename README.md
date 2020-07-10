## Steps:

1. Install MariaDB 10.3
2. Create DBs named: fornecedor, loja and transportador
3. Run all projects

## Available endpoints

First of all, you might want to take a look at __localhost:5555/actuator/routes__ there you will find all routes available.
Others endpoints:

Some of available routes requests authentication first.

1. __POST (no auth): localhost:5555/auth/oauth/token__ this one requires Basic Auth. Username: loja / Password: lojapwd.
  On its body use form-data as follows: 
    K=scope V=web
    K=grant_type V=password
    K=username V=joao
    K=password V=joaopwd
  
2. __GET (no auth): localhost:5555/fornecedor/produto/{UF}__

3. __POST (auth): localhost:5555/loja/compra
  Body JSON as follows: {"itens": [{"id": 1,"quantidade": 5},{"id": 2,"quantidade": 1}],"endereco": {"rua": "Rua da Maria","numero": "123","estado": "DF
  
4. __GET (no auth): localhost:5555/loja/compra/{id}
  ** Authorization is on its way to be implemented.
