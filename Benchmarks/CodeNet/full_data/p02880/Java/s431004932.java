import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.close();
    
    int dig;
    int mod;
    for (int i = 1; i <= 9; i++ ) {
      dig = N / i;
      mod = N % i;
      if (1 <= dig && dig <= 9 && mod == 0) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}