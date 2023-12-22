import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf(sc.next());
		int v[] = new int[N];
		int v1[] = new int[N / 2];
		int v2[] = new int[N / 2];
		int cnt1 = 0;
		int cnt2 = 0;
		int cntMin1 = 1000;
		int cntMin2 = 1000;
		boolean onajiFlg = true;
		int befNum = 0;
		for (int i = 0; i < N; i++) {
			v[i] = Integer.valueOf(sc.next());
			if(i==0) {
				befNum = v[0];
			}else if(befNum != v[i]) {
				onajiFlg=false;
			}
			if (i % 2 == 0) {
				v1[cnt1] = Integer.valueOf(v[i]);
				cnt1++;
			}else {
				v2[cnt2] = Integer.valueOf(v[i]);
				cnt2++;
			}
		}

		cnt1 = 0;
		cnt2 = 0;
		for (int i = 0; i < N/2; i++) {
			for (int j = 0; j < N/2; j++) {
				if(i==j) continue;
				if(v1[i]!=v1[j]) {
					cnt1++;
				}
				if(v2[i]!=v2[j]) {
					cnt2++;
				}
				cntMin1= Math.min(cnt1, cntMin1);
				cntMin2= Math.min(cnt2, cntMin2);
			}
		}

		sc.close();
		if(onajiFlg) {
			System.out.println(N/2);
		}else {
			System.out.println(cntMin1+cntMin2);
		}
	}

}