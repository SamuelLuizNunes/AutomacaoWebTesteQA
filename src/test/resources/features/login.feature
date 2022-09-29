#language:pt
Funcionalidade: Login
	@esse
	Cenario: Realizar login com todos os campos
		Dado que a pagina de login esteja sendo exibida 
		Quando os campos de login forem preenchidos da seguinte forma
			| login    | standard_user |
  		| password | secret_sauce  |
  	Quando for realizado um clique no botao login    
  	Entao deve ser possivel logar no sistema  		  	 

	Cenario: Ordenar os produtos do valor menor para o maior
		Dado que a pagina de login esteja sendo exibida
		Quando os campos de login forem preenchidos da seguinte forma
			| login    | standard_user |
  		| password | secret_sauce  |
  	Quando for realizado um clique no botao login    
		Quando selecionar no filtro de ordenacao o menor preco para o maior	
  	Entao o sistema deve ordenar os produtos
  	
  Cenario: Adicionar produtos no carrinho
		Dado que a pagina de login esteja sendo exibida
		Quando os campos de login forem preenchidos da seguinte forma
			| login    | standard_user |
  		| password | secret_sauce  |
  	Quando for realizado um clique no botao login    
		Quando 	reazar um clique em add to cart nos produtos Sauce Labs Onesie e TestallTheThings TShirt Red
  	Entao os produtos sao adicionados no carrinho
  	
  Cenario: Finalizar compra no carrinho
		Dado que a pagina de login esteja sendo exibida
		Quando os campos de login forem preenchidos da seguinte forma
			| login    | standard_user |
  		| password | secret_sauce  |
  	Quando for realizado um clique no botao login    
		Quando 	reazar um clique em add to cart nos produtos Sauce Labs Onesie e TestallTheThings TShirt Red
		Quando der um clique no carrinho
		Quando selecionar Checkout
		Quando preencher os dados com
		| firstName | teste  |
  	| lastName  | QA     |
  	Quando clicar em continue
  	Quando clicar em Finish
  	Entao o pedido é finalizado