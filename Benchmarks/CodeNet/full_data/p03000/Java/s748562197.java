import java.math.BigInteger;
import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int b = sc.nextInt();
			int [] data = new int[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			long sum = 0;
			int count = 1;
			for(int i = 0; i < n; i++){
				sum += data[i];
				if(sum > b){
					break;
				}
				count++;
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
