package Calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b;

        System.out.println("Digite o 1º valor: ");
        a = scan.nextInt();
        System.out.println("Digite o 2º valor: ");
        b = scan.nextInt();

        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("Soma:  " + somar);
        System.out.println("Subtração:  " + subtrair);
        System.out.println("Multiplicação:  " + multiplicar);
        System.out.println("Divisão:  " + dividir);

    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
            return a / b;
    }
}
