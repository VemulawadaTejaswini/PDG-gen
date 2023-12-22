import java.util.HashMap;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap <Integer,Integer>hm = new HashMap<Integer,Integer>();
		
		int n = sc.nextInt();
	
		
		for(int i = 0; i < n  ;i ++) {
			int a= sc.nextInt();
			if(!hm.containsKey(a)) {
				hm.put(a, 1);
			}
			else {
				hm.put(a, hm.get(a) + 1);
			}
		}
		int r = 0;
		int l = 0;
		
		int count = 0;
		
			for(int num : hm.keySet()) {
				int temp = hm.get(num);
				if(temp >= 2 && count % 2 == 0) {
					r = Math.max(r, num);
					temp = temp - 2;
					count++;
				}
				if(temp >= 2 && count % 2 == 1) {
					l = Math.max(l,num);
					count++;
				}
			}
			long ans = r * l;
			
			System.out.println(ans);
	}

}
