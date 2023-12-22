import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int X = sc.nextInt();
      int Y = sc.nextInt();
      X += 100; Y+= 100;
      int[] count1 = new int[201];
      int[] count2 = new int[201];
      int[] x = new int[N];
      int[] y = new int[M];
      int ans =0;
      for (int i=0; i<N; i++) {
        x[i] = sc.nextInt() + 100;
      }
      for (int i=0; i<M; i++) {
        y[i] = sc.nextInt() + 100;
      }
      for (int i=0; i<=200; i++) {
        for (int j=0; j<N; j++) {
          if (x[j] > i && X > i) count1[i]++;
        }
        for (int j=0; j<M; j++) {
          if (y[j] <= i && Y<= i) count1[i]++;
        }
      }
      for (int i=0; i<=200; i++) {
        for (int j=0; j<N; j++) {
          if (x[j] <= i && X <= i) count2[i]++;
        }
        for (int j=0; j<M; j++) {
          if (y[j] > i && Y > i) count2[i]++;
        }
      }
      for (int i=0; i<=200; i++) {
        if (count1[i] == N+M || count2[i] == N+M) {
          ans++;
        }
      }
      if (ans != 0) {
        System.out.print("No War");
      } else {
        System.out.print("War");
      } 
    }
}