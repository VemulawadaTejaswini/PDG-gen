import java.util.Arrays;
import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int v1[] = new int[n / 2];
		int v2[] = new int[n / 2];
		for(int i = 0; i < n / 2; i++) {
			v1[i] = sc.nextInt();
			v2[i] = sc.nextInt();
		}
		int m1 = 0, m2 = 0;
		int mm1 = 0, mm2 = 0;
		int cnt1[] = new int[100001];
		int cnt2[] = new int[100001];
		Arrays.fill(cnt1, 0);
		Arrays.fill(cnt2, 0);
		for(int i = 0; i < n / 2; i++) {
			cnt1[v1[i]]++;
			if(cnt1[m1] < cnt1[v1[i]]) m1 = v1[i];
			else if(cnt1[mm1] < cnt1[v1[i]] && v1[i] != m1)
				mm1 = v1[i];
			cnt2[v2[i]]++;
			if(cnt2[m2] < cnt2[v2[i]]) m2 = v2[i];
			else if(cnt2[mm2] < cnt2[v2[i]] && v2[i] != m2) 
				mm2 = v2[i];

		}
		if(m1 == m2) {
			if(m1 <= m2)m2 = mm2;
			else m1 = mm2;
		}
		int cnt = n - cnt1[m1] - cnt2[m2];
		//System.out.println(m1 +" "+ m2 + " " +mm1 +" " +mm2);
		System.out.println(cnt);
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
