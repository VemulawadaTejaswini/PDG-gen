import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int P = sc.nextInt();

    int ans = 3*A + P;

    System.out.println(ans/2);

  }
}