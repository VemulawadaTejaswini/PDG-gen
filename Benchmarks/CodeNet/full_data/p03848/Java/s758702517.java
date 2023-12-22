import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[n];
		
		for(int i=0;i<n;i++)
			x[sc.nextInt()]++;
		int m = 0;
		boolean can = true;
		if(n%2==1){
			if(x[0]!=1)
				can = false;
			for(int i=2;i<n;i+=2){
				m++;
				if(x[i]!=2)
					can = false;
			}
		}
		else{
			for(int i=1;i<n;i+=2){
				m++;
				if(x[i]!=2)
					can = false;
			}
		}
		int sum = can?(int)Math.pow(2, m):0;
		System.out.print(sum);
	}
}
