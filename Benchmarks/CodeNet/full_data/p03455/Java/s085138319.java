import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int product = a * b;
    if (product % 2 == 0) {
      System.out.println("Odd");
    } else {
      System.out.println("Even");
    }
    
  }
}