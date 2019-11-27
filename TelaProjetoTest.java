package br.ufpb.dcx.aps.telaprojeto;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TelaProjetoTest {

	@Test
	void testCriarTela() {
		TelaProjeto t = new TelaProjeto();
		t.setFabrica(new FabricaWindows());
		t.montar();
		t.desenhar();
		assertEquals("janelaWindows\n" + 
					"menuWindows\n" + 
					"botaoWindows", t.desenhar());
	}

}
