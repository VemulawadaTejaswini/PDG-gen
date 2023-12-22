import java.math.BigInteger;
import java.util.*;

public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String n = sc.next();
			long k = sc.nextLong();
			int onecount = 0;
			char c = 0;
			for(int i = 0; i < n.length(); i++){
				if(n.charAt(i) == '1'){
					onecount++;
				}
				else{
					c = n.charAt(i);
					break;
				}
			}
			if(onecount >= k){
				System.out.println(1);
			}
			else{
				System.out.println(c);
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
