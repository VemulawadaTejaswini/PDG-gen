import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),a=sc.nextInt();
		int[] x=new int[n+1];
		x[n]=0;
		long sum = 0;
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(x[i]>a){
				sum+=x[i]-a;
				sum+=x[i+1];
				i++;
			}else{
				if(x[i]+x[i+1]>a){
					sum+=x[i]+x[i+1]-a;
					i++;
				}
			}
		}
		System.out.print(sum);
	}
}