package controller;

import java.util.ArrayList;

public interface IAvaliacoesController {

	public <E> void cadastrar(ArrayList<E>Avaliacoes);
	public <E> void consultar(ArrayList<E>Avaliacoes, int posicao)throws Exception;
	public <E> void deletar(ArrayList<E>Avalicoes)throws Exception;
	
}
