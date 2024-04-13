package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Prova;

public class ProvasController implements IAvaliacoesController {

	public ProvasController() {
		super();
	}

	@Override
	public <E> void cadastrar(ArrayList<E> Avaliacoes) {
		Prova p = new Prova();
		p.setNumQuestoes(Integer.parseInt(JOptionPane.showInputDialog("Insira o número de questões.")));
		p.setNota((float) (Math.random()*10));
		Avaliacoes.add((E) p);
	}

	@Override
	public <E> void consultar(ArrayList<E> Avaliacoes, int posicao) throws Exception {
		if(Avaliacoes.size() <= posicao) {
			String e = "Posição Inválida";
			throw new Exception(e);
		}else {
			System.out.println(Avaliacoes.get(posicao));
		}
	}

	@Override
	public <E> void deletar(ArrayList<E> Avaliacoes) throws Exception {
		if(Avaliacoes.isEmpty()==true) {
			String e = "Lista Vazia";
			throw new Exception(e);
		}else {
			while(Avaliacoes.isEmpty()!=true) {
				Avaliacoes.remove(0);
			}
		}
		
	}
	
	

}
