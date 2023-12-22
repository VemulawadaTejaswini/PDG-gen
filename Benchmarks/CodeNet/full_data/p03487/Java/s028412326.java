import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		Map <Long,Long> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			long a = stdIn.nextLong();
			
			if(map.containsKey(a)) {
				map.put(a,map.get(a)+1);
			}else {
				map.put(a,(long)1);
			}
			
		}
		
		long cnt = 0;
		
		for(long a: map.keySet()) {
			if(a < map.get(a)) { //2 4 のように多すぎた場合
				cnt += map.get(a) - a;
			}else if(a > map.get(a)) { //4 2 にように少ない場合
				cnt += map.get(a);
			}
			
		}
		System.out.println(cnt);
		
	}

}
