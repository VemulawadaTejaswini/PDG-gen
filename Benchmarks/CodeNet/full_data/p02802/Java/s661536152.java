import java.util.Scanner;

class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int acCnt = 0;
		int ngCnt = 0;

		int[] ng = new int[n + 1];
		boolean[] ok = new boolean[n + 1];

		for(int i = 0; i < m; i++) {
			int p = scan.nextInt();
			String s = scan.next();
			if(!ok[p] && s.equals("AC")) {
				acCnt++;
				ok[p] = true;
			}else if(!ok[p] && s.equals("WA")) {
				ngCnt++;
			}
		}
		System.out.println(acCnt + " " + ngCnt);
	}
}
