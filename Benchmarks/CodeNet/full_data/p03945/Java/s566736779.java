import java.util.*;

public class Main {
	private void doit(){
		
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			char []  c = sc.next().toCharArray();
			int count = 0;
			char prev = c[0];
			for(int i = 1; i < c.length; i++){
				if(prev != c[i]){
					count++;
					prev = c[i];
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
