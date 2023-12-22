import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] l = new int[q];
		int[] r = new int[q];
		int i;
		for(i=0; i<q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		int idx;
		int cnt;
		for(i=0; i<q; i++) {
			idx=l[i]-1;
			cnt=0;
			while(idx<r[i]-1) {
				idx = s.indexOf("AC", idx);
				if(idx==-1) break;
				if(idx < r[i]-1)cnt++;
				idx++;
			}
			System.out.println(cnt);
		}
		sc.close();
		sc = null;
	}
}