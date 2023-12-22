import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		int ww1 = w / 2 + (w % 2);
		int ww2 = (w-1) / 2 + ((w-1) % 2);

		int ans = 0;
		if (h % 2 == 0) {
			ans = (ww1+ww2)*(h/2);
		} else {
			ans = ans = (ww1+ww2)*(h/2) + ww1;
		}

		sc.close();
		System.out.println(ans);
	}
}
