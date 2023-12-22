import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		Map<Long,Long> map = new LinkedHashMap<>();
		
		for(int i = 0; i < n; i++) {
			long a = stdIn.nextLong();
			if (a == 0)continue;
			map.put((long)(i+1),a);
		
		}
		
		long cnt = 0;
		long [] bf = new long[n];
		int index = 0;
		
		for(long x: map.keySet()) {
			bf[index++] = x;
			
			if(map.get(x) % 2 == 0) {
				cnt += map.get(x)/2;
			}else {
				cnt += map.get(x)/2;
				
				if(bf[index-1] % 2 != 0) {
					if(Math.abs(bf[index] - bf[index-1]) <= 1) {
						cnt++;
					}
				}

				
			}
		
			
		}
		System.out.println(cnt);
		
		
		
		
		
		
	}

}
