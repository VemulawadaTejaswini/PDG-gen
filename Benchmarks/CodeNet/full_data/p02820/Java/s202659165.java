import java.util.Scanner;

class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		int r = scanner.nextInt(); // グー
		int s = scanner.nextInt(); // チョキ
		int p = scanner.nextInt(); // パー
		
		String str = scanner.next();
		
		char[] b = new char[n];
		int sum = 0;
		for (int i = 0, c = 1; i < n; i++, c++) {
			char st = str.charAt(i);
			b[i] = st;
			if (c > k) {
				if (st == b[i - k]) {
					st = 0;
				}
			}
			switch (st) {
				case 'r':
					sum += p;
					break;
				case 's':
					sum += r;
					break;
				case 'p':
					sum += s;
					break;
				default:
			}
		}
		System.out.println(sum);
	}
}