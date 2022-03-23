package br.gabi.movie.control;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import br.gabi.movie.model.Filme;

@ManagedBean
@RequestScoped
public class FilmeBean {
	private Filme filme = new Filme();

	public FilmeBean() {
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	public List<SelectItem> getListaFilmes() {
		List<SelectItem> filmes = new ArrayList<>();
		filmes.add(new SelectItem("Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Prisoner of Azkaban"));
		filmes.add(new SelectItem("Interstellar", "Interstellar"));
		filmes.add(new SelectItem("Intouchables", "Intouchables"));
		filmes.add(new SelectItem("Monster House", "Monster House"));
		filmes.add(new SelectItem("Monsters, INC.", "Monsters, INC."));
		filmes.add(new SelectItem("The Hunger Games", "The Hunger Games"));
		return filmes;
	}

	public String calcularNota() {
		double nota = ((filme.getRoteiro() + filme.getTrilhaSonora() + filme.getInterpretacao())/3);
				
		filme.setNota(nota);
		
		return "/notaFilme";
	}
}