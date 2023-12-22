import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    double mu = (double)(a+b)/2;
    System.out.println((int)Math.ceil(mu));
  }
}
