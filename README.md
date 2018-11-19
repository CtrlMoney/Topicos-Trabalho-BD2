# TRABALHO 01 : CtrlMoney
Trabalho desenvolvido durante a disciplina de BD

# Sumário

### 1	COMPONENTES<br>
Integrantes do grupo<br>
Brendon Mauro : brendonmauro@gmail.com<br>
Jennifer de Castro : jenny_cg23@hotmail.com<br>
Joel Will : joel-willb@hotmail.com <br>
Larrisa Motta : larissasantosdamotta@gmail.com<br>

### 2	INTRODUÇÃO E MOTIVAÇAO<br>
Este documento contém a especificação do projeto do banco de dados <b> CtrlMoney</b>
<br>e motivação da escolha realizada. <br>

Ter um bom controle dos seus gastos é uma necessidade premente de todo cidadão. Tempo é dinheiro. E, dinheiro bem administrado, é sinônimo de sono tranquilo.
Portanto, CtrlMoney  vai além do básico e permite que você faça controles incríveis, essenciais para suas finanças. Com gráficos simples, você sabe de onde vem e para onde vai o seu dinheiro e ainda oferece funcionalidades de previsão para auxiliar o melhor planejamento do seu futuro e poder instituir metas a serem cumpridas.
      
### 3	MINI-MUNDO<br>
O sistema opera com usuários cadastrando suas receitas e despesas de cada mês. Um usuário consegue acessar o portal através de um login e uma senha.
Para facilitar o gerenciamento de formas de pagamento, um usuário pode cadastrar seus cartões de crédito, informando o nome do cartão, seu limite, dia de fechamento da conta e data de vencimento da mesma.
Uma pessoa possui receitas e despesas, que serão subdivididas em categorias. As categorias envolvendo entrada de dinheiro são: salário, vendas, pensão e outros. Já as categorias envolvendo a saída de dinheiro são: alimentação, moradia, educação, transporte, lazer e outros. Um usuário poderá visualizar qual categoria é mais rentável ou gera mais gastos em um determinado mês. Além disso, o site será capaz de exibir o fluxo de caixa de um ano selecionado.
Dentro do portal, é possível exibir as receitas e/ou despesas de um determinado mês subdividindo em suas categorias. Dentro destas categorias, é possível detalhá-las, exibindo todos os itens de despesas referentes ao grupo selecionado.
As receitas possuem nome, valor, data de recebimento, e se é fixa. Já as despesas dispõem de nome, data de compra, forma de pagamento, além de valor e data de pagamento (se pago em dinheiro), ou valor da parcela e número de parcelas (caso seja pago no cartão). É possível realizar um pagamento sem parelamento.O cliente tem acesso a exibição dos gastos de um cartão selecionado em um determinado mês.
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
![Alt text](https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Modelos/Modelo%20Conceitual.png "Modelo Conceitual")
    

## Data de Entrega: (23/08/2018) 
(Apresentação para o professor em sala de aula)

#### 5.3 DECISÕES DE PROJETO
	PARCELAMENTO: foi criada esta entidade que herda de despesa, para tratar despesas que são parceladas
	SEM_PARCELAMENTO: foi criada esta entidade que herda de despesa, para tirar o atributo data_pag da tabela despesa, pois a data de pagamento de uma despesa parcelada já está cadastrada no cartão
	FORMA_PAG: foi criada esta entidade para dar ao usuário mais opções de formas de pagamento, além de dinheiro e cartão
	despesa_fixa: este atributo foi criado para adicionar, nos próximos meses, a despesa que foi marcada como fixa
	receita_fixa: este atributo foi criado para adicionar, nos próximos meses, a receita que foi marcada como fixa																																					
