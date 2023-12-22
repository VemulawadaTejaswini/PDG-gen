import java.util.*;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> div = divisor(n);
		int[] a = new int[n];
		int[] b = new int[n];
		int count = 0;
		for (int i : div) {
			a[count] = i;
			b[count] = n / a[count];
//		    System.out.print(a[count] + " ");
//		    System.out.print(b[count] + " ");
//		    System.out.println(" ");
		    count++;
		}
		int min = f(a[0], b[0]);
		for (int i = 0; i < count; i++) {
			min = Math.min(min, f(a[i], b[i]));
//			System.out.println(f(a[i], b[i]));
		}
		System.out.println(min);
		
	}
	
	public static final List<Integer> divisor(final int n) {
	    final List<Integer> list = new ArrayList<Integer>();

	    int p = 0;    //挿入位置
	    for (int i = 1; i * i <= n; i++) {    //√n
	        if (n % i == 0) {
	            list.add(p++, i);             //常に中心に入れていく
	            if (i != n / i) {
	                list.add(p, (n / i));       //常に中心に入れていく
	            }
	        }
	    }
	    return list;
	}
	
	public static int f(int a, int b) {
		int a_length = String.valueOf(a).length();
		int b_length = String.valueOf(b).length();
		if (a_length < b_length) {
			return b_length;
		} else {
			return a_length;
		}
	}

}