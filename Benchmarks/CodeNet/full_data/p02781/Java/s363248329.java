import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int K = sc.nextInt();
		
		int L = N.length();
		int[] d = new int[L];
		for(int i=0; i<L; i++)
			d[i] = N.charAt(i)-'0';
		
		long ans = 0;
		
		int i2 = -1;
		for(int i=1; i<L; i++) {
			if(d[i]!=0) {
				i2 = i;
				break;
			}
		}
		int i3 = -1;
		if(i2>0) {
			for(int i=i2+1; i<L; i++) {
				if(d[i]!=0) {
					i3 = i;
					break;
				}
			}
		}
		
		if(K==1) {
			// 12345
			// x0000
			ans += d[0];
			// .x000
			ans += 9*(L-1);
			// 20345
			// 20300
		} else if(K==2) {
			if(i2 > 0) {
				ans += d[i2];
				ans += 9*(L-i2-1);
			}
			if(d[0]>1 && L>=2) {
				ans += (d[0]-1) * 9 * (L-1);
			}
			if(L>2) {
				ans += 9*9*(L-1)*(L-2)/2;
			}
		} else if(K==3) {
			if(i3 > 0) {
				ans += d[i3];
				ans += 9*(L-i3-1);
				ans += (d[i2]-1) * 9*(L-i2-1);
				ans += 9 * 9*(L-i2-1)*(L-i2-2)/2;
			}
			if(d[0]>1 && L>=3) {
				ans += (d[0]-1) * 9 * 9*(L-1)*(L-2)/2;
			}
			if(L>3) {
				ans += 9*9*9*(L-1)*(L-2)*(L-3)/6;
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}

