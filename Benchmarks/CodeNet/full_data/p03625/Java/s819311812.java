import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[n];
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
		}
		Arrays.sort(x);
		int sum=1,t=0;
		for(int i=n-1;i>=1;i--){
			if(x[i]==x[i-1]){
				t++;
				sum*=x[i];
				i--;
			}
			if(t==2)
				break;
				
		}
		if(t==0)
			sum=0;
		System.out.print(sum);
	}
}
