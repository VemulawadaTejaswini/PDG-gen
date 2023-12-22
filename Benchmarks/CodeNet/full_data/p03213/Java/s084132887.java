import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		HashMap<Long, Long> map = new HashMap<>();
		for(long n2 = 1 ; n2 <= k ; n2++) {
			long n = n2;
		for(long i = 2 ; i <= Math.sqrt(n) ; i++) {
			if(n % i != 0)
				continue;
			n /= i;
			map.put(i, map.getOrDefault(i,  0L) + 1L);
			if(n == 1)
				break;
          i--;
		}
      if(n != 1) {
        map.put(n, map.getOrDefault(n,  0L) + 1L);
        }
      }
      int num74 = 0;
      int num24 = 0;
      int num15 = 0;
      int num4 = 0;
      int num2 = 0;

      for(long l : map.keySet()) {
    	 long num = map.get(l);
    	 if(num >= 74) {
    		 num74++;
    	 }
    	 else if(num >= 24) {
    		 num24++;
    	 }
    	 else if(num >= 15) {
    		 num15++;
    	 }
    	 else if(num >= 4) {
    		 num4++;
    	 }
    	 else if(num >= 2) {
    		 num2++;
    	 }
  	    }
      int count = 0;
      count += num74; //75
      if(num2 + num4 + num15 + num24 + num74 >= 1)
      count += (num2 + num4 + num15 + num24 + num74 - 1) * (num24 + num74); // 3 * 25
      if(num2 + num4 + num15 + num24 + num74 >= 2 && num4 + num15 + num24 + num74 >= 1)
      count += (num2 + num4 + num15 + num24 + num74 - 2) * (num4 + num15 + num24 + num74) * (num4 + num15 + num24 + num74 - 1) / 2; // 3 * 5 * 5
      if(num4 + num15 + num24 + num74 >= 1)
      count += (num4 + num15 + num24 + num74 - 1) * (num15 + num24 + num74); // 5 * 15
      System.out.println(count);
	}
	public static long pow(long ml, long a, long b){
    if(b == 1)
      return ml;
      ml *= a;
      b--;
		return b == 0 ? ml : pow(ml , a ,b);
	}
}

