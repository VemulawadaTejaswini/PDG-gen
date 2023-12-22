import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int answer = ((n-m) * 100 + m * 1900) * (int)Math.pow(2,m);
    System.out.println(answer);
    }
  }
