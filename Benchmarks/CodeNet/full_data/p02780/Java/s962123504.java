import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] substr = str.split(" ", 0);
		int n = Integer.parseInt(substr[0]);
		int kosuu = Integer.parseInt(substr[1]);

		str = scan.nextLine();
		substr = str.split(" ", 0);

		int seikai = 0;
		double kouho = 0.0;
		for (int i= 0; i<kosuu; i++) {
			kouho += Integer.parseInt(substr[i]);
		}
		double ans = kouho;
		for (int i=0; i<n-kosuu+1; i++) {
			kouho -= Integer.parseInt(substr[i]);
			kouho += Integer.parseInt(substr[i+kosuu-1]);
			if (ans < kouho) {
				ans = kouho;
				seikai = i;
			}
		}
		ans = 0;
		for (int i=seikai; i<seikai+kosuu; i++) {
			ans += kitaichi(Integer.parseInt(substr[i]));
		}

		System.out.printf("%.12f\n", ans);
	}

	public static double kitaichi(int a) {
		double ans = a * 0.5 + 0.5;
		return ans;
	}

}

