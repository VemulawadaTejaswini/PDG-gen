import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String N = sc.next();
    char n[] = new char[N.length()];
    for (int i = 0; i < N.length(); i++) {
      n[i] = N.charAt(i);
    }
    if (n[1] == n[2] && (n[0] == n[1] || n[2] == n[3])) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}