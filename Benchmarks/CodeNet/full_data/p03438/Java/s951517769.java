
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		int []b = new int [n];
		
		for(int i = 0  ; i < n ; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		for(int i = 0 ;i < n ;i++) {
			b[i] = Integer.parseInt(sc.next());
		}
	
		long cnt = 0;
		for(int i = 0 ; i < n ;i++) {
			long temp = (long)a[i] - b[i];
			if(temp < 0) {
				temp *= -1;
				if(temp % 2 == 0) {
					cnt -= temp / 2;
					}
				else {
					cnt -= (temp -1)/2;
				}
			}
			else {
					cnt += temp;
				}
			}
			if(cnt < 0 && cnt % 2 == 1) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
	}

}
