import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			
			System.out.println((n + m) * l / 2);
			
			
		}

	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
