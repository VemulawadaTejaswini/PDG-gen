import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count =0;
    for (int i=1; i<=N; i++) {
      if (i <= 9) count++;
      if (i >= 100 && i<= 999) count++;
      if (i >= 10000 && i<= 99999) count++;
    }
    System.out.println(count);
  }
}