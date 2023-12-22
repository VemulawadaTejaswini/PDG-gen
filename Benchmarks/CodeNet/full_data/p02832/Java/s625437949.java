import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++)arr[i]=sc.nextInt();
		int j=1;
		int c=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==j)j++;
			else c++;
		}
		if (c==n)System.out.println(-1);
		else System.out.println(c);
	}
} 