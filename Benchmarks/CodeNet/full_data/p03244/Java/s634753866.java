import java.util.*;
public class Main {

	public static int mode(int[]a) {
		int count = 1;
		int maxcount = 1;
		int mode = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] == a[i-1]) {
				count += 1;
				if(i == a.length - 1)
					if(count > maxcount)
						mode = a[i];
			}
			else {
				if(count >= maxcount)
					mode = a[i-1];
				count = 1;
			}
		}
		return mode;
	}
	
	public static int modenum(int[]a) {
		int count = 1;
		int maxcount = 1;
		for(int i = 1; i < a.length; i++) {
			if(a[i] == a[i-1]) {
				count += 1;
				if(i == a.length - 1)
					maxcount = Math.max(count, maxcount);
			}
			else {
				maxcount = Math.max(count, maxcount);
				count = 1;
			}
		}
		return maxcount;
	}
	public static int modenum2(int[]a) {
		int count = 1;
		int maxcount = 0;
		for(int i = 1; i < a.length; i++) {
			if(a[i] == mode(a)) continue;
			if(a[i] == a[i-1]) {
				count += 1;
				if(i == a.length - 1)
					maxcount = Math.max(count, maxcount);
			}
			else {
				maxcount = Math.max(count, maxcount);
				count = 1;
			}
		}
		return maxcount;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] vodd = new int[n/2];
		int[] veven = new int[n/2];
		for(int i = 0; i < n/2; i++) {
			vodd[i] = sc.nextInt();
			veven[i] = sc.nextInt();
		}
		Arrays.sort(vodd);
		Arrays.sort(veven);
		if(mode(vodd) != mode(veven))
			System.out.println(n - modenum(vodd) - modenum(veven));
		else
			System.out.println(Math.min(n - modenum(vodd) - modenum2(veven),n - modenum2(vodd) - modenum(veven)));

	}

}