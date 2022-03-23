package br.gabi.movie.model;

import java.io.Serializable;
//import java.util.List;

public class Filme implements Serializable {
	private static final long serialVersionUID = 1L;

    private String nome;
    private String filminho;
    private double roteiro;
    private double trilhaSonora;
    private double interpretacao;
    private Boolean recomendo;
    private double nota;

	public Filme() { }
    

	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}
    
    
    public String getFilminho() {
		return filminho;
	}


	public void setFilminho(String filminho) {
		this.filminho = filminho;
	}

	
	public double getRoteiro() {
		return roteiro;
	}

	
	public void setRoteiro(double roteiro) {
		this.roteiro = roteiro;
	}

	
	public double getTrilhaSonora() {
		return trilhaSonora;
	}

	
	public void setTrilhaSonora(double trilhaSonora) {
		this.trilhaSonora = trilhaSonora;
	}

	
	public double getInterpretacao() {
		return interpretacao;
	}

	
	public void setInterpretacao(double interpretacao) {
		this.interpretacao = interpretacao;
	}

	
	public Boolean getRecomendo() {
		return recomendo;
	}
	
	
	public void setRecomendo(Boolean recomendo) {
		this.recomendo = recomendo;
	}
	
	
	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}
}