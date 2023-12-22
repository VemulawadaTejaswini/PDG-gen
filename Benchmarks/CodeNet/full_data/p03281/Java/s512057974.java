import java.math.BigInteger;
import java.util.*;

public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int ans = 0;
			for(int i = 0; i <= n; i++){
				if(i % 2 == 0) continue;
				int count = 0;
				for(int j = 1; j <= n; j++){
					if(i % j == 0) count++;
				}
				if(count == 8){
					ans++;
				}
			}
			System.out.println(ans);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
