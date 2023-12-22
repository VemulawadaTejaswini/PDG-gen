import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max =0;
    int ans =1;
    int[] list = new int[N+1];
    for (int i=1; i<=N; i++) {
      int a = i;
        while (a % 2 == 0) {
          list[i]++;
          a /= 2;
        }
        if(list[i]>max) {
          max = list[i];
          ans =i;
        }
    }
    System.out.println(ans);
  }
}