import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer>m = new HashMap<Integer,Integer>();
		
		int n = sc.nextInt();
		long k = sc.nextInt();
		int []a = new int [n];
		int []b = new int [n];
		
		for(int i = 0; i< n ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			m.put(a[i], b[i]);
		}
		Arrays.sort(a);
		long sum = 0;
		int ans = 0;
		for(int i = 0; i < n; i++) {
			sum += (long)m.get(a[i]);
			if(k <= sum) {
			    ans = a[i];
				break;
			}
		}
		System.out.println(ans);

	}

}
