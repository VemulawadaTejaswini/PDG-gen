import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),a=sc.nextInt();
		int[] x=new int[n];
		long sum = 0;
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
			if(x[i]+x[i+1]>a){
				int t=x[i]+x[i+1]-a;
				sum+=t;
				if(x[i+1]>=t)
					x[i+1]-=t;
				else{
					x[i+1]=0;
				}
			}
		}
		System.out.print(sum);
	}
}
