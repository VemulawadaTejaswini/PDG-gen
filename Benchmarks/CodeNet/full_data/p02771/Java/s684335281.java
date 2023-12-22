import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int c = 0;

    if (A == B) c++;
    if (B == C) c++;
    if (C == A) c++;

    if (c == 1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    
    sc.close();
  }
}