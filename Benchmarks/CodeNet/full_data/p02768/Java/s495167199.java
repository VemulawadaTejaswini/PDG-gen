



import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 出力
      	long ans=(long)Math.pow(2,n)-combi(n,a)-combi(n,b)-1;
		System.out.println(ans%1000000007);
	}
	public static long combi(int n,int r){
		long c=1;
		for(int i=0;i<r;i++){
			c = c*(n-i)/(i+1);
		}
		return c;
	}
}