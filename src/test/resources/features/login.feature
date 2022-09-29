#language:pt
Funcionalidade: Login
	
	Cenario: Realizar login com todos os campos
		Dado que a pagina de login esteja sendo exibida 
		Quando os campos de login forem preenchidos da seguinte forma
			| login    | standard_user |
  		| password | secret_sauce  |
  	Quando for realizado um clique no botao login    
  	Entao deve ser possivel logar no sistema  		  	 
