public class Main {
	public static void main(String[] args) throws Exception {
		boolean flg = true;
		Scanner sc = new Scanner(System.in);
		while (flg) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if (m == -1 && f == -1 && r == -1) {
				flg = false;
			} else if (m == -1 || f == -1) {
				System.out.println("F");
			} else {
				if (m + f < 30) {
					System.out.println("F");
				} else if (m + f < 50) {
					if (r >= 50) {
						System.out.println("C");
					} else {
						System.out.println("D");
					}
				} else if (m + f < 65) {
					System.out.println("C");
				} else if (m + f < 80) {
					System.out.println("B");
				} else {
					System.out.println("A");
				}
			}
		}
		sc.close();
	}
}
