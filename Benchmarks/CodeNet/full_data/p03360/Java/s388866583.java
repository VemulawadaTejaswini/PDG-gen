import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int k = sc.nextInt();
			int max = Math.max(a, Math.max(b, c));
			int sum = max;
			for(int i = 0; i < k; i++){
				sum *= 2;
			}
			System.out.println(a + b + c + sum - max);
			
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
