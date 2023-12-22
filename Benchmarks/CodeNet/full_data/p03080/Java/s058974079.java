import java.math.BigInteger;
import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			String s = sc.next();
			int b = 0;
			int r = 0;
			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i) == 'R'){
					r++;
				}
				else{
					b++;
				}
			}
			
			if(r > b){
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
	
	private long gcd(long a, long b){
		if(b == 0)  return a;
		else        return gcd(b, a%b);
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
