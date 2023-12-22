import java.util.Scanner;


public class Main{
	public static long Knapsack(long W,int n,long[]w,long[]v){
		if(n==0||W==0){
			return 0;
		}else{ if(w[n-1]>W){
			return Knapsack(W, n-1, w, v);}
		else{ return Math.max((v[n-1]+Knapsack(W-w[n-1], n-1, w, v)), (Knapsack(W, n-1, w, v)));
	}}}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long W=sc.nextLong();
		long []v=new long[n];
		long []w=new long[n];
		for(int i=0;i<n;i++){
			w[i]=sc.nextLong();
			v[i]=sc.nextLong();
		}
		System.out.print(Knapsack(W,n,w,v));
	}
}