#### 5.4 DESCRIÇÃO DOS DADOS 
    
    USUARIO : Tabela que contém dados básicos comuns a usuário
		id : campo que armazena o identificador do usuário
		login: Campo que armazena o login do usuário
		senha: Campo que armazena a senha do usuário
    PESSOA : Tabela que contém dados sobre pessoa
		id: campo identificador de pessoa
		nome: Campo que armazena o nome da pessoa (e usuário)
		data_nasc: Campo que armazena a data_nasc da pessoa (e usuário)
		cpf: campo que armazena o cpf da pessoa (e usuário)
    CARTAO : Tabela que armazena dados do cartão
		id: campo que armazena o identificador do cartão
		nome: campo que armazena o nome do proprietário do cartão
		limite: campo que armazena o limite de compra do cartão
		dia_fechamento: campo que armazena o dia de fechamento, de cada mês, do cartão
		dia_vencimento: campo que armazena da data de vencimento, de cada mês, do cartão
		numero: campo que armazena o número do cartão	
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
		data_pag: campo que foi feito o pagamento
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
		Os dados são gerados por um programa feito em Java tendo com saida um arquivo .sql com os dados
        b) obtenção de códigos reutilizados
		Foi utilizado a biblioteca Faker.
        c) fontes de estudo para desenvolvimento do projeto
		Foram utilizados os slides do AVA explicando o Java Faker e também a documentação do mesmo
	
        
#### 8.2 INCLUSÃO DO SCRIPT PARA CRIAÇÃO DE TABELAS E INSERÇÃO DOS DADOS (ARQUIVO ÚNICO COM):
        a) inclusão das instruções para criação das tabelas e estruturas de amazenamento do BD
[Link para o Modelo Físico](https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Modelos/ModeloFisico.sql)<br/>

	b) inclusão das instruções de inserção dos dados nas referidas tabelas
	
[Link para o programa faker](https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/fake.zip)

        c) inclusão das instruções para execução de outros procedimentos necessários
		Não há outros procedimentos além dos anteriores 


### 9	TABELAS E PRINCIPAIS CONSULTAS<br>
#### 9.1	GERACAO DE DADOS (MÍNIMO DE 10 REGISTROS PARA CADA TABELA NO BANCO DE DADOS)<br>

## Data de Entrega: (06/09/2018)

<br>
OBS: Incluir para os tópicos 9.2 e 9.3 as instruções SQL + imagens (print da tela) mostrando os resultados.<br>

#### 9.2	SELECT DAS TABELAS COM PRIMEIROS 10 REGISTROS INSERIDOS <br> 
```sql
--SELECT 1:
SELECT * FROM pessoa_usuario LIMIT 10;
```
 <br> 
 <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints9_2/pessoa_usuario.PNG"></p>


```sql
--SELECT 2:
SELECT * FROM receita LIMIT 10;
```
 <br> 
  <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints9_2/receita.PNG"></p>
 <br> 

```sql
--SELECT 3:
SELECT * FROM categoria_receita LIMIT 10;
```
 <br> 
   <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints9_2/categoria_receita.PNG"></p>


```sql
--SELECT 4:
SELECT * FROM despesa LIMIT 10;
```
 <br> 
 <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints9_2/despesa.png"></p>



```sql
--SELECT 5:
SELECT * FROM forma_pag LIMIT 10;
```
 <br> 
  <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints9_2/forma_pag.PNG"></p>
 <br> 

```sql
--SELECT 6:
SELECT * FROM categoria_despesa LIMIT 10;
```
 <br> 
  <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints9_2/categoria_despesa.PNG"></p>
 <br> 

```sql
--SELECT 7:
SELECT * FROM parcelamento LIMIT 10;
```

 <br> 
 <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints9_2/parcelamento.PNG"></p>


```sql
--SELECT 8:
SELECT * FROM pessoa_cartao LIMIT 10;
```
 <br> 
  <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints9_2/pessoa_cartao.PNG"></p>
 <br> 

