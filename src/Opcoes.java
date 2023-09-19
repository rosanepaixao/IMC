import java.util.Scanner;
public class Opcoes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int opcao;
            do {

                System.out.println(" |  ___  |");
                System.out.println(" |  MENU DE OPÇÕES   |");
                System.out.println(" |    1- Opção 1     |");
                System.out.println(" |    2- Opção 2     |");
                System.out.println(" |    3- Sair        |");



                System.out.println(" Selecione uma opção: ");
                opcao = scanner.nextInt();


                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu a primeira opção");
                        break;
                    case 2:
                        System.out.println("Você escolheu a segunda opção ");
                        break;
                    case 3:
                        System.out.println("O programa foi encerrado");
                        break;
                    default:
                        System.out.println("Seleção inválida");
                        break;


                }
            }while (opcao!=3);
        }
    }

