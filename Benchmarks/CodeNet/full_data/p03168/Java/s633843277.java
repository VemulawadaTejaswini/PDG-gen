import java.util.*;

public class Main{
	
	private static Scanner sc=new Scanner(System.in);
	private static final int MOD=1000000007;
	
		
	public static double printComb(int coins,int H,int T,double []prob,double hprob){
		if(coins==0){
			if(H>T){
				return hprob;
			}
			else{
				return 0;
			}
		}
		double ans=0.0;
		ans+=printComb(coins-1,H+1,T,prob,hprob*prob[coins-1]);
		ans+=printComb(coins-1,H,T+1,prob,hprob*(1-prob[coins-1]));
		return ans;
	}
	
	
	public static void main(String []args){
		int n=sc.nextInt();
		double hp=1.0;
		double tp=1.0;
		double prob[]=new double[n];
		for(int i=0;i<n;i++){
			prob[i]=sc.nextDouble();
		}
		System.out.println(printComb(n,0,0,prob,1));
	}
	
}