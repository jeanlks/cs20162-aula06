package br.inf.ufg.exercicio;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgoritmosTest {
	//Testes para funcao mod 
	@Test(expected = IllegalArgumentException.class)
	public void modInvalidoValorYTest(){
	Algoritmos.mod(-1, 1);
	}
	public void modInvalidoValorXTest(){
		Algoritmos.mod(0, -2);
	}
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
	//Testes para cp3
	@Test(expected = IllegalArgumentException.class)
	public void CPF3InValido12DigitosTest() {
		int[] d = { 0, 0, 0, 7, 1, 7, 6, 3, 1, 1, 8, 1 };
		Algoritmos.cpf3(d);
	}
	@Test
	public void CPF3InValidoTest() {
		int[] d = { 0, 0, 0, 7, 1, 7, 6, 3, 1, 1, 8 };
		assertFalse(Algoritmos.cpf3(d));
	}
	public void CPF3ValidoTest() {
		int[] d = { 0, 3, 7, 7, 1, 7, 6, 3, 1, 1, 8 };
		assertTrue(Algoritmos.cpf3(d));
	}
}
