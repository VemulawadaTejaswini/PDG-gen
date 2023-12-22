import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum = 1;
		int[] x=new int[n];
		for(int i=0;i<n;i++)
			x[i] = sc.nextInt();
		for(int i=n-1;i>0;i--)
			if(x[i]>x[i-1]) 
				sum++;
		System.out.print(sum);
	}
}
