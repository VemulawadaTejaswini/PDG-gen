import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		TreeMap <Integer, Integer> store = new TreeMap <Integer, Integer>();
		int Ai=0;
		
		for (int i = 0; i<N; i++){
			Ai = sc.nextInt();
 
			if (store.containsKey(Ai)) 
				store.put(Ai, store.get(Ai) + 1);
			else 
				store.put(Ai, 1);
		}
		int a=0;
		while (store.isEmpty()!=true){
			a = store.lastKey();
			int l = store.get(store.lastKey());
			
			if (l>1){
				store.pollLastEntry();
				store.put(a, l-2);
				break;
			}
			else {
				store.pollLastEntry();
				a=0;
			}
		}
		int b=0;
		while (store.isEmpty()!=true){
			b = store.lastKey();
			int l = store.get(store.lastKey());
			
			if (l>1){
				store.pollLastEntry();
				break;
			}
			else {
				store.pollLastEntry();
				b=0;
			}
		}
		System.out.println(a*b);
		
		sc.close();
	}

}
