import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer,Boolean> ac = new LinkedHashMap<>();
		Map<Integer,Long> wa = new LinkedHashMap<>();
		for(int i = 1; i <= n; i++) {
			ac.put(i,true);
			wa.put(i,0L);
		}
		for(int i = 1; i <= m; i++) {
			int sub = sc.nextInt();
			String result = sc.next();
			if(result.equals("AC")) {
				ac.put(sub,false);
			}
			else {
				if(ac.get(sub)) {
					long temp = wa.get(sub)+1;
					wa.put(sub, temp);
				}
			}
		}
		int ac_result = 0;
		long wa_result = 0;
		for(int i = 1; i <= n; i++) {
			if(!ac.get(i)) {
				ac_result++;
			}
			wa_result += wa.get(i);
		}
		System.out.print(ac_result + " ");
		System.out.println(wa_result);
	}
}