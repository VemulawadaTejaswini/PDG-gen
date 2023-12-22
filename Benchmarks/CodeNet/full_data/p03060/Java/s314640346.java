import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
			for(int i=0;i<n;i++)
			b[i]=sc.nextInt();
		int c=0,s=0;
		for(int i=0;i<n;i++){
			if(a[i]>b[i]){
				c=c+a[i];
				s=s+b[i];
			}	
		}
		System.out.println(c-s);
	}
}