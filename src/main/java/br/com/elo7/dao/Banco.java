package br.com.elo7.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.elo7.modelo.*;



public class Banco {
	
	private static List<Doce> doces = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	public void adiciona(Doce doce) {
		doce.setId(Banco.chaveSequencial++);
		Banco.doces.add(doce);
	}
	
	public List<Doce> getDoces(){
		return Banco.doces;
	}
	
public void excluiDoce(Integer id) {
		
		Iterator<Doce> it = doces.iterator();
		
		while(it.hasNext()) {
			Doce doce = it.next();
			
			if(doce.getId() == id) {
				it.remove();
			}
		}
	}

	public Doce buscaDocePorId(Integer id) {
		for (Doce doce : doces) {
			if(doce.getId() == id) {
				return doce;
			}
		}
		return null;
	}

}
