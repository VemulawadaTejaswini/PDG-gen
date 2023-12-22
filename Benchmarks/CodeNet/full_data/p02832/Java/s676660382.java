
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []a = new int [n];
		
		for(int i = 0 ;i < n ;i++) {
			a[i] = sc.nextInt();
		}
		
		int cnt = 1;
		
		for(int i = 0 ; i < n ;i++) {
			if(cnt == a[i]) {
				cnt++;
			}
		}
		if(cnt == 1) {
			System.out.println(-1);
		}
		else {
		System.out.println(n - cnt +1);

		}
	}

}
