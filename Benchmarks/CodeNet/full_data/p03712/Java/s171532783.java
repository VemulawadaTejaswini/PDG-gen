import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] a = new String[H];
		for(int i = 0; i < H; i++) {
			a[i] = sc.next();
		}
		StringBuilder buf = new StringBuilder();
		for(int i = 0; i < W+2; i++) {
			buf.append("#");
		}
		String frame = buf.toString();
		System.out.println(frame);
		for(int i = 0; i < H; i++) {
			System.out.println("#" + a[i] + "#");
		}
		System.out.println(frame);
	}
}
