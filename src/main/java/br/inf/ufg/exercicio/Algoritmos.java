package br.inf.ufg.exercicio;

public class Algoritmos {

	/**
	 * Algoritmo para calculo de resto de divisoes
	 * 
	 * @param x
	 *            valor de x para divisao
	 * @param y
	 *            valor de y para divisao
	 * 
	 */
	public static int mod(int x, int y) {
		if (x < 0 || y < 0) {
			throw new IllegalArgumentException("x ou y menor que 0");
		}
		int s = x;
		while (y <= s) {
			s = s - y;
		}
		return s;
	}

	public static boolean cpf(int d[]) {

		int sj = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8];
		int sk = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
		int j = mod(mod(sj, 11), 10);
		int k = mod(mod(sk, 11), 10);

		return (j == d[9]) && (k == d[10]);
	}

	public static boolean cpf2(int d[]) {
		int c = 7;
		int p = d[8];
		int s = d[8];

		while (0 <= c) {
			p = p + d[c];
			s = s + p;
			c = c - 1;
		}
		int j = mod(mod(s, 11), 10);
		int k = mod(mod(s - p + 9 * j, 11), 10);

		return (j == d[9]) && (k == d[10]);
	}
}