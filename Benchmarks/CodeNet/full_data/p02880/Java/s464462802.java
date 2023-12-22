import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.Stack;

public class Main {
	static Scanner scn = new Scanner(System.in);
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n,k,sum=9,max=0,j=0;
			n=scn.nextInt();
			if(n==1||n==2||n==3||n==4||n==5||n==6||n==7||n==8||n==9)
			{
				System.out.println("Yes");
				return;
			}
			int arr[]=new int[(int) Math.sqrt(n)+100];
			int brr[]=new int[(int) Math.sqrt(n)+100];
			for(int i=2;i*i<=n;i++,j++)
			{
				if(n%i==0)
				{	
						arr[j]=i;
						brr[j]=n/i;
				}
			}
			for(int i=0;i<Math.sqrt(n)+90;i++)
			{
				if(arr[i]*brr[i]==n && arr[i]<=9&&brr[i]<=9)
				{
					System.out.println("Yes");
					return;
				}
			}
			System.out.println("No");
			
	}
	
}
