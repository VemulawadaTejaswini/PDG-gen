import java.util.*;
import java.lang.Math.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		for(int i=1;i<n;i++)arr[sc.nextInt()]++;
		for(int i=1;i<n+1;i++)System.out.println(arr[i]);
	}
}