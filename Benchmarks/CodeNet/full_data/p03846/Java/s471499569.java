import  java.util.HashMap;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		int n = sc.nextInt();
		int p = 1000000007;
		
		for(int i= 0 ; i < n ;i++) {
			int a = sc.nextInt();
			if(!hm.containsKey(a)) {
				hm.put(a, 1);
			}
			else {
				hm.put(a, hm.get(a)+ 1);
			}
		}
		int tmp = -1;
		long ans = 1;
		
		for(int num : hm.keySet()) {
			if(num != 0 && hm.get(num)== 2) {
				ans = (ans * 2) % p;
			}
			else if(n % 2 == 1 && hm.get(0) == 1) {
				continue;
			}
			else {
				ans = 0;
				break;
			}
		}
		System.out.println(ans);
		

	}

}
