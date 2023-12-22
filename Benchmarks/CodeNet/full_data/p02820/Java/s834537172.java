package atCoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		exec();
	}
	
	private static void exec() {
		
		
		try(Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			
			int K = sc.nextInt();
			
			int R = sc.nextInt();
			
			int S = sc.nextInt();
			
			int P = sc.nextInt();
			
			String T = sc.next();
			
			Map<String, Integer> score = new HashMap<>();
			
			score.put("r", P);
			score.put("s", R);
			score.put("p", S);
			
			String[] past = new String[K];
			
			Long ans = 0L;
			for(int i=0; i<N; i++) {
				String ene = String.valueOf(T.charAt(i));
				
				if(ene.equals(past[i%K])) {
					past[i%K] = null;
				} else {
					ans += score.get(ene);
					past[i%K] = ene;
				}
			}
			
			System.out.println(ans);
		}
		
	}
}
