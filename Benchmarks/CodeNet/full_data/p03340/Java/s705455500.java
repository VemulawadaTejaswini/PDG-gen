import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long[] ar=new long[n];
		for(int i=0;i<n;i++){
			ar[i]=scn.nextLong();
		}
		int count = 0;
		int rt = 0;
		int sum=0;
		for(int i=0;i<n;i++){
			while(rt<n && sum+ar[rt]==(sum^ar[rt])){
				sum+=ar[rt];
				rt++;
			}
			count+=rt-i;
			if(rt==i)
				rt++;
			sum-=ar[i];
		}
		System.out.println(count);
	}
}