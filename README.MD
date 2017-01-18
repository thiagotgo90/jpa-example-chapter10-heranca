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
	

	JOINED

		Sera criado uma tabela para cada Entidade concreta na arvore de herança;
		Não serão criadas tabelas para mappedSuperClass, mesmo que concretas.
		Cada tabela criada tera os campos definidos na entidade e caso na arvore de herança haja alguma classe abstrata
			(seja essa uma entidade ou mappedSuperClass), seus campos pertencerão a primeira entidade concreta filha.
		A entidade mãe (nesse exemplo, Employee) terá chave primaria e a coluna descriminatoria (@DiscriminatorColunm)
		Todas as tabelas das entidades concretas filhas terão seus campos e um id que será usado como chave estrategia apontando para a entidade mãe

	TABLE PER CLASS

		Encare como "Tabela por classe concreta". Será criado uma tabela para cada Entidade concreta que existir na arvore de herança.
		Para mappedSuperClass, nunca será criado (mesmo que concretas)
		Todas as tabelas criadas terão seus campos e de seus "pais"
		Não usa chave estrategia ou coluna de tipo porque cada tabela são auto contidas.
		