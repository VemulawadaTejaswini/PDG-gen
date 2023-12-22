package abc125;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		if(n==2) {
			System.out.println(Math.max(a[0], a[1]));
		}else {
			int[] array = new int[3];
			array[0] = gcd(a[0],a[1]);
			array[1] = gcd(a[0],a[2]);
			array[2] = gcd(a[1],a[2]);
			Arrays.sort(array);
			int highest = array[2];
			int highest2 = array[1];
			int unRemoved = gcd(array[0],a[2]);
			for(int i=3;i<n;i++) {
				array[0] = gcd(highest,a[i]);
				array[1] = gcd(highest2,a[i]);
				array[2] = unRemoved;
				Arrays.sort(array);
				highest = array[2];
				highest2 = array[1];
				unRemoved = gcd(unRemoved,a[i]);
			}
			System.out.println(highest);
		}
		in.close();
		
		

	}
	
	public static int gcd(int a,int b) {
		if(b==0) return a;
		else {
			return gcd(b,a%b);
		}
	}

}
