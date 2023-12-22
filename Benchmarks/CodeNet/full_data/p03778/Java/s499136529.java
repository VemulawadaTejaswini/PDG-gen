import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt(),a = sc.nextInt(),b = sc.nextInt();
		if(a < b) {
			int aw_b = b-(a+W);
			if(aw_b > 0) System.out.println(aw_b);
			else System.out.println(0);
		}else {
			int bw_a = a-(b+W);
			if(bw_a > 0) System.out.println(bw_a);
			else System.out.println(0);
		}
	}
}