package application;

import entities.Quadrado;
import entities.Retangulo;
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
            System.out.println("3 - A área de um retângulo:");
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
                System.out.println();
                System.out.print("A area do quadrado é: " + areaQ);
                System.out.println();
                System.out.println();
            }

            else if (opcao == 2) {
                Triangulo y;
                y = new Triangulo();
                System.out.println("Digite os lados do triângulo:");
                System.out.print("Digite o lado a: ");
                y.a = sc.nextDouble();
                System.out.print("Digite o lado b: ");
                y.b = sc.nextDouble();
                System.out.print("Digite o lado c: ");
                y.c = sc.nextDouble();
                double areaT = y.areaDoTriangulo();
                System.out.println();
                System.out.println("A área do triângulo é: " + areaT);
                System.out.println();
                System.out.println();
            }

            else if (opcao == 3){
                Retangulo z;
                z = new Retangulo();
                System.out.println("Digite os lados do retângulo:");
                System.out.println("Digite o valor de a: ");
                z.a = sc.nextDouble();
                System.out.println("Digite o valor de b: ");
                z.b = sc.nextDouble();;
                double areaR = z.areaDoRetangulo();
                System.out.println();
                System.out.println("A área do retângulo é: " + areaR);
                System.out.println();
                System.out.println();
            }

        } while (opcao != 0);

        System.out.println("Obrigado por usar o programa !");

        sc.close();
    }
}