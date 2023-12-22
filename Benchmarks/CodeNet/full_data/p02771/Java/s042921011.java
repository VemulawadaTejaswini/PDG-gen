import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String result = "";
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int c = 0;

    if (A == B) c++;
    if (B == C) c++;
    if (C == A) c++;

    if (c == 1) {
      result = "YES";
    } else {
      result = "NO";
    }

    System.out.println(result);
    sc.close();
  }
}