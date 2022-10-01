import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int qLinha;
    System.out.println("Quantas linhas o seu desenho terá? (Menor/igual a 20)");
    qLinha = scan.nextInt();
    if (qLinha <= 20) {
      for (int i = 0; i <= qLinha; i++) {
        System.out.println("*".repeat(i));
      }
    } else {
      System.out.println("Valor não compatível.");
    }
  }
}
