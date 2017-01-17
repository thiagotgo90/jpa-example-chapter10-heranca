Herança

	Geral:

		A entidade no topo da arvore de herança pode altarar qual o tipo padrão de comportamento que sera usado para o mapeamento (por padrão é single table)
		Na arvore podem existir os seguintes tipo:
			* Entidades: Padrão. Sera gerado uma tabela correspondente (dependendo do tipo de estrategia). 
			* Mapped Super Class: Mapeadas usando uma anotação de mesmo nome. Seus campos serão herdados e persistindos pelas entidades filhas. NAO podem ser usadas em queries. Seriam mais ou menos como classes abstratas na arvore. Porem não é obrigatorio que sejam concretas/abstratas.
			* Classes Transientes: São classes no meio da arvore que não são nem entidades nem mappedSuperClass. Seu comportamento como classe java sera normal (atributos visiveis serão herdados pelos filhos, etc), porem esses atributos não serao persistidos quando os filhos forem.
	

	SINGLE TABLE:

		O metodo padrão usado para mapeamento de herança é o single table.
		Nesse modo, sera criado apenas uma tabela contendo todos os campos de todas as entidades na arvore de herança.
		Alem desses campos, sera adicionada uma coluna que descrimi qual é a entidade sendo salva em cada linha.
		Essa coluna tem o nome padrão de "DTYPE".
		Esse nome pode ser sobreescrito utilizando a anotação @DiscriminatorColunm.
		Essa anotação tem os campos:
			name = Define qual vai ser o nome da coluna
			discriminatorType= define qual vai ser o tipo da coluna. Pode ser String (default), int ou char.

		Cada entidade concreta na herança pode ter uma anotação chamada @DiscriminatorValeu.
		Essa anotação define qual vai ser o valor guardado nessa coluna descriminatoria.
		Se essa anotação não seja usada:
			caso o tipo da coluna seja String, será usado no nome da entidade (pode ser diferente do nome da classe).
			caso o tipo do campo seja inteiro, será gerado um valor. 
