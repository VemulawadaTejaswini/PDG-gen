import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int x=sc.nextInt();
	   int ar[]=new int[n];
	   for(int i=0;i<n;i++)
	   ar[i]=sc.nextInt();long count=0;
	   for(int i=0;i<n-1;i++)
	   {
	       int dif=ar[i]+ar[i+1]-x;
	       if(dif>0)
	       {
	           if(ar[i+1]>=dif)
	           {
	               ar[i+1]-=dif;
	           }
	           else{
	               ar[i+1]=0;
	               ar[i]-=(dif-ar[i+1]);
	           }
	           count+=dif;
	       }
	       else
	       continue;
	   }
	   System.out.println(count);}}
	   
	   
	   