import java.util.*;

public class projeto {
  public static void main(String[] args) {
          
    
      Scanner scan = new Scanner(System.in);
    int idade = 0;
    int sexo = 0;
    int countM = 0;
    int countF = 0;
    int idadeM = 0;
    int idadeF = 0;
     

    for (int i=0; i<=5; i++) {
    System.out.println("Dígite o seu sexo || 1 para masculino e 2 para feminino");
      sexo = scan.nextInt();
    System.out.println("Digite sua idade:");
      idade = scan.nextInt();
      if (sexo == 1){
        idadeM += idade;
        countM++;
      }else if (sexo == 2) {
        idadeF += idade;
        countF++;
      } else {
        System.out.println("Undefinied");
      } 
    } System.out.println("A média das idades do público masculino é "+ (idadeM / countM) +" e a média das idades do público feminino é de "+ (idadeF / countF));
  }
  }
