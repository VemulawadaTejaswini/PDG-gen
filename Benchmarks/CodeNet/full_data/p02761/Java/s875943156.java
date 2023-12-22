import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] d = new int[n];
    Arrays.fill(d, -1);
    int m = sc.nextInt();
    for (int i = 0; i < m; i++) {
      int si = sc.nextInt() - 1;
      int ci = sc.nextInt();
      if(d[si] != -1 && d[si] != ci){
        System.out.println(-1);
        return;
      }
      if(si == 0 && ci == 0){
        System.out.println(-1);
        return;
      }
      d[si] = ci;
      a[si] = ci;
    }
    if(d[0] == -1){
      a[0] = 1;
    }
    int answer = 0;
    int pow = 1;
    for(int i = 0; i < n; i++){
      answer += a[n - 1 - i] * pow;
      pow *= 10;
    }
    System.out.println(answer);
  }
}