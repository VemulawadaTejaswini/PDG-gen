import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),hp=sc.nextInt();
		int hat=0;
		long at=0;
		int[] x=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			int a=sc.nextInt(),b=sc.nextInt();
			if(a>hat)
				hat=a;
			x[i]=b;
		}
		for(int i=0;i<n;i++){
			if(x[i]>hat){
				sum++;
				hp-=x[i];
			}
		}
		
		sum+=Math.ceil((double)hp/(double)hat);
		System.out.print(sum);
	}
}
