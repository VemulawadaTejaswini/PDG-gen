import java.util.*;
import java.lang.*;
public class Main{
public static void main(String[] args) 
{
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	int x=scanner.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)a[i]=scanner.nextInt();
	int cnt=0;
	for(int i=0;i<n-2;i++)
	{	
		while((a[i]+a[i+1])>x){
			if((a[i+1]+a[i+2])>x){
				{if(a[i+1]>0){a[i+1]--;cnt++;}else {a[i]--;cnt++;}}}
				else {
					if(a[i]>0){a[i]--;cnt++;}
					else {a[i+1]--;cnt++;}
				}			
		}
	}
	if(a[n-2]+a[n-1]>x)cnt+=a[n-1]+a[n-2]-x;
	System.out.print(cnt);
}	
}

