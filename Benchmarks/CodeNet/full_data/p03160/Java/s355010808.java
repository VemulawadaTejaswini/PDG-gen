//package godiji;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
	static Scanner scn = new Scanner(System.in);
	// static int count = 0;

	public static void main(String[] args) throws Exception {
		
			int n = scn.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=scn.nextInt();
		if(n==2)
			System.out.println(Math.abs(arr[1]-arr[0]));
		else
		{
		long sum=0;
			for(int i=n-1;i>=0;)
			{
				if(i==0)
				{
					break;
				}
				else if(i==1)
				{
					sum+=Math.abs(arr[i]-arr[i-1]);
					break;
				}
				else
				{
					sum+=Math.min(Math.abs(arr[i]-arr[i-1]), Math.abs(arr[i]-arr[i-2]));
					//System.out.println(sum);
					if(Math.abs(arr[i]-arr[i-1])<Math.abs(arr[i]-arr[i-2]))
						i--;
					else
						i-=2;
				}
			}
			System.out.println(sum);
		}
	}
public static int lcm(int a,int b)
{
	return gcd(a,b)/(a*b);
}
	public static int gcd(int a, int n) {

		if (a == 0)
			return n;
		return gcd(n % a, a);
	}
}

class pair {
	int x;
	int y;

	pair(int a, int b) {
		this.x = a;
		this.y = b;
	}
}

class sorting implements Comparator<pair> {

	@Override
	public int compare(pair o1, pair o2) {
		// TODO Auto-generated method stub

		int a = Math.max(o1.x, o2.x), b = o1.y - o2.y;
		if (b > 0)
			return -1;
		else
			return 0;
	}

}
