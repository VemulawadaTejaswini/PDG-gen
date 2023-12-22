import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
	     int arr[]=new int[a+1];
		 for(int i=1;i<=b;i++){
			 int m=sc.nextInt();
			 int n=sc.nextInt();
			 for(int j=m;j<=n;j++)
				 arr[j]=arr[j]+1;
		 }
		 
		 for(int i=1;i<=a;i++){
			  if(arr[i]>=b)
				 c++;
		 }
		 System.out.println(c);
	}
}