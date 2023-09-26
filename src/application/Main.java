package application;

import entities.Quadrado;
import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("O que você deseja calcular ?");
            System.out.println();
            System.out.println("1 - A área de um quadrado:");
            System.out.println();
            System.out.println("2 - A área de um triângulo:");
            System.out.println();
            System.out.println("0 - Para encerrar o programa");
            System.out.println();

            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                Quadrado x;
                x = new Quadrado();
                System.out.print("Digite o tamanho do lado do quadrado: ");
                x.a = sc.nextDouble();
                double areaQ = x.areaDoQuadrado();
                System.out.print("A area do quadrado é: " + areaQ);
            }

            else if (opcao == 2) {
                Triangulo y;
                y = new Triangulo();
                System.out.println("Digite os lados do triângulo: ");
                System.out.print("Digite o lado a: ");
                y.a = sc.nextDouble();
                System.out.print("Digite o lado b: ");
                y.b = sc.nextDouble();
                System.out.print("Digite o lado c: ");
                y.c = sc.nextDouble();
                double areaT = y.areaDoTriangulo();
                System.out.println("A área do triângulo é: " + areaT);
            }

        } while (opcao != 0);

        System.out.println("Obrigado por usar o programa !");

        sc.close();
    }
}