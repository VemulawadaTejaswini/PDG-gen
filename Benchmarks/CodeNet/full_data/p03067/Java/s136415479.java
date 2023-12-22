import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a,b,c;
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();
 
    if ((a < c) && (b > c)||(a > c) && (b < c)) {   //(1)
      System.out.println("Yes");
      
    }
    else
      System.out.println("No");
  }
}
