package br.ufpb.dcx.aps.telaprojeto;

public class FabricaWindows implements FabricaAbstrata{

	@Override
	public Janela criarJanela() {
		// TODO Auto-generated method stub
		return new JanelaWindows();
	}

	@Override
	public Menu criarMenu() {
		// TODO Auto-generated method stub
		return new MenuWindows();
	}

	@Override
	public Botao criarBotao() {
		// TODO Auto-generated method stub
		return new BotaoWindows();
	}
	
}