```sql
--SELECT 9:
SELECT * FROM cartao LIMIT 10;
```
 <br> 
  <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints9_2/cartao.png"></p>
 <br> 
 
 ```sql
--SELECT 10:
SELECT * FROM sem_parcelamento LIMIT 10;
```
 <br> 
  <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints9_2/sem_parcelamento.PNG"></p>
 <br> 

<br>

#### 9.3	SELECT DAS VISÕES COM PRIMEIROS 10 REGISTROS DA VIEW <br>
        a) Descrição da view sobre que grupos de usuários (operacional/estratégico) <br>
        e necessidade ela contempla.
        b) Descrição das permissões de acesso e usuários correlacionados (após definição <br>
        destas características)
        c) as funcionalidades informadas no minimundo ou nos mockups(protótipos), que representarem 
        views do sistema (relatórios, informações disponíveis para os usuários, etc) devem estar 
        presentes aqui. 


```sql
a) A view contempla uma necessidade interna de descobrir a média de idade dos usuários cadastrados no sistema, pois com esse dado é possível realizar uma análise de possíveis melhorias voltado ao público alvo, ou até mesmo realizar um estudo de como atrair usuários de outras faixas etárias.
b) Apenas os administradores terão acesso a saber desta informação.
c) Relatórios
--SELECT DA VIEW 1:
SELECT * FROM View_MediaIdade;
```
 <br> 
 <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.3/MediaIdade.png"</p>
<br>
	
 
 ```sql
 a) A view seleciona um grupo de usuários que possuem mais despesas do que receitas,podendo levantar estatísticas de usuários que estão endividados.
 b) Apenas os administradores poderão ter acesso desta informação.
 c) A funcionalidade seria tanto para o usuário ter um relatório do seu fluxo de caxa, através de um gráfico, quanto para a alimentação interna do prórpio sistema.
--SELECT DA VIEW 2:
SELECT * FROM View_Despesas_Acima3K_ou_Receitas_Abaixo1k;
```
 <br> 
  <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.3/DespesaAcima3k.png"</p>

```sql
a) A view contempla uma necessidade dos usuários visualizar dívidas que são pagas a vista.
b) Os usuários terão acesso.
c) Relatórios
--SELECT DA VIEW 3:
SELECT * FROM View_DividasAVista;
```
 <br> 
 <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.3/dividas_avista.png"</p>
<br>
	
```sql
a) A view contempla uma necessidade dos usuários visualizar dívidas que são parceladas.
b) Os usuários terão acesso de visualização das parcelas, contemplando a categoria,nome da despesa e valor.
c) Relatórios
--SELECT DA VIEW 4:
SELECT * FROM View_DividasParceladas;
```
 <br> 
 <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.3/dividas_parceladas.png"</p>
<br>

```sql
a) A view contempla uma necessidade dos usuários visualizar suas receitas e respectivas categorias de cada uma.
b) Os usuários terão acesso de visualizar suas receitas, valor e categoria.
c) Relatórios
--SELECT DA VIEW 5:
SELECT * FROM View_Receitas;
```
 <br> 
 <p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.3/receitas_view.png"</p>
<br>
		
<br>
<br>


#### 9.4	LISTA DE CODIGOS DAS FUNÇÕES, ASSERÇOES E TRIGGERS<br>
        Detalhamento sobre funcionalidade de cada código.
        a) Objetivo
        b) Código do objeto (função/trigger/asserção)
        c) exemplo de dados para aplicação
        d) resultados em forma de tabela/imagem
<br>

