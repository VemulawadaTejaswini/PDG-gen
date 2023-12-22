import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int H = reader.nextInt();
		int W = reader.nextInt();
		int h = reader.nextInt();
		int w = reader.nextInt();
		reader.close();
		int remain = H * W;
		remain -= h * W;
		H -= h;
		remain -= w * H;


		System.out.print(remain);
	}
}

