import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		System.out.println(Long.min(calc(h, w), calc(w, h)));
	}
	static long calc(long a, long b){
		long x = (a/3)*b;
		long y = ((a - a/3)/2)*b;
		long z = (a - (a/3) - (a - a/3)/2)*b;
		ArrayList<Long> vals = new ArrayList<>();
		vals.add(x); vals.add(y); vals.add(z);
		Collections.sort(vals);
		long min = vals.get(2) - vals.get(0);
		for(long i = 1; i < a; i++){
			x = i*b;
			y = (a-i)*(b/2);
			z = (a-i)*(b-b/2);
			vals = new ArrayList<>();
			vals.add(x); vals.add(y); vals.add(z);
			Collections.sort(vals);
			min = Long.min(min, vals.get(2) - vals.get(0));
		}
		return min;
	}
}