```sql
a) Deseja-se saber quantos reais uma pessoa pagará de fatura em um determinado mês
b) 
CREATE OR REPLACE FUNCTION fatura_cartoes_do_mes(pessoa_id INTEGER, mes INTEGER, ano INTEGER)
RETURNS DOUBLE PRECISION AS $$
	SELECT SUM(despesa.valor / parcelamento.num_parcelas) FROM despesa
	INNER JOIN pessoa_usuario on (pessoa_usuario.id = despesa.fk_pessoa_usuario)
	INNER JOIN parcelamento on (parcelamento.fk_despesa = despesa.id)
	WHERE pessoa_usuario.id = pessoa_id AND
	despesa.data_compra > concat(ano,'-',mes,'-',1)::date AND
	despesa.data_compra < (date_trunc('month', concat(ano,'-',mes,'-',1)::date) + interval '1 month' - interval '1 day')::date;
$$ LANGUAGE SQL;

c)
-- Parâmetros: Id da pessoa, Mês e Ano
SELECT fatura_cartoes_do_mes(2291, 11,2018);
d) 

```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.4/fatura.png"</p>
<br>

```sql
a) Deseja-se saber quantos reais uma pessoa pagou à vista em um determinado mês
b)
CREATE OR REPLACE FUNCTION despesas_avista_do_mes(pessoa_id INTEGER, mes INTEGER, ano INTEGER)
RETURNS REAL AS $$
	SELECT SUM(despesa.valor) FROM despesa
	INNER JOIN sem_parcelamento on (sem_parcelamento.fk_despesa = despesa.id)
	INNER JOIN pessoa_usuario on (pessoa_usuario.id = despesa.fk_pessoa_usuario)
	WHERE pessoa_usuario.id = pessoa_id AND
	despesa.data_compra > concat(ano,'-',mes,'-',1)::date AND
	despesa.data_compra < (date_trunc('month', concat(ano,'-',mes,'-',1)::date) + interval '1 month' - interval '1 day')::date;
$$ LANGUAGE SQL;

c) -- Parâmetros: Id da pessoa, mês e ano
SELECT despesas_avista_do_mes(2291, 11,2018);

d) 
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.4/avista.png"</p>
<br>

```sql
a) Deseja-se saber quantos reais uma pessoa recebeu em um determinado mês
b)
CREATE OR REPLACE FUNCTION receitas_do_mes(pessoa_id INTEGER, mes INTEGER, ano INTEGER)
RETURNS REAL AS $$
	SELECT SUM(receita.valor) FROM receita
	INNER JOIN pessoa_usuario on (pessoa_usuario.id = receita.fk_pessoa_usuario)
	WHERE pessoa_usuario.id = pessoa_id AND
	receita.data_recebimento > concat(ano,'-',mes,'-',1)::date AND
	receita.data_recebimento < (date_trunc('month', concat(ano,'-',mes,'-',1)::date) + interval '1 month' - interval '1 day')::date;
$$ LANGUAGE SQL;

c)-- Parâmetros: Id da pessoa, mês e ano
SELECT receitas_do_mes(2291, 11,2018);

d) 
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.4/receitas.png"</p>
<br>

```sql
a) Deseja-se saber qual é o caixa de uma pessoa em um determinado mês
b)
CREATE OR REPLACE FUNCTION caixa_do_mes(pessoa_id INTEGER, mes INTEGER, ano INTEGER)
RETURNS DOUBLE PRECISION AS $$
	SELECT receitas_do_mes(pessoa_id,mes,ano) - despesas_avista_do_mes(pessoa_id,mes,ano) - fatura_cartoes_do_mes(pessoa_id,mes,ano)
$$ LANGUAGE SQL;

c) -- Parâmetros: Id da pessoa, mês e ano
SELECT caixa_do_mes(2291, 11,2018);

d) 
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.4/caixa.png"</p>
<br>
	
```sql
a) Trigger que apaga o cartão caso ele não se relacione com nenhuma outra pessoa, ao deletar um relacionamento do cartão com uma pessoa
b)
CREATE OR REPLACE FUNCTION deleta_cartao_nao_usado()
RETURNS TRIGGER AS $$
	BEGIN
	IF NOT EXISTS (
		SELECT * FROM pessoa_cartao
		WHERE pessoa_cartao.fk_cartao = OLD.fk_cartao
	) THEN
		DELETE FROM cartao WHERE cartao.id = OLD.fk_cartao;
	END IF;
	RETURN NULL;
	END;
