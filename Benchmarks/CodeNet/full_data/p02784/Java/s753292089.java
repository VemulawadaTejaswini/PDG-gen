import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int H = Integer.parseInt(scan.next());
		int N = Integer.parseInt(scan.next());
		int num = 0;
		while(N > 0) {
			num = num + Integer.parseInt(scan.next());
			N = N - 1;
		}
		
		if(num < H) {
			System.out.println("NO");
		} else { 
			System.out.println("YES");
		}
	}
}