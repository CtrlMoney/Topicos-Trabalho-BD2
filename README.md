# TRABALHO 01 : Ctrl+Money
Trabalho desenvolvido durante a disciplina de BD

    O referido projeto poderá ser:
        a) Um novo sistema/projeto 
        b) Uma expansão de sistema/projeto previamente desenvolvido em disciplinas anteriores 
        (ex: Expansão dos módulos do sistema desenvolvidos em BD1 - incremento mínimo de 50% nos 
        requisitos/complexidade)
        c) Nas avaliações parciais do professor, o grupo deverá anotar todas as observaçoes que forem feitas pelo professor 
        e pelo proprio grupo, enviar uma cópia das atividades por e-mail para o grupo e postar imediatamente estas observaçõe
        como tarefas a serem realizadas como tarefas por meio do gerenciador de projetos do git.
        d) Todas as tarefas devem ser realizadas e deve-se atentar para distribuição igualitária de atividades levando-se 
        em consideração o peso destas.
        e) Os tópicos numerados para cada atividade no devem ser removidos do trabalho. Entretanto, os conteúdos de exemplo 
        em cada tópico devem ser substituídos pelo conteúdo do trabalho em desenvolvimento.
        f) sprints de entrega serão quinzenais ou mensais definidos em aula juntamente com o professor
    
    OBS Importantes: 
        a) Os projetos/sistemas propostos serão validados pelo professor e pela turma
        b) Se possível é interessante que os novos sistemas estejam correlacionados com alguma área 
        previamente estudada pelo aluno
        c) Caso dependa de alguma instituição/parceiro externo, a base de dados e informações pertinentes 
        a esta devem ser obtidas no prazo de até 15 dias apos aprovação da proposta do trabalho 
        (caso contrário, nova proposta deverá ser apresentada a turma implicando logicamente em um prazo 
        mais curto para realização das atividades e conclusão do trabalho)
    
DICA: 
    O kickstart normalmente lança inovaçôes em termos de Sofwares e Apps, portanto pode ser interessante 
    olhar os lançamentos recentes para incrementar as possibilidades e aguçar a criatividade, o que pode 
    auxiliar o grupo com novas ideias na solução proposta. Acesse os links abaixo do para explorar sobre apps e softwares no Kickstarter.
    <br>
    https://www.kickstarter.com/discover/categories/technology/software
    <br>
    https://www.kickstarter.com/discover/categories/technology/apps
# Sumário

### 1	COMPONENTES<br>
Integrantes do grupo<br>
Brendon Mauro brendonmauro@gmail.com:<br>
Jennifer de Castro : jenny_cg23@hotmail.com<br>
Joel Will: joel-willb@hotmail.com <br>
Larrisa Motta: larissasantosdamotta@gmail.com<br>

### 2	INTRODUÇÃO E MOTIVAÇAO<br>
Este documento contém a especificação do projeto do banco de dados <b> Ctrl+Money</b>
<br>e motivação da escolha realizada. <br>

Ter um bom controle dos seus gastos é uma necessidade premente de todo cidadão. Tempo é dinheiro. E, dinheiro bem administrado, é sinônimo de sono tranquilo.
Portanto, Ctrl+Money  vai além do básico e permite que você faça controles incríveis, essenciais para suas finanças. Com gráficos simples, você sabe de onde vem e para onde vai o seu dinheiro e ainda oferece funcionalidades de previsão para auxiliar o melhor planejamento do seu futuro e poder instituir metas a serem cumpridas.
      
