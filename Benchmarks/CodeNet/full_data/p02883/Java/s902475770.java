import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long max = 0;
		int AiMaxIndex = 0;
		ArrayList<Integer> Ai = new ArrayList<Integer>();
		ArrayList<Integer> Fi = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			Ai.add(sc.nextInt());			
		}
		for(int i = 0; i < n; i++) {
			Fi.add(sc.nextInt());
		}
		Collections.sort(Fi);
		Collections.sort(Ai);
		for(int j = 0; j < k; j++) {
			for(int i = 0; i < n; i++) {			
				long temp = Fi.get((n-1) - i) * Ai.get(i);
				if(temp > max) {
					max = temp;
					AiMaxIndex = i;
				}
			}
			Ai.set(AiMaxIndex, (Ai.get(AiMaxIndex) - 1));
			max = 0;
		}
		
		for(int i = 0; i < n; i++) {			
			long temp = Fi.get((n-1) - i) * Ai.get(i);
			if(temp > max) {
				max = temp;
			}
		}
		
		System.out.println(max);

		sc.close();

	}

}
