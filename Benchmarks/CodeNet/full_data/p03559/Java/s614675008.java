import java.util.Arrays;
import java.util.Scanner;;
public class Main {
	
	static Integer []a;
	static Integer []b;
	static Integer []c;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		a = new Integer [n];
		b = new Integer [n];
		c = new Integer [n];
				
		for(int i = 0; i < n ;i++) {
			a[i] = sc.nextInt();
		}
		for(int i= 0; i < n;i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < n ;i++) {
			c[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		long ans = 0;
		
		for(int i = 0 ; i < n; i++) {
			int temp1 = ~Arrays.binarySearch(a, b[i],(x,y)-> x.compareTo(y) >=0 ? 1:-1) - 1;
			int temp2 = ~Arrays.binarySearch(c, b[i],(x,y)-> x.compareTo(y) > 0 ? 1:-1);
			ans += (long)(temp1 + 1)* (n - temp2);
		}
		
		System.out.println(ans);
		
		
	}
	
}