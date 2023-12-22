
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		int all = 0;
		for(int i = 0 ;i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			all += a[i];
		}
		
		double limit = all / 4 / m;
		
		int cnt = 0 ;
		for(int i = 0 ; i < n ;i++) {
			if(limit <=  a[i]) {
				cnt++;
			}
		}
		
		if(cnt >= m) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		

	}

}
