import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[m];
		String[] s = new String[m];
		int[] ans = new int[n];
		int[] wrn = new int[n];
		int count =0;
		int wrongcount = 0;

		for(int i = 0;i < m;i++) {
			p[i] = sc.nextInt();
			s[i] = sc.next();
		}

		for(int i = 0;i < m;i++) {
			if(s[i].equals("AC")) {
				if(ans[p[i]-1] == 1) {

				}else {
				ans[p[i]-1] = 1;
				count++;
				}
			}else {
				if(wrn[p[i]-1] == 1) {

				}else {
				wrn[p[i]-1] = 1;
				wrongcount++;
				}
			}
		}

		System.out.println(count + " " + wrongcount);
	}

}