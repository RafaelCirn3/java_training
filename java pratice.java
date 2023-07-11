1º :  
import java.util.Scanner;

public class CalculadoraAreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Área de Retângulo");
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a largura: ");
        double largura = scanner.nextDouble();

        double area = calcularAreaRetangulo(altura, largura);

        System.out.println("A área do retângulo é: " + area);
    }

    public static double calcularAreaRetangulo(double altura, double largura) {
        return altura * largura;
    }
}

2º : 
import java.util.Scanner;

public class ConversorMinutosHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Minutos para Horas");
        System.out.print("Digite a quantidade de minutos: ");
        int minutos = scanner.nextInt();

        int horas = minutos / 60; // Calcula a quantidade de horas
        int minutosRestantes = minutos % 60; // Calcula o restante dos minutos

        System.out.println("Resultado: " + horas + " hora(s) e " + minutosRestantes + " minuto(s)");
    }
}
3º : 
import java.util.Scanner;

public class VerificadorNumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = verificarNumeroPrimo(numero);

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

    public static boolean verificarNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
4º : 
import java.util.Scanner;

public class TabuadaMultiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplicação do número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
5º :
 import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("O seu IMC é: " + imc);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
