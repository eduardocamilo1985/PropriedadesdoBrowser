# Exemplo de como alterar as propriedados do navegador usando Selenium 🤖

<!--ts-->
* [Objetivo](#objetivo)
* [Tecnologias utilizadas](#tecnologia)
* [Utilização/estrutura](#utilizacao)
* [Links para consulta](#link)
<!--te-->

# <a name="objetivo"></a>Objetivo

Este projeto tem como objetivo demonstrar como é possivel alterar as propriedades do browser usando o Selenium WebDriver. Aqui vou utilizar o navegador Firefox.


**A necessidade**

Estava precisando criar um robô para acessar uma aplicação web e realizar o download de dois arquivos Excel. Até aí nada de mais, o problema é que o Selenium não controla a caixa de dialogo dos downloads e com isso inviabiliza o clique do botão salvar e muito menos escolher onde o arquivo será salvo.E para piorar a situação o nome do arquivo a cada download é aleatório, ou seja, o nome do arquivo baixado não é fixo (nessa aplicação que uso).  

Eu subi o mini projeto completo, mas como é uma aplicação de intranet o projeto não rodará no seu PC 😅 😬.... é o famoso "na minha máquina funciona" 🤣😂🤣😂🤣😂. O objetivo é demonstrar como manipular as propriedades do browser e juntamente com o Java manipular os arquivos. No tópico "Utilização/estrutura" eu explico as classes DriverFactory e Utilidades que são as classes onde mora a brincadeira. 


## <a name="tecnologia"></a>Tecnologias utilizadas

![Selenium](icon/SeleniumWebDriver.png)
![JUnit](icon/Junit.png)
![java](icon/java.png)
![Maven](icon/Maven.png)
![Eclipse](icon/eclipse.png)


**Linguagem:** Java

**Frameworks:** JUnit, Selenium WebDriver 3.14

**Integrador/Compilador:** Maven

**IDE:** Eclipse

## <a name="utilizacao"></a>Utilização/estrutura

Realizar o download do projeto (via git clone ou arquivo zip).

Importar o projeto na sua IDE de desenvolvimento favorita

**Estrutura do projeto**

A estrutura principal do projeto está localizada no diretório src/main/java. Os principais packages são:

* estrutura — Contém as classes estruturais do projeto (base para outras classes).
* page — Contém o mapeamento dos elementos das páginas.

O projeto utiliza os conceitos de DSL e Page Object

**Explicando algumas classes**

A classe **Basic** contém toda a parte Selenium utilizada. 

A classe **DriverFactory**: Contém a chamada do Driver e é aqui também que mudei as propriedades do navegador usando a classe FirefoxProfile. Para alterar a pasta de download usei a propriedade browser.download.folderList com o valor 2. Os valores podem ser definido como 0, 1 ou 2. Quando definido como 0, o Firefox salvará todos os arquivos baixados na área de trabalho do usuário. Quando definido como 1, esses downloads irão para a pasta padrão (geralmente Download). Quando definido como 2, o local especificado para o download mais recente é usado novamente.

Para salvar os arquivos automaticamente usei a propriedade "browser.helperApps.neverAsk.saveToDisk". Como o tipo de arquivo que queria salvar era xlsx coloquei "application/xlsx, xlsx" como segundo parâmetro. 

E por último, mas não menos importante, defini a propriedade "browser.download.dir" que é o local onde você deseja salvar os downloads, o segundo parâmetro é o caminho da pasta.  

 A classe **Utilidade**: É aqui que faço a manipulação dos arquivos. Propositalmente o arquivo é baixado em uma pasta que chamo de temporária e que sempre tá vazia. Logo depois de baixado eu pego o arquivo que está lá na pasta temporária e recorto (movo) para a pasta definitiva já com o nome correto do arquivo. E essa classe posso ser chamada infinitas vezes (eu chamo duas) pois o fato de mover o arquivo sempre garante que a pasta temp está vazia e ele pegará o arquivo certo. 


A **package Page** contém todo o mapeamento de elementos da aplicação. Para cada página da aplicação web,
existe uma classe chamada NomePaginaPage que estende da classe Basic. Exemplo página de login = LoginPage.

