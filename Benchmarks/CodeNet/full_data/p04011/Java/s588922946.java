import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			long sum = (long)(Math.min(k, n) * x) + (long)(y * (Math.max(n - k, 0)));
			System.out.println(sum);
		}

	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
