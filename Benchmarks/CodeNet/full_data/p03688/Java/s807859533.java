import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int catNum = scanner.nextInt();
		int[] cat = new int[catNum];
		int[] kind = new int[catNum];
		for (int i = 0; i < catNum; i++) {
			kind[i] = scanner.nextInt();
		}
		int n = kind[0];
		int dec = (int) Math.pow(catNum,n);
		for (int i = 0; i < dec; i++) {
			String base = Integer.toString(i, n);
			
			for (int j = 1; j < catNum; j++) {
				if (base.length() > j) {
					int num = base.charAt(j);
					if (num != 0) {
						num -= 48;
					}
					cat[j] = num;
				} else {
					cat[j] = 0;
				}
			}
			for (int j = 0; j < kind[0] + 1; j++) {
				cat[0] = j;
				if (check(cat, kind)) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}
		scanner.close();
		System.out.println("No");
	}
	
	static boolean check(int[] cat, int[] kind) {	
		for (int i = 0; i < kind.length; i++) {
			int[] k = new int[kind[0]+ 1];
			for (int j = 0; j < cat.length; j++) {
				if (i == j) {
					continue;
				}
				k[cat[j]]++;
			}
			int notZero =0;
			for (int j = 0; j < k.length; j++) {
				if (k[j] != 0) {
					notZero++;
				}
			}
			if (notZero != kind[i]) {
				return false;
			}
		}
		return true;
	}
	
}
