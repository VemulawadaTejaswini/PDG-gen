import java.util.Scanner;
import java.util.TreeMap;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		TreeMap<Integer, Integer> probs = new TreeMap<Integer, Integer>();
		for(int i = 0; i < N; i++) {
			int D = sc.nextInt();
			if(probs.containsKey(D)) probs.put(D, probs.get(D) + 1);
			else probs.put(D, 1);
		}
		boolean check = true;
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			int T = sc.nextInt();
			if(!probs.containsKey(T)) {
				check = false;
				continue;
			}else {
				probs.put(T, probs.get(T) - 1);
				if(probs.get(T) == 0) probs.remove(T);
			}
		}
		System.out.println(check ?  "YES" : "NO");
	}
}