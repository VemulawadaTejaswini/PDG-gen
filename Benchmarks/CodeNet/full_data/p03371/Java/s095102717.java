import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int x = sc.nextInt();
		int y = sc.nextInt();

		int ans = Integer.MAX_VALUE;
		for (int i=0; i<=Math.max(x, y)*2; i+=2){
			int aNum = Math.max(0, x - (i / 2));
			int bNum = Math.max(0, y - (i / 2));
			int cNum = i;
			ans = Math.min(ans, (aNum * a) + (bNum * b) + (cNum * c));
		}
		System.out.println(ans);
	}
}