import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
	  // 取得
	  int A = sc.nextInt();
      int B = sc.nextInt();
      int M = sc.nextInt();
      int[] a = new int[A];
      int[] b = new int[B];
      int ans = 200001;
      for(int i=0;i<A;i++){
        a[i] = sc.nextInt();
      }
      for(int i=0;i<B;i++){
        b[i] = sc.nextInt();
      }
      //割引なし
      for(int i=0;i<A;i++){
        for(int j=0;j<B;j++){
          int cost = a[i]+b[j];
          ans = Math.min(ans,cost);
        }
      }
      //割引あり
      for(int i=0;i<M;i++){
        int cost = a[sc.nextInt()-1]+b[sc.nextInt()-1]-sc.nextInt();
        ans = Math.min(ans,cost);
      }
      System.out.println(ans);
    }
}