$$ LANGUAGE plpgsql;


CREATE TRIGGER deleta_cartao_nao_usado
AFTER DELETE ON pessoa_cartao
FOR EACH ROW
EXECUTE PROCEDURE deleta_cartao_nao_usado();

c) -- Parâmetro: Id do Cartão
DELETE FROM pessoa_cartao WHERE pessoa_cartao.fk_cartao = 13;

d) 
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.4/deleta_cartao_nao_usado.PNG"</p>
<br>

```sql
a) Deseja-se restringir os valores de receitas sendo maior que 0.
b)

CREATE ASSERTION valores_validos_receita
	CHECK (NOT EXISTS
			(SELECT *FROM pessoa_usuario P
			INNER JOIN receita R on R.fk_pessoa_usuario = P.id
			WHERE R.valor >= 0));

OBS.: ASSERTION não é suportado no PostegreSQL então foi utilizado trigger

CREATE OR REPLACE FUNCTION verificaValoresReceita() RETURNS TRIGGER AS'
	begin
    	if exists (SELECT * FROM pessoa_usuario P
					INNER JOIN receita R on R.fk_pessoa_usuario = P.id
					WHERE R.valor >= 0) then Raise Exception
                    		''ERRO, Valor menor que 0'';
        end if;
        return null;
	end;
'
LANGUAGE plpgsql;

create trigger checaValoresReceita
after insert or update of valor on receita
for each row
execute procedure verificaValoresReceita();


c) 
insert into receita (valor, data_recebimento,fixo,nome,fk_pessoa_usuario,fk_categoria_receita) values (-10,'11-11-1998',false,'teste',1,1);

d) 
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.4/msgErroReceita.jpeg.png"</p>
<br>


```sql
a) Deseja-se restringir os valores de Despesa sendo maior que 0.
b)

CREATE ASSERTION valores_validos_despesa
	CHECK (NOT EXISTS
			(SELECT * FROM pessoa_usuario P
			INNER JOIN despesa D on D.fk_pessoa_usuario = P.id
			WHERE D.valor >= 0));

OBS.: ASSERTION não é suportado no PostegreSQL então foi utilizado trigger

CREATE OR REPLACE FUNCTION verificaValoresDespesa() RETURNS TRIGGER AS'
	begin
    	if exists (SELECT * FROM pessoa_usuario P
					INNER JOIN despesa D on D.fk_pessoa_usuario = P.id
					WHERE D.valor >= 0) then Raise Exception
                    		''ERRO, Valor menor que 0'';
        end if;
        return null;
	end;
'
LANGUAGE plpgsql;

create trigger checaValoresDespesa
after insert or update of valor on despesa
for each row
execute procedure verificaValoresDespesa();


c) 
insert into despesa (valor,data_compra,fixo,nome,fk_pessoa_usuario,fk_categoria_despesa,fk_forma_pag) values (-10,'11-11-1998',false,'teste',1,1,1);

d) 
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.4/msgErroDespesa.jpeg"</p>
<br>
	
## Data de Entrega: (27/09/2018)

#### 9.5	Administração do banco de dados<br>
        Descrição detalhada sobre como serão executadas no banco de dados as <br>
        seguintes atividades.
        a) Segurança e autorização de acesso: especificação básica de configurações de acesso remoto
        b) Estimativas de aquisição de recursos para armazenamento e processamento da informação
		Possivelmente o que irá determinar a quantidade de recursos necessários será a quantidade de dados
		armazenados nas tabelas Receita e Despesa (principalmente), sendo que se terá maior uso durante o dia
		5 e 12 de cada mês, já que nesse período geralmente é feito os pagamentos dos sálarios, e por isso as 
		pessoas costumam gastar dinheiro, ou seja, mais despesas no sistema. Logo se estima que se terá mais
		aquisições de recursos durante esse período.
        c) Planejamento de rotinas de manutenção e monitoramento do banco
		Pelo mesmo motivo descrito na letra "b", pode se dizer que, deve se ter maior atenção em relação de
		monitoramento e manutenção do banco nos períodos de pagamento de salário
        d) Plano com frequencia de análises visando otimização de performance
		Também pelo mesmo motivo da letra "b", as análises devem ser feitas logo após essa alta de inserções
		de dados no banco, para saber se com esses novos dados, alguma consulta foi prejudicada em relação a desempenho
