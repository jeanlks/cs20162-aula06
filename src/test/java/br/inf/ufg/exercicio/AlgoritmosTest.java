package br.inf.ufg.exercicio;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgoritmosTest {

	@Test
	public void CPFValidoTest() {
		int [] d = {0,3,7,7,1,7,6,3,1,1,8};
		assertTrue(Algoritmos.cpf2(d));
	}

}
