import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long k = sc.nextLong();
			
//			double min = Double.MAX_VALUE;
			ArrayList<Long> list = new ArrayList<>();
//			for(int i = 1001; i >= 1; i--){
//				long sum = 0;
//				int now = i;
//				while(now > 0){
//					sum += now % 10;
//					now /= 10;
//				}
//				double res = (double)i / sum;
//				debug(res, sum, i);
//				if(res <= min){
//					min = res;
//					list.add(i);
//				}
//			}
//			debug(list);
			
			long now = 0;
			long inc = 1;
			while(true){
				if(now > 1000000000000000000L) break;
				for(int i = 0; i < 9; i++){
					if(Long.MAX_VALUE - inc <= now ){
						break;
					}
					now += inc;
					list.add(now);
				}
				inc *= 10;
				
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < k; i++){
				sb.append(list.get(i)+"\n");
			}
			System.out.print(sb.toString());
//			debug(list.get(list.size()-1), list.size());
		}
	}
	
	private long calc(long n, long m, long l){
		long sum = 1;
		for(long i = n; i > m; i--){
			sum *= i;
		}
		for(long i = 2; i <= l; i++){
			sum /= i;
		}
		return sum;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
