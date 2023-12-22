import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int A = scan.nextInt();
    int B = scan.nextInt();
    scan.close();

    int count = N / (A + B);
    int amari = N % (A + B);

    System.out.println(A * count + (A>=amari ? amari : A));
  }
}