import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número: ");
    
    int numero = sc.nextInt();

    if (numero % 2 == 0){
      System.out.println("O número é par");
    }
    else{
      System.out.println("O número é ìmpar");
    }
    if (numero > 0){
      System.out.println("O número é positivo");
    }
    else{
      System.out.println("O número é negativo");
    }
    if (numero == 0){
      System.out.println("O número é 0(neutro)");
    }



    
    sc.close();
  }

  
}