import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    sc.close();
    long sum = (n - 1) * n / 2;
    System.out.println(sum);
  }
}