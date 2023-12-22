import java.math.BigInteger;
import java.util.*;

public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			char [] data = sc.next().toCharArray();
			int count = 0;
			int sum = 0;
			for(int i = 0; i < data.length; i ++){
				if(data[i] == 'B'){
					sum += data.length - 1 - i - count;
					count++;
				}
			}
			System.out.println(sum);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
