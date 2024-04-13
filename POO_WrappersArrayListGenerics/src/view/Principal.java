package view;

import java.util.ArrayList;

import controller.AtividadesController;
import controller.ProvasController;
import model.Atividades;
import model.Prova;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Prova>Avaliacoes1 = new ArrayList<Prova>();
		ArrayList<Atividades>Avaliacoes2 = new ArrayList<Atividades>();
		
		ProvasController pc = new ProvasController();
		AtividadesController ac = new AtividadesController();
		
		pc.cadastrar(Avaliacoes1);
		try {
			pc.consultar(Avaliacoes1, 2);
		} catch (Exception e) {
			System.err.println(e);
		}
		try {
			pc.deletar(Avaliacoes1);
		} catch (Exception e) {
			System.err.println(e);
		}
		
		ac.cadastrar(Avaliacoes2);
		try {
			ac.consultar(Avaliacoes2, 2);
		} catch (Exception e) {
			System.err.println(e);
		}
		try {
			ac.deletar(Avaliacoes2);
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}

}