<br>

#### 9.6	GERACAO DE DADOS (MÍNIMO DE 1,5 MILHÃO DE REGISTROS PARA PRINCIPAL RELAÇAO)<br>
        a) principal tabela do sistema deve ter no mínimo 1,5 milhão de registros
        b) tabelas diretamente relacionadas a tabela principal 100 mil registros
        c) tabelas auxiliares de relacao multivalorada mínimo de 10 registros
        d) registrar o tempo de inserção em cada uma das tabelas do banco de dados
        e) especificar a quantidade de registros inseridos em cada tabela
        Para melhor compreensão verifiquem o exemplo na base de testes:<br>
        https://github.com/discipbd2/base-de-testes-locadora
	
d) Tempo de inserção de todos os dados gerados no faker é de aproximadamente 4 minutos e 34 segundos
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.6/TimeInser%C3%A7%C3%A3o.png"</p>
<br>

e)
```sql
--Quantidade de registros na tabela "cartao"
SELECT COUNT(*) as Qnt_Rows_Cartao FROM cartao;
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.6/rowsCartao.PNG"</p>
<br>

```sql
--Quantidade de registros na tabela "categoria_despesa"
SELECT COUNT(*) as Qnt_Rows_categoria_despesa FROM categoria_despesa;
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.6/rowsCatDespesa.PNG"</p>
<br>

```sql
--Quantidade de registros na tabela "categoria_receita"
SELECT COUNT(*) as Qnt_Rows_categoria_receita FROM categoria_receita;
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.6/rowsCatReceita.PNG"</p>
<br>
	
```sql
--Quantidade de registros na tabela "despesa"
SELECT COUNT(*) as Qnt_Rows_despesa FROM despesa;
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.6/rowsDespesa.PNG"</p>
<br>

```sql
--Quantidade de registros na tabela "forma_pag"
SELECT COUNT(*) as Qnt_Rows_forma_pag FROM forma_pag;
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.6/rowsFormaPag.PNG"</p>
<br>

```sql
--Quantidade de registros na tabela "parcelamento"
SELECT COUNT(*) as Qnt_Rows_parcelamento FROM parcelamento;
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.6/rows_parcelamento.PNG"</p>
<br>

```sql
--Quantidade de registros na tabela "pessoa_cartao"
SELECT COUNT(*) as Qnt_Rows_pessoa_cartao FROM pessoa_cartao;
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.6/rowsPessoaCartao.PNG"</p>
<br>

```sql
--Quantidade de registros na tabela "pessoa_usuario"
SELECT COUNT(*) as Qnt_Rows_pessoa_usuario FROM pessoa_usuario;
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.6/rowsPessoaUsuario.PNG"</p>
<br>