### 3	MINI-MUNDO<br>
O sistema opera com usuários cadastrando suas receitas e despesas de cada mês. Um usuário consegue acessar o portal através de um login e uma senha.
Para facilitar o gerenciamento de formas de pagamento, um usuário pode cadastrar seus cartões de crédito, informando o nome do cartão, seu limite, dia de fechamento da conta e data de vencimento da mesma.
Uma pessoa possui receitas e despesas, que serão subdivididas em categorias. As categorias envolvendo entrada de dinheiro são: salário, vendas, pensão e outros. Já as categorias envolvendo a saída de dinheiro são: alimentação, moradia, educação, transporte, lazer e outros. Um usuário poderá visualizar qual categoria é mais rentável ou gera mais gastos em um determinado mês. Além disso, o site será capaz de exibir o fluxo de caixa de um ano selecionado.
Dentro do portal, é possível exibir as receitas e/ou despesas de um determinado mês subdividindo em suas categorias. Dentro destas categorias, é possível detalhá-las, exibindo todos os itens de despesas referentes ao grupo selecionado.
As receitas possuem nome, valor, data de recebimento, e se é fixa. Já as despesas dispõem de nome, data de compra, forma de pagamento, além de valor e data de pagamento (se pago em dinheiro), ou valor da parcela e número de parcelas (caso seja pago no cartão). O cliente tem acesso a exibição dos gastos de um cartão selecionado em um determinado mês.
No final de cada mês, ocorre o fechamento de contas, onde é realizado um cálculo para saber se todas as contas foram de fato pagas. O usuário informa a quantia que realmente foi paga naquele mês específico e, caso não seja igual o valor total esperado para sanar todas as despesas daquele mês, é calculado a diferença entre o valor esperado e o valor real pago. O resultado obtido desta conta será somado no próximo mês, aparecendo como despesa acumulada.
As receitas e/ou despesas em dinheiro serão consideradas como recebidas e/ou pagas quando a data de recebimento/pagamento forem maiores ou iguais ao dia corrente.
Somando-se a isso, é possível um usuário ter acesso de total de receitas e/ou despesas de um mês específico. Além disso, é possível visualizar através de gráficos, o quanto de orçamento ele possui em caixa no momento atual. Este valor é calculado baseado no seu histórico, onde é somado o valor total resultante de todos os meses anteriores.
Será possível visualizar, através de um gráfico, a previsão de receitas, despesas e caixa disponíveis para o cliente nos próximos três meses após o mês atual. O cálculo é realizado de acordo com o histórico do usuário, portanto é imprescindível que o usuário possua pelo menos 3 meses com dados registrados.
Possíveis melhorias para um projeto futuro:
- Mostrar o quanto os juros pode impactar um usuário.
- Analisar o quanto de renda o usuário possui e assim, sugerir possíveis investimentos / aplicações do dinheiro baseado nos dados da bolsa e afins
Observação: as categorias são fixas baseadas em aplicaitvos reais pesqusados pelos membros do grupo

### 4	RASCUNHOS BÁSICOS DA INTERFACE (MOCKUPS)<br>

[Arquivo com os protótipos em html](https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Prototipo_Ctrl%2BMoney.zip)


### 5	MODELO CONCEITUAL<br>
#### 5.1 NOTACAO ENTIDADE RELACIONAMENTO
![Alt text](https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Modelos/Modelo%20conceitual.png "Modelo Conceitual")
    

## Data de Entrega: (23/08/2018) 
(Apresentação para o professor em sala de aula)

#### 5.3 DECISÕES DE PROJETO
	PARCELAMENTO: foi criada esta entidade que herda de despesa, para tratar despesas que são parceladas
	SEM_PARCELAMENTO: foi criada esta entida que herda de despesa, para tirar o atributo data_pag da tabela despesa, pois a data de pagamento de uma despesa parcelada já está cadastrada no cartão
	FORMA_PAG: foi criada esta entidade para dar ao usuário mais opções de formas de pagamento, além de dinheiro e cartão
	despesa_fixa: este atributo foi criado para adicionar, nos próximos meses, a despesa que foi marcada como fixa
	receita_fixa: este atributo foi criado para adicionar, nos próximos meses, a receita que foi marcada como fixa																																					
#### 5.4 DESCRIÇÃO DOS DADOS 
    
    USUARIO : Tabela que contém dados básicos comuns a usuario
		id : campo que armazena o identificador do usuário
		login: Campo que armazena o login do usuario
		senha: Campo que armazena a senha do usuario
    PESSOA : Tabela que contém dados sobre pessoa
		id: campo identificador de pessoa
		nome: Campo que armazena o nome da pessoa (e usuario)
		data_nasc: Campo que armazena a data_nasc da pessoa (e usuario)
		cpf: campo que aramazena o cpf da pessoa (e usuario)
    CARTAO : Tabela que armazena dados do cartão
		id: campo que armazena o identificador do cartão
		nome: campo que armazena o nome do proprietário do cartão
		limite: campo que armazena o limite de compra do cartão
		dia_fechamento: campo que armazena o dia de fechamento, de cada mês, do cartão
		dia_vencimento: campo que armazena da data de vencimento, de cada mês, do cartão
		numero: campo que armazena o númerodo cartão	
    DESPESA : Tabela que contém dados sobre a despesa
		id: campo que armazena o identificador da despesa
		valor: campo que armazena o valor da despesa
		nome: campo que armazena o nome da despesa
		data_pag: campo que armazena a data que será(ou foi) efetuado o pagamento   
		data_compra: campo que armazena a data que foi feita a compra da despesa
		despesa_fixa: este campo identifica se a despesa é fixa ou não (se será adicionada ou não aos próximos meses)
    CATEGORIA_DESPESA : Tabela que possui atributos que identificam a categoria da despesa
		id: campo que armazena o identificador da categoria da despesa
		nome_categ: campo que armazena o nome da categoria da despesa
    FORMA_PAG : Tabela que permite colocar formas de pagamento da despesa
		id: campo que armazena o identificador da forma de pagamento
		tipo_pag: campo que armazena o tipo da forma de pagamento
    PARCELAMENTO : Tabela que contém dados sobre o número de parcelamento de uma despesa
		num_parcelas : campo que armazena o número de parcelas de um parcelamento realizado
    SEM_PARCELAMENTO : Tabela que contém dados sobre despesa não parcelada
		data_pag: campo que
    RECEITA: Tabela que armazena dados sobre a receita
		id: campo que armazena o identificador da receita
		nome: campo que armazena o nome da receita
		valor: campo que armazena o valor(em reais) da receita
		data_recebimento: campo que aramazena o valor que foi creditado a receita
		receita_fixa: campo que armazena se a receita é fixa ou não(se será adicionada ou não aos próximos meses)
    CATEGORIA_RECEITA : Tabela que possui atributos que identificam a categoria da receita
		id: campo que armazena o identificador da categoria da receita
		nome_categ: campo que armazena o nome da categoria da despesa


