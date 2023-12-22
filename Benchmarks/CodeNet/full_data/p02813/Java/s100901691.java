import java.util.*;
import java.lang.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		int[] B = new int[N+1];
		int[] r1 = new int[N+1];
		int[] r2 = new int[N+1];
		for(int i=1; i<=N; i++)
		{
			A[i]=sc.nextInt();
		}
		for(int i=1; i<=N; i++)
		{
			B[i]=sc.nextInt();
		}
		for(int i=1; i<=N; i++)
		{
			int count=0;
			for(int j=i+1; j<=N; j++)
			{
				if(A[j]<A[i])
				{
					count++;
				}
			}
			r1[i]=count;
		}
		for(int i=1; i<=N; i++)
		{
			int count=0;
			for(int j=i+1; j<=N; j++)
			{
				if(B[j]<B[i])
				{
					count++;
				}
			}
			r2[i]=count;
		}
		int sum=0;
		
		for(int i=1;i<=N; i++)
		{
			//System.out.println("r1: "+r1[i]);
		}
		
		for(int i=1; i<=N; i++)
		{
			//System.out.println("hii "+ (N-i));
			sum+=factorial(N-i)*r1[i];
			
		}
		int sum1=0;
		for(int i=1; i<=N; i++)
		{
			//System.out.println("byee");
			sum1+=factorial(N-i)*r2[i];
			
		}
		System.out.println(Math.abs(sum-sum1));
	}
	static int factorial(int n) 
    { 
        int res = 1, i; 
        for (i=2; i<=n; i++) 
            res *= i; 
        return res; 
    } 
	
}
