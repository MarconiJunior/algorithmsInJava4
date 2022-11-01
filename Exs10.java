import java.util.*;

public class projeto {
  public static void main(String[] args) {
          
    
      Scanner scan = new Scanner(System.in);
      int number = 0;
      int n = 0;
      int n1 = 1;
      int n2 = 0;
      int count = 0;

      System.out.println("Digite um número");
      number = scan.nextInt();
     System.out.println("");
      while (count<number) {
        System.out.println(n1);
        n = n1 + n2;
        n2 = n1;
        n1 = n;
        count++;
      }

      
    }
  }
