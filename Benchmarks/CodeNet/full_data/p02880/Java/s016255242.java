import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean flag = false;
    int n = Integer.parseInt(sc.next());
    for(int i = 1; i <= 9; i++) {
      for(int j = 0; j <= 9; j++) {
        if(i * j == n) flag = true;
      }
    }
    if(flag) System.out.println("Yes");
    else System.out.println("No");
  }
}