```sql
--Quantidade de registros na tabela "receita"
SELECT COUNT(*) as Qnt_Rows_receita FROM receita;
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.6/rowsReceita.PNG"</p>
<br>

```sql
--Quantidade de registros na tabela "sem_parcelamento"
SELECT COUNT(*) as Qnt_Rows_sem_parcelamento FROM sem_parcelamento;
```
<br>
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/prints_9.6/rowsSemParcelamento.PNG"</p>
<br>
        
## Data de Entrega: (31/10/2018)

#### 9.7	Backup do Banco de Dados<br>
        Detalhamento do backup.
        a) Tempo: .backup(15.47 s), .sql(6.25 s)  
        b) Tamanho: .backup(65.6 MB), .sql(219.5 MB)
        c) Teste de restauração (backup)
<p align="center"><img src="https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/Imagens/Prints_9.7/Print%20restore%20custom.png"</p>
<br>
        
	d) Tempo para restauração: 22.13 s
        e) Teste de restauração (script sql): Não rodou
        f) Tempo para restauração (script sql): Não rodou
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


[Apresentação em PDF](https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/9.8/Apresenta%C3%A7%C3%A3o%20%C3%ADndices%20-%20BD2.pdf)

[Apresentação docs Google](https://docs.google.com/presentation/d/1FYhVtQqbM2VrTlBEtrnqJfffn33vyJW2s9wJzsmRfBs/edit#slide=id.g481a856c00_1_312)

[PDF com os dados coletados com o índice](https://github.com/CtrlMoney/Topicos-Trabalho-BD2/blob/master/9.8/Coleta%20de%20dados%20%C3%ADndices.pdf)

a)
Índices utilizados:<br>
```sql
CREATE INDEX idx_despesa ON despesa(fk_pessoa_usuario); 
CREATE INDEX idx_receita ON receita(fk_pessoa_usuario); 
CREATE INDEX idx_parcelamento ON parcelamento(fk_cartao); 
```

<p>
Todos os índices utilizados são do tipo B-tree, pois é um dos mais utilizados (para os casos mais comuns) e utiliza o algoritmo "árvore binária balanceada" que é bem eficiente, tendo como complexidade do algotimo O(log n). 
	
</p><br>
<p>
Os índices utilizados são para otimizar as consultas mais utilizadas no sistema, que são para consultar as despesas com ou sem parcelamento de uma pessoa em um determinado mês, e despesas do cartão de um determinado mês. Abaixo estão alguns exemplos de consulta:
</p><br>


```sql
--Consulta para despesas de um cartão para um determinado mês(Query 1)
SELECT d.* as qtd_d FROM despesa d 
JOIN parcelamento p ON (p.fk_despesa = d.id)
JOIN cartao c ON (p.fk_cartao = c.id)
WHERE c.id =  85107 AND d.data_compra > '2018-11-01' AND d.data_compra < '2018-11-30'
```

```sql
--Consulta para despesas parceladas de um mês (Query 2)
SELECT parcelamento.*,despesa.* FROM despesa
INNER JOIN pessoa_usuario on (pessoa_usuario.id = despesa.fk_pessoa_usuario)
INNER JOIN parcelamento on (parcelamento.fk_despesa = despesa.id)
WHERE pessoa_usuario.id = 2291 AND despesa.data_compra > '2018-11-01' AND despesa.data_compra < '2018-11-30';
```

```sql
--Consulta para despesas de um mês de um cartão e de uma determinada pessoa (Query 3)
SELECT d.* FROM despesa d 
JOIN parcelamento p ON (p.fk_despesa = d.id)
JOIN cartao c ON (c.id = p.fk_cartao) 
JOIN pessoa_cartao pc ON (c.id = pc.fk_cartao)
JOIN pessoa_usuario pu ON (pu.id = pc.fk_pessoa_usuario)
WHERE pc.fk_pessoa_usuario = 2291 AND pc.fk_cartao = 19247  AND d.data_compra > '2018-11-01' AND d.data_compra < '2018-11-30';
```

```sql
--Consulta de receitas de uma pessoa, e um determinado mês e de uma determinada categoria (Query 4)
SELECT r.* FROM receita r
JOIN categoria_receita cr ON (cr.id = r.fk_categoria_receita)
JOIN pessoa_usuario pu ON (pu.id = r.fk_pessoa_usuario)
WHERE pu.id = 9242 AND cr.id = 2 AND r.data_recebimento > '2018-11-01' AND r.data_recebimento < '2018-11-30';
```

Referência :
https://www.devmedia.com.br/trabalhando-com-indices-no-postgresql/34028


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



