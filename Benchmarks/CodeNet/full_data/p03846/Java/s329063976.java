import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N= sc.nextInt();
    int check =0, total =0;
    int[] a = new int[N];
    for (int i =0; i<N; i++) {
      int b = sc.nextInt();
      if (b * N % 2 != 0 || b >= N) {
        break;
      }
      a[b]++;
      total += b;
    }
    if (total != N * N / 2) check++;
    for (int i=N-1; i>0; i -=2) {
      if (a[i] != 2) check++;
    }
    if (check != 0) {
      System.out.println(0);
    } else {
      System.out.println((int)Math.pow(2,N/2) % 1000000007);
    }
  } 
}