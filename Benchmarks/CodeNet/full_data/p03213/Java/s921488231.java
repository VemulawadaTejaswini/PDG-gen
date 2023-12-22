import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		boolean[] prime = createPrime();
		int[] numPF = new int[101];
		Arrays.fill(numPF, 0);
		for(int i = 1; i <= n; i++) {
			int num = i;
			int j = 2;
			while(num > 1) {
				if(num % j == 0) {
					numPF[j]++;
					num /= j;
				}
				else {
					j++;
					while(!prime[j]) j++;
				}
			}
		}
		//System.out.println(Arrays.toString(numPF));
		int[] cntNumPF = new int[100];
		Arrays.fill(cntNumPF, 0);
		for(int i = 1; i <= 100; i++) cntNumPF[numPF[i]]++;
		for(int i = 98; i >= 1; i--) cntNumPF[i] += cntNumPF[i + 1];
		//System.out.println(Arrays.toString(cntNumPF));
		int cnt = 0;
		cnt += cntNumPF[74];//75
		cnt += cntNumPF[24] * (cntNumPF[2] - 1);//25 * 3
		cnt += cntNumPF[14] * (cntNumPF[4] - 1);//15 * 5
		cnt += c(cntNumPF[4], 2) * (cntNumPF[2] - 2);//5 * 5 * 3
		System.out.println(cnt);
	}
	int c(int n, int r) {
		int num = 1;
		for(int i = 1; i <= r; i++) {
			num *= n - r + i;
			num /= i;
		}
		return num;
	}
	boolean[] createPrime() {
		boolean[] b = new boolean[101];
		Arrays.fill(b, true);
		b[0] = false;
		b[1] = false;
		for(int i = 2; i <= 100; i++) {
			if(b[i]) {
				for(int j = i << 1; j <= 100; j += i) {
					b[j] = false;
				}
			}
		}
		return b;
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}
