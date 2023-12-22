import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int H = stdIn.nextInt();
		int W = stdIn.nextInt();
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		String x = "";
		String y = "";
		for(int i = 0; i < A; i++) {
			x += "0";
		}
		for(int i = 0; i < W-A; i++) {
			x += "1";
		}
		for(int i = 0; i < A; i++) {
			y += "1";
		}
		for(int i = 0; i < W-A; i++) {
			y += "0";
		}
		
		for(int i = 0; i < B; i++) {
			System.out.println(x);
		}
		for(int i = 0; i < H-B; i++) {
			System.out.println(y);
		}

	}

}