package br.com.s2ti.exercicio8;

import java.util.Scanner;

/**
 *
 * @author Guilherme Alves Silveira
 */
public class Main {

    public static void main(String[] args) {
        misturaInputAEB();
    }

    private static void misturaInputAEB() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número A: ");
            int a = scanner.nextInt();
            System.out.println("Digite o número B: ");
            int b = scanner.nextInt();
            int resultado = MisturadorNumeros.mistura(a, b);
            System.out.println("Resultado: " + resultado);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Digite somente números com no máximo 9 digitos");
            misturaInputAEB();
        } catch (Exception ex) {
            System.out.println("Ocorrência inexperada: " + ex.getMessage());
            misturaInputAEB();
        }
    }
}
