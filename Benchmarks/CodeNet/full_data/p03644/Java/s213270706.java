import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>=64) {
			System.out.println(64);
		}else if(N>=32) {
			System.out.println(32);
		}else if(N>=16) {
			System.out.println(16);
		}else if(N>=8) {
			System.out.println(8);
		}else if(N>=4) {
			System.out.println(4);
		}else if(N>=2) {
			System.out.println(2);
		}else {
			System.out.println(1);
		}
	}
	public static int sample() {
		return 1;
	}

}
