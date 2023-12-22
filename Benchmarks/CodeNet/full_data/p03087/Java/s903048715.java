import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String s=sc.next();
		int arr[]=new int[a+1];
		arr[1]=0;
		for(int i=1;i<a;i++){
		if(s.charAt(i-1)=='A'&&s.charAt(i)=='C')
			arr[i+1]=1;
		}
		for(int i=1;i<=a;i++)
			arr[i]=arr[i-1]+arr[i];
		for(int i=0;i<b;i++){
			int sum=0;
			int m=sc.nextInt();
			int n=sc.nextInt();
			sum=arr[n]-arr[m];
			System.out.println(sum);
		}
	}
}