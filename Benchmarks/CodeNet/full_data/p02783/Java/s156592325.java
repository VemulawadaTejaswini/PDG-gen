import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = sc.nextInt();

		int ans = 0;

		for(int i=0;i<20000;i++) {
			if(i*a >= h) {
				ans = i;
				break;
			}
		}

		System.out.println(ans);

	}
}
