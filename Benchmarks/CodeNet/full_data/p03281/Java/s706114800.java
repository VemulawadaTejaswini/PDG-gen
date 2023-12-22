import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
       long num = 0;
       for(long i = 1 ; i <= n ; i++) {
    	   if(i % 2 == 0)
    		   continue;
    	   if(yakusuKosu(i) == 8) {
    		   num++;
    	   }


       }
       System.out.println(num);

    }
    public static long yakusuKosu(long m){
      long n = m;
		long num = 1;
		HashMap<Long, Long> map = new HashMap<>();
			for(long i = 2 ; i <= Math.sqrt(n) ; i++) {
			if(n % i != 0)
				continue;
			n /= i;
			map.put(i, map.getOrDefault(i,  0L) + 1L);
			if(n == 1)
				break;
          i--;
		}
		if(n != 1)
			map.put(n, map.getOrDefault(n,  0L) + 1L);
		for(long t : map.keySet()) {
			num *= map.get(t) + 1;

		}
		return num;

	}
    public static long pow(long ml, long a, long b){
        if(b == 1)
          return ml;
          ml *= a;
          b--;
    		return b == 0 ? ml : pow(ml , a ,b);
    	}
}



