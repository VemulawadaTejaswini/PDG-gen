import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long m= sc.nextLong();
		long count=0;
		long price=0;
		Map<Long,Long> map = new HashMap<>();
		for(int i=0;i<n;i++) {
			map.put(sc.nextLong(),sc.nextLong());
		}
		Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);
		for( long nkey: map.keySet()) {
			long tempCount=map.get(nkey);
			for(int i=1;i<=tempCount;i++) {
				price+=nkey;
				count+=1;
				if(count>=m) {System.out.println(price); return;}
			}
			
			
		}
    }

}
