package br.inf.ufg.exercicio;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgoritmosTest {

	// Testes para funcao cpf
	@Test
	public void CPFValidoTest() {
		int[] d = { 0, 3, 7, 7, 1, 7, 6, 3, 1, 1, 8 };
		assertTrue(Algoritmos.cpf(d));
	
	}

	@Test
	public void CPFInValidoTest() {
		int[] d = { 0, 0, 0, 7, 1, 7, 6, 3, 1, 1, 8 };
		assertFalse(Algoritmos.cpf(d));
	
	}

	@Test(expected = IllegalArgumentException.class)
	public void CPFInValido12DigitosTest() {
		int[] d = { 0, 0, 0, 7, 1, 7, 6, 3, 1, 1, 8, 1 };
		Algoritmos.cpf(d);
	}

	// Testes para funcao cpf2
	@Test
	public void CPF2ValidoTest() {
		int[] d = { 0, 3, 7, 7, 1, 7, 6, 3, 1, 1, 8 };
		assertTrue(Algoritmos.cpf2(d));
	}

	@Test
	public void CPF2InValidoTest() {
		int[] d = { 0, 0, 0, 7, 1, 7, 6, 3, 1, 1, 8 };
		assertFalse(Algoritmos.cpf2(d));
	}

	@Test(expected = IllegalArgumentException.class)
	public void CPF2InValido12DigitosTest() {
		int[] d = { 0, 0, 0, 7, 1, 7, 6, 3, 1, 1, 8, 1 };
		Algoritmos.cpf2(d);
	}

}
