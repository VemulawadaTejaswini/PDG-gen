import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double A = sc.nextDouble();
    double B = sc.nextDouble();

    int ans = 0;
    while (B > 0) {
        B -= ans == 0 ? A : A - 1;
        ans++;
    }
    
    System.out.println(ans);
  }
}