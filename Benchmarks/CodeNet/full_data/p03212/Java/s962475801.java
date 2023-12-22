import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int sft[] = createSft(n);
		int cnt = 0;
		for(int i = 0; i < 30000; i++) {
			if(sft[i] <= n) cnt++;
			else break;
		}
		System.out.println(cnt);
	}
	
	int[] createSft(int n) {
		int num[] = new int[30000];
		Arrays.fill(num, 1000000000);
		int idx = 0;
		for(int i = 3; i < 10; i++) {
			for(int j = 0; j < Math.pow(3, i); j++) {
				String s = "000000000" + Integer.toString(j, 3);
				String sS = s.replace('2', '7');
				String sF = sS.replace('1', '5');
				String sT = sF.replace('0', '3');
				String ans = sT.substring(s.length() - i);
				if(ans.indexOf('3') >= 0 && ans.indexOf('5') >= 0 && ans.indexOf('7') >= 0) {
					num[idx] = Integer.parseInt(ans);
					idx++;
				}
			}
		}
		return num;
	}
	public static void main(String[] args) {
		new Main().doIt();
	}

}
