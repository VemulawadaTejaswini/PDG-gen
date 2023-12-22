import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int d = in.nextInt();
		
		// 守備範囲
		d = d*2 +1;
		
		if(n%d == 0) {
			System.out.println(n/d);
		} else {
			System.out.println(n/d +1);
		}
		
		in.close();
	}
}
