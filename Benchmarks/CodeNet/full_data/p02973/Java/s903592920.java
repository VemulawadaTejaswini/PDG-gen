import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      int[] a = new int[N];
      int[] sum = new int[N];
      Arrays.fill(sum, -1);
      int i=0;
      int j=0;
      int k=0;
      int count=1;
      boolean flg =true;
      a[0] = sc.nextInt();
      for(i=1;i<N;i++){
        a[i] = sc.nextInt();
        if(a[i]<=a[i-1]){
          flg=true;
          for(j=0;flg&&sum[j]>-1&&j<N;j++){
            flg=a[i]<=sum[j];
          }
          if(flg){
            count++;
            sum[k]=a[i];
            k++;
          }
        }
      }
      System.out.println(count);
    }
}