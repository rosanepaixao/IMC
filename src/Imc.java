import java.util.Scanner;


public class Imc {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INDICE DE MASSA CORPORAL!");
        System.out.print("Digite o seu peso:");
        float peso1 = scanner.nextFloat();

        System.out.print("Digite a sua altura: (exemplo: 1.83)");
        float altura = scanner.nextFloat();

        float imc = peso1 / (altura * altura);
        System.out.println("Seu IMC é:" + imc);

        if (imc <= 18.5) {
            System.out.println("Você está abaixo do peso!");
        }

        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está dentro do seu peso ideal :D");
        }

        if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Você está acima do peso! x.x");
        }

        if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Cuidado! Você está em obesidade grau I!");
        }

        if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Cuidado!! Você está em obesidade grau II!");
        }

        if (imc >= 40.0 && imc >= 40.0) {
            System.out.println("Cuidado!!! Você está em obesidade grau III");
        }
    }
}
