import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			char [] s = sc.next().toCharArray();
			
			int ans = Integer.MAX_VALUE;
			for(int i = 0; i < 26; i++){
				int ind = 0;
				int count = 0;
				char now = (char) ('a' + i);
				for(int j = 0; j < s.length;j++){
					if(s[j] == now){
						ind = Math.max(count, ind);
						count = 0;
					}
					else{
						count++;
					}
				}
				ind = Math.max(ind, count);
//				debug(ind, (char)now);
				
				ans = Math.min(ans, ind);
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
