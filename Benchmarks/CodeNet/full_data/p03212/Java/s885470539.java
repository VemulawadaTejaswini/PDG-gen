import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int sft[] = createSft();
		int cnt = 0;
		for(int i = 0; i < 30000; i++) {
			if(sft[i] <= n) cnt++;
			else break;
		}
		System.out.println(cnt);
	}
	int[] createSft() {
		int num[] = new int[30000];
		Arrays.fill(num, 1000000000);
		int idx = 0;
		for(int i = 3; i < 10; i++) {
			for(int j = 0; j < Math.pow(3, i); j++) {
				String s = CHSft(j, i);
				if(s.indexOf('3') >= 0 && s.indexOf('5') >= 0 && s.indexOf('7') >= 0) {
					num[idx] = Integer.parseInt(s);
					idx++;
				}
			}
		}
		return num;
	}
	String CHSft(int n, int d) {
		String s1 = "000000000" + Integer.toString(n, 3);
		String s2 = s1.substring(s1.length() - d);
		String s3 = s2.replace('2', '7');
		String s4 = s3.replace('1', '5');
		String s5 = s4.replace('0', '3');
		return s5;
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
