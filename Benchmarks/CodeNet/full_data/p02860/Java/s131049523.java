import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    String s = sc.next();

    if (s.substring(0, N/2).equals(s.substring(N/2, N))) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }    
  }
}