import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		int cnt = 0;
		
		while(n > 0) {
			
			cnt++;
			n = n/k;
		}
		
		System.out.println(cnt);
	
	}



}