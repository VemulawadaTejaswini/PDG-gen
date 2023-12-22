import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int[] arr = {a, b, c};
		Arrays.sort(arr);
		int max = arr[2];
		int diff1 = max - arr[0];
		int diff2 = max - arr[1];
		//System.out.println(diff1 + " " + diff2 + " " + max);
		if(diff1 % 2 == 0 && diff2 % 2 == 0) {
			System.out.println(diff1/2 + diff2/2);
		} else if(diff1 % 2 == 1 && diff2 % 2 == 1) {
			System.out.println(1+(diff1-1)/2 + (diff2-1)/2);
		} else if(diff1 % 2 == 0 && diff2 % 2 == 1) {
			int ans = 0;
			ans += (diff2+1)/2 + diff1/2 + 1;
			System.out.println(ans);
		} else if(diff1 % 2 == 1 && diff2 % 2 == 0) {
			int ans = 0;
			ans += (diff1+1)/2 + diff2/2 + 1;
			System.out.println(ans);
		}
	}
}