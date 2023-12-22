import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=-1;int b=-1; 
	    for(int i=1;i<=n;i++)
	    {
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        if(x>=a&&y>=b)
	        {
	            a=x;
	            b=y;
	        }
	        else
	        {
	           int st=(a%x==0)?a/x:a/x+1;
	           int en=(b%y==0)?b/y:b/y+1;
	           int dx=Math.max(st,en);
	           a=dx*x;
	           b=dx*y;
	        }
	    }
	    System.out.println(a+b);
	}}