import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long H = sc.nextLong();
		Long W = sc.nextLong();
		if (H%3==0||W%3==0) {
			System.out.println(0);
			return ;
		}
		long min = H>W?W:H;
		for (int i=1;i<W;i++) {
			long A = H*i;
			long B = (W-i)*(H/2);
			long C = (W-i)*(H/2+H%2);
			long temp = Math.abs(A-B);
			if (C-B>temp) {
				temp = C-B;
			}
			if (Math.abs(A-C)>temp) {
				temp = Math.abs(A-C);
			}
			if (min>temp) {
				min = temp;
			}
		}
		for (int i=1;i<H;i++) {
			long A = W*i;
			long B = (H-i)*(W/2);
			long C = (H-i)*(W/2+W%2);
			long temp = Math.abs(A-B);
			if (C-B>temp) {
				temp = C-B;
			}
			if (Math.abs(A-C)>temp) {
				temp = Math.abs(A-C);
			}
			if (min>temp) {
				min = temp;
			}
		}
		System.out.println(min);
	}
}