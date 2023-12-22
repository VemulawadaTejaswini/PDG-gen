import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class SectionL implements Comparable<SectionL> {
		int l;
		int r;
		int i;
		public SectionL(int l, int r, int i) {
			this.l = l;
			this.r = r;
			this.i = i;
		}
		public int compareTo(SectionL o) {
			return o.l - this.l;
		}
	}
	static class SectionR implements Comparable<SectionR> {
		int l;
		int r;
		int i;
		public SectionR(int l, int r, int i) {
			this.l = l;
			this.r = r;
			this.i = i;
		}
		public int compareTo(SectionR o) {
			return this.r - o.r;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		SectionL[] d = new SectionL[n];
		SectionR[] e = new SectionR[n];
		for (int i = 0; i < n; i++) {
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			d[i] = new SectionL(l, r, i);
			e[i] = new SectionR(l, r, i);
		}
		boolean[] f = new boolean[n];
		Arrays.fill(f, true);
		Arrays.sort(d);
		Arrays.sort(e);
		int indexL = 0;
		int indexR = 0;
		long k = 0;
		boolean g = false;
		int tem = 0;
		long ans = 0;
		int b = 0;
		while (true) {
			while (indexL < n && !f[d[indexL].i])
				indexL++;
			if (g && indexL != n) {
				f[d[indexL].i] = false;
				k += Math.abs(d[indexL].l - e[indexR].r);
				tem = d[indexL].l;
			}
			else if (indexL != n){
				f[d[indexL].i] = false;
				g = true;
				k = Math.abs(d[indexL].l);
			}
			while (indexR < n && !f[e[indexR].i])
				indexR++;
			if (indexR != n) {
				f[e[indexR].i] = false;
				k += Math.abs(e[indexR].r - d[indexL].l);
				tem = e[indexR].r;
			}
			if (indexL == n || indexR == n)
				break;
		}
		ans = k + Math.abs(tem);
		System.out.println(ans);
	}
}