import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int ans = 0;
    int[] a = new int [200001];
    for (int i = 0; i < N; i++){
      a[sc.nextInt()] +=1;
    }
    Arrays.sort(a);
    for(int i = K;i < a.length;i++) {
      ans += a[i];
    }
    System.out.println(ans);
  }
}