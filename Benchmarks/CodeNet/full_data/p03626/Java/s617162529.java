import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		char t[][] = new char[2][n];
		t[0] = sc.next().toCharArray();
		t[1] = sc.next().toCharArray();
		long MOD = 1000000007;
		long cnt = 0;
		int i=0;
		if(t[0][0]==t[1][0]) {
			cnt = 3;
			i=1;
		}else {
			cnt = 6;
			i=2;
		}
		while(i<n) {
			if(t[0][i]==t[1][i]) {
				if(t[0][i-1]==t[1][i-1]) {
					cnt = (cnt * 2) % MOD;
				}else {
					cnt = (cnt * 1) % MOD;
				}
				i++;
			}else {
				if(t[0][i-1]==t[1][i-1]) {
					cnt = (cnt * 2) % MOD;
				}else {
					cnt = (cnt * 3) % MOD;
				}
				i += 2;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