### 6	MODELO LÓGICO<br>

![Alt text](https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Modelos/Modelo%20Logico.png "Modelo Lógico")

### 7	MODELO FÍSICO<br>

[MODELO FISICO](https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Modelos/ModeloFisico.sql "Modelo Fisico")

### 8	INSERT APLICADO NAS TABELAS DO BANCO DE DADOS<br>
#### 8.1 DETALHAMENTO DAS INFORMAÇÕES
        Detalhamento sobre as informações e processo de obtenção ou geração dos dados.
        Referenciar todas as fontes referentes a:
        a) obtenção dos dados
        b) obtenção de códigos reutilizados
        c) fontes de estudo para desenvolvimento do projeto
        
#### 8.2 INCLUSÃO DO SCRIPT PARA CRIAÇÃO DE TABELAS E INSERÇÃO DOS DADOS (ARQUIVO ÚNICO COM):
        a) inclusão das instruções para criação das tabelas e estruturas de amazenamento do BD
        b) inclusão das instruções de inserção dos dados nas referidas tabelas
        c) inclusão das instruções para execução de outros procedimentos necessários

### 9	TABELAS E PRINCIPAIS CONSULTAS<br>
#### 9.1	GERACAO DE DADOS (MÍNIMO DE 10 REGISTROS PARA CADA TABELA NO BANCO DE DADOS)<br>

## Data de Entrega: (06/09/2018)

<br>
OBS: Incluir para os tópicos 9.2 e 9.3 as instruções SQL + imagens (print da tela) mostrando os resultados.<br>

#### 9.2	SELECT DAS TABELAS COM PRIMEIROS 10 REGISTROS INSERIDOS <br> 
    
<br>

#### 9.3	SELECT DAS VISÕES COM PRIMEIROS 10 REGISTROS DA VIEW <br>
        a) Descrição da view sobre que grupos de usuários (operacional/estratégico) <br>
        e necessidade ela contempla.
        b) Descrição das permissões de acesso e usuários correlacionados (após definição <br>
        destas características)
        c) as funcionalidades informadas no minimundo ou nos mockups(protótipos), que representarem 
        views do sistema (relatórios, informações disponíveis para os usuários, etc) devem estar 
        presentes aqui. 
<br>

#### 9.4	LISTA DE CODIGOS DAS FUNÇÕES, ASSERÇOES E TRIGGERS<br>
        Detalhamento sobre funcionalidade de cada código.
        a) Objetivo
        b) Código do objeto (função/trigger/asserção)
        c) exemplo de dados para aplicação
        d) resultados em forma de tabela/imagem
<br>

## Data de Entrega: (27/09/2018)

#### 9.5	Administração do banco de dados<br>
        Descrição detalhada sobre como serão executadas no banco de dados as <br>
        seguintes atividades.
        a) Segurança e autorização de acesso: especificação básica de configurações de acesso remoto
        b) Estimativas de aquisição de recursos para armazenamento e processamento da informação
        c) Planejamento de rotinas de manutenção e monitoramento do banco
        d) Plano com frequencia de análises visando otimização de performance
<br>

#### 9.6	GERACAO DE DADOS (MÍNIMO DE 1,5 MILHÃO DE REGISTROS PARA PRINCIPAL RELAÇAO)<br>
        a) principal tabela do sistema deve ter no mínimo 1,5 milhão de registros
        b) tabelas diretamente relacionadas a tabela principal 100 mil registros
        c) tabelas auxiliares de relacao multivalorada mínimo de 10 registros
        d) registrar o tempo de inserção em cada uma das tabelas do banco de dados
        e) especificar a quantidade de registros inseridos em cada tabela
        Para melhor compreensão verifiquem o exemplo na base de testes:<br>
        https://github.com/discipbd2/base-de-testes-locadora
        
