import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
      int op,num;
      int count = 0;
      Scanner scan = new Scanner(System.in);
      Random random = new Random();
      int valorR = random.nextInt(11);
      do {
        clearScreen();
        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");
        System.out.println("Opção desejada: ");
        op = scan.nextInt();
        switch (op){
          case 1:
             do {
             System.out.println("Digite um número de 0 a 10: ");
             num = scan.nextInt();
             if(num>11 || num<0){
              System.out.println("Opção inválida");
              count--;
             } else {
              if(num == valorR){
              System.out.format("Parabéns, você venceu o jogo na %d tentativa%n", count);
              System.out.println("Essa partida foi finalizada");
              Thread.sleep(1000);
              break;
             } else {
              System.out.println("Você errou, tente novamente ");
              }
            }  
             count++;
             } while(num != valorR);
            break;
          case 2:
          System.out.println("saindo...");
          Thread.sleep(1000);
          break;
          default: 
          System.out.println("Opção inválida");
          Thread.sleep(1000);
          break;
        }
      } while(op != 2);
      scan.close();
      System.out.println("Jogo Finalizado");
    }
    public static void clearScreen() throws IOException, InterruptedException{
        new  ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
  }
}


