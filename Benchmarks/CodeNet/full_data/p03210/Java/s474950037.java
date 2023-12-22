import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    
    if (x == 7 || x == 5 || x == 3)
      System.out.println("Yes");
    else
      System.out.println("No");
  }  
}