import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			int n = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < s.length(); i++){
				if(i % n == 0){
					sb.append(s.charAt(i));
				}
			}
			System.out.println(sb.toString());
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
