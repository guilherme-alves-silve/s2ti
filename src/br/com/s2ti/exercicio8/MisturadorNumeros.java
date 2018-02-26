package br.com.s2ti.exercicio8;

/**
 *
 * @author Guilherme Alves Silveira
 */
public class MisturadorNumeros {

    public static int mistura(int a, int b) {
        String strA = a + "";
        String strB = b + "";
        int max = Math.max(strA.length(), strB.length());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; ++i) {
            if (i < strA.length()) {
                sb.append(strA.charAt(i));
            }

            if (i < strB.length()) {
                sb.append(strB.charAt(i));
            }
        }

        try {
            String strNumero = sb.toString();
            int numero = Integer.parseInt(strNumero);
            if (numero > 1_000_000) {
                return -1;
            }

            return numero;
        } catch (java.lang.NumberFormatException e) {
            return -1;
        }
    }

    private MisturadorNumeros() {
        throw new IllegalArgumentException("No MisturadorNumeros!");
    }
}
