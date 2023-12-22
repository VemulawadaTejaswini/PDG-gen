import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int k = sc.nextInt();
        int[] h = new int[n];
		for(int i=0;i<n;i++)
		  h[i] = sc.nextInt();
      
        int count =0;
        for(int i=0;i<n;i++)
          if(h[i]>=k)count++;
		// 出力
		System.out.println(count);
	}
}