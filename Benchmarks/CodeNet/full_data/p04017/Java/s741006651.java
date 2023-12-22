import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] num = new int[n];
		int[] dp = new int[n];
		int st = 0, dr = 0;
		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
		}
		int l = s.nextInt();
		int q = s.nextInt();
		
		
		while (dr != dp.length) {
			if (num[dr] - num[st] <= l) {
				dp[st] = dr;
				dr++;
			} else {
				if (dp[st] == 0 && st != 0)
					dp[st] = dp[st - 1];
				st++;
			}
			
			
		}
		HashMap<Integer, Integer> h = new HashMap<>();
		HashMap<Integer, Integer> h1 = new HashMap<>();
		HashMap<Integer,Integer>[] hashMaps = new HashMap[1000];
		
		while (st < dp.length) {
			dp[st] = dp.length - 1;
			st++;
		}
		int par = 0;
		int index = 1;
		int[] rau = new int[dp.length];
		int[] freq = new int[dp.length];
		rau[rau.length - 1] = 1;
		int apar;
		for (int i = 0; i < dp.length; i++) {
			if (freq[i] == 0) {hashMaps[index]=new HashMap<>();
				par = i;
				apar = 1;
				while (par < dp.length - 1 || par == dp.length - 1 && !hashMaps[index].containsKey(par)) {
						if(rau[par]==0)rau[par]=index;
						freq[par] = 1;
						hashMaps[index].put(par,apar);
					par = dp[par];
					
					apar++;
				}
				index++;
			}
		}
		
		//System.exit(1);
	/*	
		for (int i : rau) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : freq) {
			System.out.print(i + " ");
		}*/
		for (int i = 0; i < q; i++) {
			int a = s.nextInt() - 1;
			int b = s.nextInt() - 1;
			if (a > b) {
				a = a ^ b;
				b = a ^ b;
				a = a ^ b;
			}
			//System.out.println(f(dp, a - 1, b - 1));
			
				for (int k = b + 1; k < freq.length; k++) {
					if (hashMaps[rau[a]].containsKey(k)) {
						b = k;
						//System.out.println(b);
						
						break;
					}
					
				}
				int res=hashMaps[rau[a]].get(b)-hashMaps[rau[a]].get(a)-1;
				System.out.println(res);
				
			
		}
		
		
	}
	
}
