import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int[] x=new int[n];
		int[] m=new int[n];
		
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
		}
		int profit = 0;
		for(int i=n-1;i>=0;i--){
			m[i] = x[i];
			if(i+1<n&&m[i+1]>x[i])
				m[i] = m[i+1];
			if(m[i]-x[i]>profit)
				profit = m[i]-x[i];
		}
		int sum = 0;
		for(int i=0;i<n;i++)
			if(m[i]-x[i]==profit)
				sum++;
		System.out.print(sum);
	}
}