import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		Long n = scan.nextLong();
		String s = scan.next();
		long ans = 0;
		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n -1; j++) {
				for(int k = j + 1; k < n; k++) {
					if((j+1) * 2 == (i+1) + (k+1)) {
						continue;
					}
					String si = s.substring(i, i+1);
					String sj = s.substring(j, j+1);
					String sk = s.substring(k, k+1);
					if(!si.equals(sk) && !sj.equals(sk) && !si.equals(sj)) {
						ans++;
					}
					
				}
			}
		}
		System.out.println(ans);
	}
}