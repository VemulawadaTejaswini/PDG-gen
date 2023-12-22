import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int maxHeight[] = new int[a];
		int minimum = 0;
		int flower[] = new int[a];
		int max = 0;
//		populate input
		String readline = sc.nextLine();
		String[] test = readline.split(" ");
		for (int i = 0; i < a; i++) {
			flower[i] = 0;
			maxHeight[i] = Integer.parseInt(test[i]);
			if (maxHeight[i] > max)
				max = maxHeight[i];
		}

		boolean flag = true;
		for (int j = 0; j < a; j++) {
			int k = 0;
			while (k < a) {
				// if meet max height or at the very edge
				if (flower[k] == maxHeight[k] && k != 0) {
					if (k == a - 1) {
						minimum += 1;
					} else if (Arrays.equals(maxHeight, flower))
						break;
					else {
						for (int x = k; x < a; x++) {
							if (flower[x] != maxHeight[x]) {
								k = x - 1;
								minimum += 1;
								break;
							}
						}
					}
				} else if (flower[k] < maxHeight[k]) {
					flower[k] += 1;
					if (k + 1 == a)
						minimum += 1;
				}
				k++;
			}
		}

		System.out.print(minimum);
	}
}
