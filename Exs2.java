import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int valor;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número:");
    valor = scanner.nextInt();
    if (valor > 0) {
      for (int i = 0; i <= 10; i++) {
        System.out.println(valor + " x " + i + " = " + (valor * i));
      }

    } else {
      System.out.println("Apenas zero, amigão!");
    }

  }
}
