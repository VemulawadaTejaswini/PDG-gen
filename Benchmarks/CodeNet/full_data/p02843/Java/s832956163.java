

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int X = sc.nextInt();
		int cnt = X / 100;

		int res = 0;
		boolean t = false;
		for (int i = 0; i < cnt; i++) {
			res += 105;
			for (int j = 0; j < cnt; j++) {
				res += 104;
				for (int k = 0; k < cnt; k++) {
					res += 103;
					for (int l = 0; l < cnt; l++) {
						res += 102;
						for (int m = 0; m < cnt; m++) {
							res += 101;
							if (res % 100 == 0) {
								t = true;
								break;
							}
						}
						if (t) {
							break;
						}
					}
					if (t) {
						break;
					}
				}
				if (t) {
					break;
				}
			}
			if (t) {
				break;
			}
		}

		if (!t) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}
	}
}