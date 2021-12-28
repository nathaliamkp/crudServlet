package br.com.elo7.modelo;

public class Doce {
	
	private Integer id;
	private String nome;
	private String ingredientes;
	
	public Doce(String nome, String ingredientes) {
		this.nome = nome;
		this.ingredientes = ingredientes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	
	
}
