package br.inf.ufg.exercicio;

/**
* Algoritmos definidos como exercicio para aula2.
*
* @author Jean
*/
public final class Algoritmos {

     /**
     * Algoritmo para calculo de resto de divisoes.
     *
     * @param x
     *            valor de x para divisao
     * @param y
     *            valor de y para divisao
     * @return resto da divisao
     *
     */
public static int mod(final int x, final int y) {
       if (x < 0 || y < 0) {
        throw new IllegalArgumentException("x ou y menor que 0");
       }
       int s = x;
       while (y <= s) {
       s = s - y;
     }
    return s;
   }

    /**
     * Algoritmo para validação de cpf.
     * @param d parametro com o numero do cpf
     * @return valor true or false dependendo da validade do cpf
     */
public static boolean cpf(final int[] d) {
    final int numero0 = 0;
    final int numero1 = 1;
    final int numero2 = 2;
    final int numero3 = 3;
    final int numero4 = 4;
    final int numero5 = 5;
    final int numero6 = 6;
    final int numero7 = 7;
    final int numero8 = 8;
    final int numero9 = 9;
    final int numero10 = 10;
    final int numero11 = 11;
    if (d.length > numero11) {
      throw new IllegalArgumentException("Numero de cpf maior que 11 digitos");
      }
      int sj = d[numero0] + numero2 * d[numero1] + numero3
              * d[numero2] + numero4 * d[numero3] + numero5
              * d[numero4] + numero6 * d[numero5] + numero7
              * d[numero6] + numero8 * d[numero7] + numero9 * d[numero8];
      int sk = d[numero1] + numero2 * d[numero2] + numero3 * d[numero3]
               + numero4 * d[numero4] + numero5 * d[numero5]
               + numero6 * d[numero6] + numero7 * d[numero7]
               + numero8 * d[numero8] + numero9 * d[numero9];
      int j = mod(mod(sj, numero11), numero10);
      int k = mod(mod(sk, numero11), numero10);

      return (j == d[numero9]) && (k == d[numero10]);
    }

    /**
    * Algoritmo para validação de cpf.
    *
    * @param d
    *            parametro com o numero do cpf
    * @return valor true or false dependendo da validade do cpf
    */
public static boolean cpf2(final int[] d) {
      final int numero0 = 0;
      final int numero7 = 7;
      final int numero8 = 8;
      final int numero9 = 9;
      final int numero10 = 10;
      final int numero11 = 11;
      if (d.length > numero11) {
        throw new IllegalArgumentException(" cpf maior que 11 digitos");
      }
      int c = numero7;
      int p = d[numero8];
      int s = d[numero8];

     while (numero0 <= c) {
        p = p + d[c];
        s = s + p;
        c = c - 1;
      }
     int j = mod(mod(s, numero11), numero10);
     int k = mod(mod(s - p + numero9 * j, numero11), numero10);

     return (j == d[numero9]) && (k == d[numero10]);
   }

/**
* Algoritmo para validacao de cpf.
*
* @param d
*            parametro com o numero do cpf
* @return valor true or false dependendo da validade do cpf
*/
     public static boolean cpf3(final int[] d) {
      final int numero0 = 0;
      final int numero1 = 1;
      final int numero2 = 2;
      final int numero3 = 3;
      final int numero4 = 4;
      final int numero5 = 5;
      final int numero6 = 6;
      final int numero7 = 7;
      final int numero8 = 8;
      final int numero9 = 9;
      final int numero10 = 10;
   	  final int numero11 = 11;
      if (d.length > numero11) {
         throw new IllegalArgumentException("cpf maior que 11 digitos");
       }
       int c = numero7;
       int p = d[numero8] + d[numero7] + d[numero6] + d[numero5] + d[numero4]
              + d[numero3] + d[numero2] + d[numero1] + d[numero0];
       int s = d[numero8];


     while (0 <= c) {
       p = p + d[c];
       s = s + p;
       c = c - 1;
     }
     int j = mod(mod(s, numero11), numero10);
     int k = mod(mod(s - p + numero9 * j, numero11), numero10);
     return (j == d[numero9]) && (k == d[numero10]);
 }
 /**
 * Construtor privado.
 */
 private Algoritmos() {
 }
}
