import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while (true) {
      int qLinha;
      int ret = 0;
      System.out.println("Quantas linhas o seu desenho terá? (Menor/igual a 20)");
      qLinha = scan.nextInt();
      if (qLinha <= 20 && qLinha >= 0) {
        for (int i = 0; i <= qLinha; i++) {
          System.out.println("*".repeat(i));
        }
        break;
      } else {
        System.out.println("Valor não compatível!");
        System.out.println("Você deseja continuar? [1 - Sim, 2 - não]");
        ret = scan.nextInt();
        if (ret == 1) {
        } else {
          System.out.println("Código cancelado :(! Agradeço pela preferência.");
          break;
        }
      }
    }
  }
}
