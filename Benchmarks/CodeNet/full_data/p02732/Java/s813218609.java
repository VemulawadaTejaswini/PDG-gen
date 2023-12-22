import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] aa=new long[n];
		int[] a=new int[n];
		long sum=0;
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt()-1;
			aa[a[i]]++;
		}
		for(int i=0; i<n; i++){
			sum+=aa[i]*(aa[i]-1)/2;
		}
		for(int i=0; i<n; i++){
			System.out.println(sum-aa[a[i]]*(aa[a[i]]-1)/2+(aa[a[i]]-1)*(aa[a[i]]-2)/2);
		}
	}
}
