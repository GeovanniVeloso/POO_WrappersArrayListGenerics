package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import model.Atividades;


public class AtividadesController implements IAvaliacoesController{

	public AtividadesController() {
		super();
	}
	
	@Override
	public <E> void cadastrar(ArrayList<E> Avaliacoes) {
		Atividades a = new Atividades();
		a.setQntPaginas(Integer.parseInt(JOptionPane.showInputDialog("Insira o número de páginas.")));
		a.setAssunto(JOptionPane.showInputDialog("Insira o assunto do texto."));
		Avaliacoes.add((E) a);
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
