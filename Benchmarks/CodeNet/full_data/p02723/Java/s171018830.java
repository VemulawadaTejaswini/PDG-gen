import java.util.Scanner;
public class Main {
	public static void Main(String[] args) {
		System.out.println("所持金入力");
		Scanner sc = new Scanner(System.in);
		int haveyen = sc.nextInt();
		int happy500 = 0;
		int happy5 = 0;
		int money = 0;

		if(haveyen >= 500) {
			happy500 += haveyen /500;
			money = haveyen % 500;
		}
		if(money >= 5) {
			happy5 += money / 5;
		}

		System.out.println((happy500 * 1000 + happy5 * 5));
	}
}