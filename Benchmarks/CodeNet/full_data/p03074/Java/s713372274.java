import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String[] Num = s.split("");
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(Num[i]);
		}
		int ans = 0;
		int change = 0;
		int j = 1;
		while(j < n) {
			if(num[j-1] + num[j] == 1) {
				if(num[j-1] == num[j+1]) {
					change ++;
					j += 2;
				}else {
					change ++;
					j += 1;
				}
			}else {
				j ++;
			}
		}
		if(change <= k && num[0] == 1) {
			ans = n;
		}else if(change < k && num[0] == 0) {
			ans = n;
			//System.out.println("jack");
		}else if(num[0] == 1){
			int[] tng = new int[change*2 + 1];
			int ind = 0;
			tng[0] ++;
			for(int i = 1; i < n; i++) {
				if(num[i-1] + num[i] != 1) {
					tng[ind] ++;
				}else {
					ind ++;
					tng[ind] ++;
				}
			}
			int L = 0;
		
			while(L + 2*k < tng.length ) {
				int tmp = 0;
				for(int i = L; i <= L + 2*k; i++) {
					tmp += tng[i];
				}
				ans = Math.max(ans, tmp);
				L += 2;
			}
		}else {
			int[] tng = new int[change*2 + 1];
			int ind = 0;
			tng[0] ++;
			for(int i = 1; i < n; i++) {
				if(num[i-1] + num[i] != 1) {
					tng[ind] ++;
				}else {
					ind ++;
					tng[ind] ++;
				}
			}
			
			int L = 0;
			for(int i = L; i < L + 2*k; i++) {
				ans += tng[i];
			}
			L++;
		
			while(L + 2*k < tng.length ) {
				int tmp = 0;
				for(int i = L; i <= L + 2*k; i++) {
					tmp += tng[i];
				}
				ans = Math.max(ans, tmp);
				L += 2;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}
	
}

