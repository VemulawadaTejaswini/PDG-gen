import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			long a = sc.nextLong();
			long b = sc.nextLong();
			
			long gcd = gcd2(a, b);

			Map<Long, Integer> factors = new HashMap<>();

			// iterate 2 to GCD
			List<Long> numberList = new ArrayList<>();
			for(long i = 2 ; i <= gcd /2 ; i++ ) {
				numberList.add(i);
			}
			
			while(numberList.size() > 0 ) {
				long p = numberList.remove(0);
				
				if ( gcd % p == 0 ) {
//					System.out.println("## p = " + p);
					factors.put(p, 1);
					//remove from numberList
					
					long val = p;
					while ( val <= gcd / 2) {
//						System.out.println(val);
						numberList.remove(val);
						val += p;
					}
				}
			}

			System.out.println(factors.size() + 1);
		}
	}
	
	public static long gcd2(long a, long b) {
		long vala = a, valb = b;
		while ( vala != valb ) {
			if ( vala > valb) {
				vala = vala - valb;
			}
			else {
				valb = valb - vala;
			}
		}
		return vala;
	}

}