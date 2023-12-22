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
			
			int count = 0;
			int now = 0;
			int left = 0, right = 0;
			while(true){
				if(right == n && right == left){
					break;
				}
				if(right < left) break;
				if(right == n){
					now = 0;
					right = left + 1;
					left++;
					continue;
				}
				int res = now ^ data[right];
				int res2 = now | data[right];
				if(res == res2){
					now =res;
					count++;
					right++;
				}
				else{
					now = 0;
					right = left + 1;
					left++;
				}
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
