import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			int [] calc = new int[n];
			long sum = 0;
			for(int i = 0; i < n; i++){
				calc[i] = data[i] - i - 1;
				sum += calc[i];
			}
			long res1 = sum / n;
			long res2 = sum / n + 1;
			long res3 = sum / n - 1;
			int ans1 = 0;
			for(int i = 0; i < n; i++){
				ans1 += Math.abs(calc[i] - res1);
			}
			int ans2 = 0;
			for(int i = 0; i < n; i++){
				ans2 += Math.abs(calc[i] - res2);
			}
			int ans3 = 0;
			for(int i = 0; i < n; i++){
				ans3 += Math.abs(calc[i] - res3);
			}
			System.out.println(Math.min(ans1, Math.min(ans2, ans3)));
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
