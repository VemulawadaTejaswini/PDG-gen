import java.util.*;
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int a[] = new int[N];
    int min = 1000;
    for(int i = 0; i < N; i++){
      a[i] = sc.nextInt();
      min = Math.min(min, a[i]);
    }
    if(K <= min){
      System.out.println(K * N);
      for(int i = 0; i < K; i++){
        for(int j = 0; j < N; j++){
          System.out.println(j + 1);
        }
      }
    } else {
      System.out.println(-1);
    }
}
}