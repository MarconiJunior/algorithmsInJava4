import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Double peso;
    Double altura;
    System.out.println("Dígite o seu peso em Kg:");
    peso = scan.nextDouble();
    System.out.println("Dígite a sua altura em Metros:");
    altura = scan.nextDouble();
    if (peso / (altura * altura) < 20){
      System.out.println("O(a) senhor(a) está abaixo do peso.");
    } else if (peso / (altura * altura) >= 20 && peso / (altura * altura) <= 25 ){
      System.out.println("O(a) senhor(a) está no peso padrão.");
    }else if (peso / (altura * altura) > 25 && peso / (altura * altura) <= 30 ){
      System.out.println("O(a) senhor(a) está com sobrepeso.");
    }else if (peso / (altura * altura) > 30 && peso / (altura * altura) <= 40 ){
      System.out.println("O(a) senhor(a) está obeso.");
    }else if (peso / (altura * altura) > 40 ){
      System.out.println("O(a) senhor(a) está com obesidade mórbida.");
    } else {
      System.out.println("Inválido.");
    }
    
  }
}
