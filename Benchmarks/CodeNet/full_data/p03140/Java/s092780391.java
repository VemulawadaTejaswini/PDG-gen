import java.math.BigInteger;
import java.util.*;

public class Main {
	int INF = 1 << 29;
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			String [] data = new String[3];
			for(int i = 0; i < 3; i++){
				data[i] = sc.next();
			}
			int count = 0;
			for(int i = 0; i < n; i++){
				int [] freq = new int[26];
				freq[data[0].charAt(i) - 'a']++;
				freq[data[1].charAt(i) - 'a']++;
				freq[data[2].charAt(i) - 'a']++;
				int res = Math.max(freq[data[0].charAt(i) - 'a'], Math.max(freq[data[1].charAt(i) - 'a'], freq[data[2].charAt(i) - 'a']));
				count += 3 - res;
			}
			System.out.println(count);
			
		}
	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