## Data de Entrega: (31/10/2018)

#### 9.7	Backup do Banco de Dados<br>
        Detalhamento do backup.
        a) Tempo
        b) Tamanho
        c) Teste de restauração (backup)
        d) Tempo para restauração
        e) Teste de restauração (script sql)
        f) Tempo para restauração (script sql)
<br>


#### 9.8	APLICAÇAO DE ÍNDICES E TESTES DE PERFORMANCE<br>
    a) Lista de índices, tipos de índices com explicação de porque foram implementados nas consultas 
    b) Performance esperada VS Resultados obtidos
    c) Tabela de resultados comparando velocidades antes e depois da aplicação dos índices (constando velocidade esperada com planejamento, sem indice e com índice Vs velocidade de execucao real com índice e sem índice).
    d) Escolher as consultas mais complexas para serem analisadas (consultas com menos de 2 joins não serão aceitas)
    e) As imagens do Explain devem ser inclusas no trabalho, bem como explicações sobre os resultados obtidos.
    f) Inclusão de tabela mostrando as 10 execuções, excluindo-se o maior e menor tempos para cada consulta e 
    obtendo-se a media dos outros valores como resultado médio final.
<br>

## Data de Entrega: (22/11/2018)

<br>   

#### 9.9 TRABALHO EM DUPLA - Machine Learning e Data Mining
### Estudar algum dos algoritmos abaixo
### Incluir no trabalho os seguintes tópicos: 
* Explicação/Fundamentação teórica sobre o método, objetivos e restrições! (formato doc/odt ou PDF)
* Onde/quando aplicar 
> ##### Estudar e explicar artigo que aplique o método de mineração de dados/machine learning escolhido
* exemplo de uso/aplicação 
> ##### a) Implementar algoritmo de básico de exemplo obtido na literatura (enviar código executável junto do trabalho com detalhamento de explicação para uso passo a passo)
> #####  b) Aplicar em alguma base de dados aberta (governamental ou sites de datasets disponíveis), registrar e apresentar resultados e algoritmo desenvolvido.

Exemplos de métodos/algoritmos a serem estudados
* "Nearest Neighbors" 
* "Linear SVM" 
* "RBF SVM" 
* "Decision Tree" 
* "Random Forest"
* Pca  
* "Naive Bayes"
<br>
Referência: http://scikit-learn.org/stable/index.html
<br>
Referências adicionais:
Scikit learning Map : http://scikit-learn.org/stable/tutorial/machine_learning_map/index.html
Machine learning in Python with scikit-learn: https://www.youtube.com/playlist?list=PL5-da3qGB5ICeMbQuqbbCOQWcS6OYBr5A



<br>

## Data de Entrega: (06/12/2018)


### 10	ATUALIZAÇÃO DA DOCUMENTAÇÃO/ SLIDES E ENTREGA FINAL<br>
       
### 11  FORMATACAO NO GIT: https://help.github.com/articles/basic-writing-and-formatting-syntax/
<comentario no git>
    
##### About Formatting
    https://help.github.com/articles/about-writing-and-formatting-on-github/
    
##### Basic Formatting in Git
    
    https://help.github.com/articles/basic-writing-and-formatting-syntax/#referencing-issues-and-pull-requests
    
    
##### Working with advanced formatting
    https://help.github.com/articles/working-with-advanced-formatting/
#### Mastering Markdown
    https://guides.github.com/features/mastering-markdown/

### OBSERVAÇÕES IMPORTANTES

#### Todos os arquivos que fazem parte do projeto (Imagens, pdfs, arquivos fonte, etc..), devem estar presentes no GIT. Os arquivos do projeto vigente não devem ser armazenados em quaisquer outras plataformas.
1. Caso existam arquivos com conteúdos sigilosos, comunicar o professor que definirá em conjunto com o grupo a melhor forma de armazenamento do arquivo.

#### Todos os grupos deverão fazer Fork deste repositório e dar permissões administrativas ao usuário deste GIT, para acompanhamento do trabalho.

#### Os usuários criados no GIT devem possuir o nome de identificação do aluno (não serão aceitos nomes como Eu123, meuprojeto, pro456, etc). Em caso de dúvida comunicar o professor.


Link para BrModelo:<br>
http://sis4.com/brModelo/brModelo/download.html
<br>


Link para curso de GIT<br>
![https://www.youtube.com/curso_git](https://www.youtube.com/playlist?list=PLo7sFyCeiGUdIyEmHdfbuD2eR4XPDqnN2?raw=true "Title")



