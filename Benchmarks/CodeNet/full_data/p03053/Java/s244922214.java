import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		String[][] mas = new String[a][b];
		for (int i = 0; i < a; i++) {
			String s = sc.next();
			for (int j = 0; j < b; j++) {
				mas[i][j] = s.substring(j, j + 1);
			}
		}
		while (Arrays.stream(mas).flatMap(s -> Arrays.stream(s))
				.collect(Collectors.toList()).contains(".")) {
			count++;
			String[][] ms = new String[a][b];
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (mas[i][j].equals(".")) {
						if (i >= 1) {
							if (mas[i - 1][j].equals("#")) {
								ms[i][j] = "#";
								break;
							}
						}
						if (j >= 1) {
							if (mas[i][j - 1].equals("#")) {
								ms[i][j] = "#";
								break;
							}
						}
						if (i < mas.length - 1) {
							if (mas[i + 1][j].equals("#")) {
								ms[i][j] = "#";
								break;
							}
						}
						if (j < mas[1].length - 1) {
							if (mas[i][j + 1].equals("#")) {
								ms[i][j] = "#";
								break;
							}
						}
						ms[i][j] = ".";
					} else {
						ms[i][j] = "#";
					}
				}
			}
			mas = ms;
		}
		System.out.println(count);
	}


}
