import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = min;
		for (int i = 0; i < 4; i++) {
			int num = sc.nextInt();
			if (num < min) {
				min = num;
			} else {
				if (num > max) {
					max = num;
				}
			}
		}
		int dif = max - min;
		if (dif > sc.nextInt()) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}
		sc.close();
	}
}