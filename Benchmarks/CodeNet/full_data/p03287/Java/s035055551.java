

import java.util.*;
public class Main{
	public static void main(String[] args){		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] c = new int[a];
		for(int i=0;i<a;i++){
			c[i] = sc.nextInt();
		}
		sc.close();
		
//		long result = 0;
//		for(int i=0;i<a;i=i+1){
//			long num = 0;
//			for(int j=i;j<a;j=j+1){
//				num += c[j];
//				if(num%b == 0){
//					result = result+1;
//				}
//			}
//		}
//		System.out.println(result);
		
		Map<Long, Long> cnt = new HashMap<Long, Long>();
		{
			long sum = 0;
			for (int i = 0; i < a; i++) {
				sum += c[i];
				sum %= b;
				if (!cnt.containsKey(sum)) {
					cnt.put(sum, 1L);
				} else {
					cnt.put(sum, cnt.get(sum) + 1);
				}
			}
		}
		
		{
			long ans= 0;
			long sum = 0;
			for (int i = 0; i < a; i++) {
				if (cnt.containsKey(sum)) {
					ans += cnt.get(sum);
				}
				sum += c[i];
				sum %=b;
				cnt.put(sum, cnt.get(sum) - 1);
			}
			System.out.println(ans);
		}
		
		
	}
}
