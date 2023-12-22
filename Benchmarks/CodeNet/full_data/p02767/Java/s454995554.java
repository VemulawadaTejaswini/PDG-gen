import java.util.*;

public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		int p=0;
		if(sum%n!=0)
			p=(sum/n)+1;
		else 
			p=sum/n;
		int sum1=0;
		for(int i=0;i<n;i++)
			sum1=sum1+((a[i]-p)*(a[i]-p));
		System.out.println(sum1);
	}
}