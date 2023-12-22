import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = 0;;i++) {
			int c = (int)(i * 0.08);
			int d = (int)(i * 0.10);
			if(c > a || d > b) {
				System.out.println(-1);
				System.exit(0);
			}
			if(c == a && d == b){
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}
