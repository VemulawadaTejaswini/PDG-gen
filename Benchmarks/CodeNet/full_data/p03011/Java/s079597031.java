import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int P = sc.nextInt();
    int Q = sc.nextInt();
    int R = sc.nextInt();
    int result = 201;
    if (P+Q < result) {
      result = P+Q;
    }
    if (Q+R < result) {
      result = P+Q;
    }
    if (P+R < result) {
      result = P+Q;
    }
    System.out.println(result);
  }
}