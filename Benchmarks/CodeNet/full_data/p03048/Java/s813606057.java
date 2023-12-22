
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = Integer.parseInt(sc.next());
		int g = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		int n = Integer.parseInt(sc.next());
		
		long ans = 0;
		
		for(int i = 0 ; i * r <= 3000 ; i++) {
			for(int j = 0 ;j * g <= 3000 ; j++) {
				int temp = n - r*i - j*g;
				
				if(temp >= 0 && temp % b == 0) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);

	}

}
