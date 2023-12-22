
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		
		int []a = new int [n];
		
		for(int i = 0 ;i < n ;i++) {
			a[i] = (int)(s.charAt(i) - '0');
		}
		
		int cnt = 0;
		
		int []c = new int [4];
		c[3] = -1;
		
		for(c[0] = 0 ; c[0] <= 9 ; c[0]++) {
			int id = 0;
			for(c[1] = 0 ; c[1] <= 9 ; c[1]++) {
				for(c[2] = 0 ; c[2] <= 9 ; c[2]++) {
					
					for(int i = 0 ; i < n ;i++) {
						if(a[i] == c[id]) {
							id++;
						}
					}
					if(id == 3) {
						cnt++;
					}
					id = 0;
				}
			}
		}
		
		System.out.println(cnt);

	}
}
