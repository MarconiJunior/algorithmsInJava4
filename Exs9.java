import java.util.*;

public class projeto {
  public static void main(String[] args) {
          
    
      Scanner scan = new Scanner(System.in);
      int number = 0;
      int fatorial = 1;

      System.out.println("Digite um número");
      number = scan.nextInt();

      for (int i = number; i > 0; i--){
        fatorial *=i;
        System.out.println(i +"! = "+fatorial);
      } 

    }
  }
