

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			long mod = 998244353;
			int N = scan.nextInt();
			long []D = new long [N];
			Map<Long,Long>map = new TreeMap<Long,Long>();

			for(int i = 0;i<N;i++) {
				D[i] = scan.nextLong();
				if(i!=0&&D[i]==0) {
					System.out.println(0);
					System.exit(0);
				}
				if(map.containsKey(D[i]))map.put(D[i], map.get(D[i])+1);
				else map.put(D[i], 1l);
			}


			if(D[0]!=0) {
				System.out.println(0);
				return;
			}

			long goukei = 1;
			long mae = 0;
			for(Long key:map.keySet()) {
				if(key==0) {continue;
				}
				if(key-mae!=1) {
					System.out.println(0);
					System.exit(0);
				}else {
					mae = key;
				}
				
				goukei = (goukei*mod_pow(key,map.get(key),mod))%mod;
				//System.out.println(goukei);
			}

			System.out.println(goukei);



		}


	}

	private static long mod_pow(long x, long n ,long mod) {//Xのn乗を二分累乗法(繰り返し２乗法)で計算modもあり大きくしない
		long res = 1;
		    while(n > 0) {
		    	res = (res*x)%mod;
		        n--;
		    }
		    return res;
	}



}
