import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //参加者
		int days = sc.nextInt();
		int remain = sc.nextInt();// x
		int chocos = 0;
		int every = 0;
		for (int i = 0; i < n; i++) {
			every = sc.nextInt();
			chocos += checkChoco(days, every);
		}
		System.out.println(chocos + remain);
	}

	static int checkChoco(int days, int every) {
		int counta = 0;
		if (days % every == 0) {
			counta = days / every;
		} else {
			counta = days / every;
			counta++;
		}
		return counta;
	}
}