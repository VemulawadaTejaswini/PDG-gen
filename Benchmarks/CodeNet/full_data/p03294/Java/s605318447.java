import java.util.Scanner;
import java.math.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int a = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		//1文字ずつ
		//s.atChar(i);
		// 出力
		//System.out.println("");
		//double countx=0;
		//int T=sc.nextInt();
		int N=sc.nextInt();
		int[] a=new int[N];
		long lc=0;
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
			if(i==0){
				lc=a[i];
			}else{
				lc=lcm(lc,a[i]);
			}
		}
		//System.out.println("lc:"+lc);
		int biggersum=0;
		int lastsum=0;
		int count=0;
		int sum=0;
		for(int j=0;j<N;j++){
			sum+=(lc-1)%a[j];
		}
		System.out.println(sum);
		
		//System.out.println(lastsum);
		
		
		/*
		 * m=k1 a1 + sum1
		 *  =k2 a2 + sum2
		 * 
		 * 
		 * 
		 * aiの最小公倍数でループ
		 */
		
		
	}
	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}