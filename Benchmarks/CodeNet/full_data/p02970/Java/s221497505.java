import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int trees = sc.nextInt();
    int view = sc.nextInt() * 2 + 1;
    System.out.println((int) Math.ceil((double) trees / (double) view));
  }

}