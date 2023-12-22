import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int H = Integer.parseInt(scan.next());
		int N = Integer.parseInt(scan.next());
		int num = 0;
		for(int i = 0; i < N;i++) {
			num = num + Integer.parseInt(scan.next());
		}
		if(num < H) {
			System.out.println("No");
		} else { 
			System.out.println("Yes");
		}
	}
}