# apipodadearvores
Projeto de API de Poda de Árvores da Prefeitura de João Pessoa - Projeto Integrador Uniesp

Observações:

    - Na prototipagem falta o campo onde o cidadão informa seu CPF. Como ele fará a consulta da poda usando CPF se não cadastrou antes?
    - Foram criadas as classes "Solicitacao" como uma abstração do que a principal chamada fará, tendo em vista que para que o cidadão 
    faça um novo pedido de poda não é necessário um cadastro, apenas o preenchimento dos dados (como está na prototipação). Então basicamente 
    só preencheremos a uma grande tabela que contém todos os atributos listados no model Solicitacao.
    - Vamos tentar criar novas formas de consulta. Um Get by name por exemplo, que retornaria todas as solicitações vinculadas ao nome 
    pesquisado.
    - Talvez criar um perfil (classes) de "administrador" para limitar o alcance de cada tipo de usuário. Por exemplo, apenas o adm poderia 
    usar o GetAll (pois se qualquer pessoa pudesse fazer isso violaria as leis de privacidade). Tem uma forma "simples" de fazer isso. 
    A gente gera uma key de adm passando um usuario e senha e pede essa key no Header da solicitação pra poder liberar o acesso á chamada.
    
