import java.util.*;

public class Main {
	double EPS = 10.e-08;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			long sum = 0;
			if(n < 10) {
				System.out.println(n);
				continue;
			}
			sum += 9 - 1 + 1;
			if(n < 100){
				System.out.println(sum);
				continue;
			}
			
			if(n < 1000) {
				System.out.println(sum + (n - 100 + 1));
				continue;
			}
			sum += 999 - 100 + 1;
			if(n < 10000) {
				System.out.println(sum);
				continue;
			}
			
			if(n < 100000) {
				System.out.println(sum + (n - 1000 + 1));
			}
			else {
				System.out.println(sum + (n - 1000 + 1) - 1);
			}
			
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
