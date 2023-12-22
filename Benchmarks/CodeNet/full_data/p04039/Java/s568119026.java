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
		String keta = "";
		for (int j = number.length - 1; j >= 0; j--) {
			for (int h = 0; h < kirai.length; h++) {
				if (kirai[h].equals(number[j])) {
					int n2 = (Integer.parseInt(number[j]) + 1) % 10;// これだと小さい数ができない
					number[j] = String.valueOf(n2);
					if (n2 == 0) {
						h = 0;
						if (j == 0)
							keta = "1";
						else {
							int n3 = (Integer.parseInt(number[j - 1]) + 1) % 10;
							number[j - 1] = String.valueOf(n3);
							for (int i = j - 2; i >= 0; i--) {
								if (number[i].equals("0")) {
									if (i == 0)
										keta = "1";
									else {
										n3 = (Integer.parseInt(number[i]) + 1) % 10;
										number[i] = String.valueOf(n3);
									}
								} else
									break;
							}
						}
					}
				}
			}
		}

		for (int i = 0; i < number.length; i++) {
			anser += number[i];
		}
		if (keta.equals("1")) {
			keta += anser;
			System.out.println(keta);
		} else
			System.out.println(anser);
	}
}