# Getters and Setters - FIAP - Fase 5

## Atividade 1 - Capítulo 2


### Diagrama de Classes
O diagrama retrata os objetos utilizados na area de login do site Gulliver Traveller, tratando-se das informações de sessão e do usuário.

<p align="center">
<img src="images/site_login_beans.png" alt="Diagrama de Classes">
</p>

### Classes Modelos - Beans

Representações dos objetos descritos no diagrama.

<img src="images/classes.png" alt="Classes Modelos" width="400px">

### Classes de Serviço

A implementação e a classe de login, a que irá preencher as informações do usuário.

<img src="images/services.png" alt="Classes de Serviço" width="400px">

### Descrição e Justificativa da solução.

Mockando uma funcionalidade de login, além das classes que possibilitam esse fluxo, foi necessário criar uma outra classe para simular uma situação de login, a qual põe a teste o uso do construtor da classe Usuario.

<img src="images/loginService.png" alt="Classe de teste de login" width="800px">

A classe Usuario possui todas as suas propriedades privadas, porém, apenas uma é constante e só tem seu valor agregado qnd sua instância é gerada, o idUsuario, isso é para que em nenhum momento do código esse campo seja alterado.

<img src="images/usuario.png" alt="Classe de informações do usuário" width="800px">

A propriedade origem é descrita pela classe OrigemUsuario.

<img src="images/origemUsuario.png" alt="Classe da propriedade origem usuário" width="800px">

A sessao do usuário é a visão completa em tempo de acesso, e ela, também precisou limitar a edição dos seus campos, se tratando de uma sessão real, a qual não pode ser mais alterada assim que gerada.

<img src="images/sessao.png" alt="Classe de Sessão" width="800px">

Por ultimo, a classe que possibilita testar o fluxo, a Main, com dois cenários possiveis no término de sua execução. Se o AccessToken for preenchido, o usuário Victor Simas será Logado, se não, não será possivel fazer o login.

<img src="images/main.png" alt="Classe principal" width="800px">