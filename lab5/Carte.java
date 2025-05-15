class Carte{
	private String editor;
	private Date dataPublicare;
	private String ISBN;

	private Parte[] parti;

	public Carte(Strign editor, Date dataPublicare, String ISBN, Parte[] parti){
		this.editor = editor;
		this.dataPublicare = dataPublicare;
		this.ISBN = ISBN;
		this.parti = new Parte[parti.length()]
		for(int i = 0; i < parti.length(); i++){
			this.parti[i] = parti[i];
		}
	}

class Structura{
	private String titlu;
	private Integer numar;

	public Structura(String titlu, Integer numar){
		this.titlu = titlu;
		this.numar = numar;
	}
}

class Parte extends Structura{
}

class Capitol extends Structura{
	private String rezumat;
}

class Sectiune extends Structura{
}
