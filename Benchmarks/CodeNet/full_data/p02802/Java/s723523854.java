import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] p = new int[m];
		String[] s = new String[m];
		for (int i = 0; i < m; i++) {
			p[i] = scan.nextInt();
			s[i] = scan.next();
		}
		scan.close();
		
		int correct = 0;
		int penalty = 0;
		
		for (int i = 0; i < m - 1; i++) {
			boolean judge = false;
			if (p[i] != 0) {
				if (s[i].equals("AC")) {
					correct++;
					judge = true;
				} else if (s[i].equals("WA")) {
					penalty++;
				}
			}
			
			for (int j = i + 1; j < m; j++) {
				if (p[i] == p[j] && p[j] != 0) {
					if (!judge) {
						if (s[j].equals("AC")) {
							correct++;
							judge = true;
						} else if (s[j].equals("WA")) {
							penalty++;
						}
					}
					p[j] = 0;
				}
			}
			p[i] = 0;
		}
		
		System.out.println(correct + " " + penalty);
	}
}