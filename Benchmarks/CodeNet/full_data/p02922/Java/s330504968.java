
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int power = scan.nextInt();
		int kuti = scan.nextInt();
		int ans = 0;

		for(int re=0;re<kuti;re++) {
			if(power*re >= kuti) {
				ans = re;
				break;
			}
		}
		System.out.println(ans);
		scan.close();
	}

}
