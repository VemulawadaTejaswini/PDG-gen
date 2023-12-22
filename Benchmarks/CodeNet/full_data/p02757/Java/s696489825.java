import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		String str = sc.next();
		sc.close();
		
		
		long ans = 0;
		if(p == 2 || p == 5) {
			for(int i = str.length() - 1; i >= 0; i--) {
				int charVal = str.charAt(i) - '0';
				if(charVal % p == 0) {
					ans += n - (n - 1 - i);
				}
			}
		}else {
			
			long cumlation = 0;
			long tenmod = 1;
			HashMap<Long, Long> cumMap = new HashMap<>();
			
			long thisDigitMod = (str.charAt(str.length() - 1) - '0') % p;
			cumlation += thisDigitMod;
			cumMap.compute(thisDigitMod, (k,v) -> (v== null)? 1 : v + 1);
			
			for(int i = 1; i < n; i++) {
				long thisDigitNum = str.charAt(str.length() - 1 - i) - '0';
				tenmod = (tenmod * 10) % p;
				cumlation = (cumlation + thisDigitNum * tenmod) % p;
				cumMap.compute(cumlation, (k,v) -> (v== null)? 1 : v + 1);
			}
			
			for (Map.Entry<Long, Long> mapEntry : cumMap.entrySet()) {
				long value = mapEntry.getValue();
				if(mapEntry.getKey() == 0) {
					ans += value;
				}
				ans += value*(value - 1) / 2;
			}
		}	
		
		System.out.println(ans);
	}
}
