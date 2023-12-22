import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] temp = sc.nextLine().split(" ");
		int w = Integer.parseInt(temp[0]);
		int h = Integer.parseInt(temp[1]);
		int x = Integer.parseInt(temp[2]);
		int y = Integer.parseInt(temp[3]);

		double ans   = w * h /2;
		int count = 0;
		if(x * 2 == w && y * 2 == h) {
			count ++;
		}

		System.out.println(ans + " " + count);

	}

}
