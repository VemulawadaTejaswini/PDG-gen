import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [] data = new int[n+1];
			for(int i = 0; i < n; i++){
				int num = sc.nextInt();
				data[num] = i;
			}
			
			int max = 1;
			
			int left = 1, right = 2;
			int ind = data[1];
			int count = 1;
			while(true){
				if(right > n) break;
				
				int next = data[right];
				if(ind <= next){
					count++;
					right++;
					ind = next;
					max = Math.max(max, count);
				}
				else{
					max = Math.max(max, count);
					count = 0;
					ind = next;
					left = right;
				}
			}
			
			System.out.println(n - max);
			
			
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
