import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long H = scan.nextInt();
    long W = scan.nextInt();
    scan.close();

    if(H%2 == 0) {
      System.out.println((H/2) * W);
    }
    else {
      System.out.println(H * (W/2) + ((H+1)/2) * (W%2));
    }
  }
}