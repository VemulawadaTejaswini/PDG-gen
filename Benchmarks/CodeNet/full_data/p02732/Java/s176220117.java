
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		int []b = new int [10000000];
		for(int i = 0 ;i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			b[a[i]]++;
		}
		long ans1 = 0;
		
		for(int i = 0 ;i <=2000001 ; i++) {
			long temp = (long)b[i];
			ans1 += (long)(temp * (temp -1)) /2;
		}
		
		for(int i = 0 ; i < n ;i++) {
			long ans =(long)(ans1 - b[a[i]] + 1);
			System.out.println(ans);
		}
		
	}

}
