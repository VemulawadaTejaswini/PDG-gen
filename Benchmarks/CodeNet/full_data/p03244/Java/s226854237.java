import java.util.Arrays;
import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		int v;
		int m1 = 0, m2 = 0;
		int mm1 = 0, mm2 = 0;
		int cnt1[] = new int[100001];
		int cnt2[] = new int[100001];
		Arrays.fill(cnt1, 0);
		Arrays.fill(cnt2, 0);
		for(int i = 0; i < n / 2; i++) {
			v = sc.nextInt();
			cnt1[v]++;
			if(cnt1[m1] < cnt1[v]) {
				if(m1 != v)mm1 = m1;
				m1 = v;
			}
			v = sc.nextInt();
			cnt2[v]++;
			if(cnt2[m2] < cnt2[v]) {
				if(m2 != v)mm2 = m2;
				m2 = v;
			}
		}
		//System.out.println(m1 +" "+ m2 + " " +mm1 +" " +mm2);
		int min;
		if(m1 == m2) {
			min = cnt1[m1] + cnt2[mm2];
			if(cnt2[m2] + cnt1[mm1] > min) 
				min = cnt2[m2] + cnt1[mm1];
		}
		else min = cnt1[m1] + cnt2[m2];
		System.out.println(n - min);
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
