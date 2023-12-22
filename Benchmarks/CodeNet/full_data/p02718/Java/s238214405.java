/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		int sum=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    sum+=a[i];
		}
		double min=((double)sum/(4*(double)m));
		 for(int i=0;i<n;i++){
		    if(a[i]<min)
		    continue;
		    else
		    count++;}
		    
		 if(count>=m)   
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}
