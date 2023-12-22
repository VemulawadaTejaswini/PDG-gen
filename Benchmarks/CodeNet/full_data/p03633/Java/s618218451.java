import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] t = new long[n];
		long max = 0;
		
		for(int i=0; i<t.length; i++) {
			t[i] = sc.nextLong();
			max = Math.max(max, t[i]);
		}
		sc.close();
		
		boolean b = true;
		long ans = max;
		
		while(b) {
			boolean isd = true;
			for(int i=0; i<t.length; i++) {
				if(ans%t[i] != 0) {
					isd = false;
				}
			}
			
			if(isd) {
				b=false;
			}else {
				ans += max;
			}
		}
		
		System.out.println(ans);

	}

}
