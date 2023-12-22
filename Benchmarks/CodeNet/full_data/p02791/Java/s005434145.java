import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int count2 = 0;
    int[] P = new int[N];

    for (int i = 0; i < N; i++) {
      P[i] = sc.nextInt();
      int count1 = 0;
      for (int j = 0; j <= i; j++) {
        if (P[i] <= P[j]) {
          count1++;
        }
      }
      if(count1 == i+1) {
        count2++;
      }
    }
    System.out.print(count2);
  }
}