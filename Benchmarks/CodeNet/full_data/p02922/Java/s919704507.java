import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int ans = 1;
    int count = A;
    while (count < B) {
      ans++;
      count += (A-1);
    }
    
    System.out.println(ans);
  }
}