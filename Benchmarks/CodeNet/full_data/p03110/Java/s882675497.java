import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		double sum = 0;

		for(int i = 0; i < count; i++) {
			String[] data = sc.nextLine().split(" ");
			double money = Double.parseDouble(data[0]);
			String tuuka = data[1];

			if(tuuka == "BTC") {
				sum += money * 380000;
			}else {
				sum += money;
			}
		}
		System.out.println(sum);
	}
}