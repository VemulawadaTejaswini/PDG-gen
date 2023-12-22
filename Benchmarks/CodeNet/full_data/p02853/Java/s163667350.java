import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int m = scan.nextInt();
		int ans = 0;
		switch(c) {
		case 3:ans = 100000;
		break;
		case 2:ans = 200000;
		break;
		case 1:ans = 300000;
		}
		switch(m) {
		case 3:ans += 100000;
		break;
		case 2:ans += 200000;
		break;
		case 1:ans += 300000;
		}
		if(c == 1&&m == 1) {
			ans += 400000;
		}
		System.out.println(ans);
	}
}
