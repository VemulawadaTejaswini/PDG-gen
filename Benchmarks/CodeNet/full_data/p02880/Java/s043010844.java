
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		boolean bruh = false;
		for (int i = 1 ; i <= 9 ; i ++) {
			if (bruh) { break;}
			for (int q = 1 ; q <= 9 ; q++) {
				if (p == (i*q)) {
					System.out.println("Yes");
					bruh = true;
					break;
				}
			}
		}
		if (false == bruh){
		System.out.println("No");
		}
	}
}
