import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int min = a[0];
		
		for (int i = 0; i < a.length-1; i++) {
			min = gcp(min,a[i+1]);
		}
		System.out.println(min);
		
		sc.close();
	}
	
	public static int gcp (int a, int b) {
		int temp;
		while ((temp = a%b) != 0) {
			a = b;
			b = temp;
		}
		return  b;
	}
	
}