import java.util.Scanner;
 
public calss Main{
  public static void main(String args[]){
	Scanner scanner new scanner(system.in);
    
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    
    if((a * b) % 2 == 0) {
      System.out.println("Even");
    else
      System.out.println("Odd");
    }
  }
}
    