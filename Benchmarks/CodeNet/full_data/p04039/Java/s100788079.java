import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		String kirai[] = new String[k];
		for (int i = 0; i < k; i++) {
			kirai[i] = sc.next();
		}

		String number[];
		number = String.valueOf(n).split("");
		String anser = "";
		for (int j = 0; j < number.length; j++) {
			for (int h = 0; h < kirai.length; h++) {// ここは二分探索のほうが良い
				if (kirai[h].equals(number[j])) {
					int n2 = (Integer.parseInt(number[j]) + 1) % 10;// これだと小さい数ができない
					number[j] = String.valueOf(n2);
					if(n2 == 1)h = 0;
				}
			}
			anser += number[j];
		}

		System.out.println(anser);
	}
}
