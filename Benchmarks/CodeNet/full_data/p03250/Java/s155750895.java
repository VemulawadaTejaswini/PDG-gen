import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result;
		
		if(a >= b && a >= c) {
			result = result(a,b,c);
		}else if(b >= a && b >= c) {
			result = result(b,c,a);
		}else {
			result = result(c,a,b);
		}
		
		System.out.println(result);
	}

	private static int result(int a, int b, int c) {
		return a*10+b+c;
	}
}
