
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
			if (rau[i] == 0) {
				par = i;
				apar = 1;
				while (par < dp.length - 1 && rau[par] == 0 || par == dp.length - 1 && freq[par] == 0) {
					rau[par] = index;
					if (freq[par] == 0)
						freq[par] = apar;
					par = dp[par];
					
					apar++;
					if (par == dp.length - 1 && freq[par] != 0) break;
				}
				h.put(index, apar);
				h1.put(index, par);
				index++;
			}
		}
		
		//System.exit(1);
		/*
		for (int i : rau) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : freq) {
			System.out.print(i+" ");
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
			int cur = rau[a];
			int res = 0;
			int dest = rau[b];
			//System.out.println(rau[b]+" "+rau[a]);
			res -= freq[a];
			int last = 0;
			if(cur>=dest) {
				while (cur != dest) {
					res += h.get(cur) - last;
					last = freq[h1.get(cur)];
					cur = rau[h1.get(cur)];
					//System.out.println(last);
					
				}
				//System.out.println(last);
				res += freq[b] - last;
				System.out.println(res);
			}
			else 
			{int ind=b;
				while(rau[ind]!=cur)
				{
					ind++;
				}
				System.out.println(freq[ind]-freq[a]);
			}
		}
		
		
	}
	
	public static int f(int[] dp, int a, int b) {
		
		int cost = 0;
		if (a > b) {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
			
		}
		int current = a;
		while (current < b) {
			current = dp[current];
			cost++;
		}
		return cost;
		
		
	}
}
