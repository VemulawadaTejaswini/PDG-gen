import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		System.out.println(Long.min(calc(h, w), calc(w, h)));
	}
	static long calc(long a, long b){
		if(a % 3 == 0) return 0;
		long min = b;
		for(long i = 1; i < a; i++){
			long x = i*b;
			long y = (a-i)*(b/2);
			long z = (a-i)*(b-b/2);
			ArrayList<Long> vals = new ArrayList<>();
			vals.add(x); vals.add(y); vals.add(z);
			Collections.sort(vals);
			min = Long.min(min, vals.get(2) - vals.get(0));
		}
		return min;
	}
}
