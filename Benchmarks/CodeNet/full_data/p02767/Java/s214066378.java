import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();

		int hpConsumptions = 0;

		while(sc.hasNext()) {
			hpConsumptions += (sc.nextInt() - P) * (sc.nextInt() - P);
		}
		System.out.print(hpConsumptions);;
	}
}