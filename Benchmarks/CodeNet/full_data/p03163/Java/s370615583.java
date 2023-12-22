import java.util.Scanner;


public class Main {
	public static int Knapsack(int W,int n,int[]w,int[]v){
		if(n==0||W==0){
			return 0;
		}else{ if(w[n-1]>W){
			return Knapsack(W, n-1, w, v);}
		else{ return Math.max(v[n-1]+Knapsack(W-w[n-1], n-1, w, v), Knapsack(W, n-1, w, v));
	}}}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int W=sc.nextInt();
		int []v=new int[n+1];
		int []w=new int[n+1];
		v[0]=0;
		w[0]=0;
		for(int i=0;i<n;i++){
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		System.out.print(Knapsack(W,n,w,v));
	}
}