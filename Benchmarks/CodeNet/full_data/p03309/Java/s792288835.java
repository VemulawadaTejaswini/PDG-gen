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
		
		int N=sc.nextInt();
		int min=1000000001;
		int max=0;
		//int B=sc.nextInt();
		int[] a=new int[N];
		
		for(int i=0;i<N;i++){
			int k=sc.nextInt();
			a[i]=k-i;
			if(a[i]<min){
				min=a[i];
			}else if(a[i]>max){
				max=a[i];
			}
		}
		//int difmin=1000000001;
		
		// 5 3 1 -1 -3 -5
		//0 -1 -2 -3 -3 -3 -3
		int pastsum=1000000001;
		for(int b=min;b<=max;b++){
			int sum=0;
			for(int i=0;i<N;i++){
				sum+=Math.abs(a[i]-b);
			}
			if(pastsum<sum){
				break;
			}else{
				pastsum=sum;
			}		
		}
		System.out.println(pastsum);
	}
}