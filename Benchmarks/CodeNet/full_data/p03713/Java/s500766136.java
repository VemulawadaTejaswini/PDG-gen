
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	
	public static void debug(int a, int b, int c, int d) {
		boolean debug = true;
		if(debug) {
			System.out.println("a=" + a + " b=" + b + " c="+ c + " d=" + d);
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int first_value = first(h, w);
		int second_value = second(h, w);
		int third_value = third(h, w);
		int fourth_value = fourth(h, w);
		debug(first_value, second_value, third_value, fourth_value);
		System.out.println(result_value(first_value, second_value, third_value, fourth_value));
		
	}
	
	private static int result_value(int a, int b, int c, int d) {
		if(a <= b && a <= c && a <= d) {
			return a;
		} else if(b <= c && b <= d) {
			return b;
		} else if(c <= d) {
			return c;
		} else {
			return d;
		}
	}
	
	private static long max_of_area(long a, long b, long c) {
		if(a >= b && a >= c) {
			return a;
		} else if(b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}
	
	private static long min_of_area(long a, long b, long c) {
		if(a <= b && a <= c) {
			return a;
		} else if(b <= a && b <= c) {
			return b;
		} else {
			return c;
		}
	}
	 
	private static int first(int h, int w) {
		int h1, h2, h3;
		h1 = h / 3;
		h2 = h / 3;
		h3 = h / 3;
		
		if(h % 3 == 1) {
			h1 += 1;
		} else if(h % 3 == 2) {
			h1 += 1;
			h2 += 1;
		}
		
		long max_area = max_of_area((long)h1 * w, (long)h2 * w, (long)h3 * w);
		long min_area = min_of_area((long)h1 * w, (long)h2 * w, (long)h3 * w);
		
		return (int)(max_area - min_area);
	}
	
	private static int second(int h, int w) {
		int w1, w2, w3;
		w1 = w / 3;
		w2 = w / 3;
		w3 = w / 3;
		
		if(w % 3 == 1) {
			w1 += 1;
		} else if(w % 3 == 2) {
			w1 += 1;
			w2 += 1;
		}
		
		long max_area = max_of_area((long)h * w1, (long)h * w2, (long)h * w3);
		long min_area = min_of_area((long)h * w1, (long)h * w2, (long)h * w3);

		return (int)(max_area - min_area);
	}
	
	private static int third(int h, int w) {
		int h1, h2, w1, w2;
		h1 = h / 2;
		h2 = h / 2;
		w1 = w / 2;
		w2 = w / 2;
		
		if(h % 2 == 1) {
			h1 += 1;
		}
		if(w % 2 == 1) {
			w1 += 1;
		}
		
		int result_min = Integer.MAX_VALUE;
		while(w2 > 0) {
			long max_area = max_of_area((long)h1 * w1, (long)h2 * w1, (long)(h1 + h2) * w2);
			long min_area = min_of_area((long)h1 * w1, (long)h2 * w1, (long)(h1 + h2) * w2);
			if(result_min > max_area - min_area) {
				result_min = (int)(max_area - min_area);
			}
			
			w1 += 1;
			w2 -= 1;
		}
		
		return result_min;
	}
	
	private static int fourth(int h, int w) {
		int h1, h2, w1, w2;
		h1 = h / 2;
		h2 = h / 2;
		w1 = w / 2;
		w2 = w / 2;
		
		if(h % 2 == 1) {
			h1 += 1;
		}
		if(w % 2 == 1) {
			w1 += 1;
		}
		
		int result_min = Integer.MAX_VALUE;
		while(h2 > 0) {
			long max_area = max_of_area((long)h1 * w1, (long)h1 * w2, (long)h2 * (w1 + w2));
			long min_area = min_of_area((long)h1 * w1, (long)h1 * w2, (long)h2 * (w1 + w2));
			
			if(result_min > max_area - min_area) {
				result_min = (int)(max_area - min_area);
			}
			System.out.println("debug" + "max=" + max_area + " min=" + min_area);
			h1 += 1;
			h2 -= 1;
		}
		
		return result_min;
	}
}