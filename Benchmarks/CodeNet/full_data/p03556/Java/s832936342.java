import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = 1;
    for (int i=1; i<=N/2; i++) {
      if (i * i > N) {
        break;
      } else {
        max = Math.max(max, i * i);
      }
    }
    System.out.println(max);
  }
}