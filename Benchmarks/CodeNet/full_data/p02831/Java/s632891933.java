import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result =  a * b  /  aaa(a, b);

		System.out.println(result);
	}
	
	private static int aaa(int m, int n) {
	    if(m < n) return aaa(n, m);
	    if(n == 0) return m;
	    return a(aan, m % n);
	}
	
}