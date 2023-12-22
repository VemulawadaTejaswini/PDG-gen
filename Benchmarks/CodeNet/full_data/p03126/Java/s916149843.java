import java.math.BigInteger;
import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [] acc = new int[m];
			for(int i = 0; i < n; i++){
				int count = sc.nextInt();
				for(int j = 0; j < count; j++){
					acc[sc.nextInt()-1]++;
				}
				
			}
			
			int ans = 0;
			for(int i = 0; i < m; i++){
				if(acc[i] == n)ans++;
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
