
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static int dame_mons(LinkedList<Integer> mons) {
		while(mons.size() > 1) {
			int max = mons.get(0);
			int min = mons.get(0);
			for(int i = 1; i < mons.size();i++) {
				max = Math.max(max, mons.get(i));
				min = Math.min(min, mons.get(i));
			}
			int max_index = mons.indexOf(max);
			mons.set(max_index, max % min);
			int zero_index = mons.indexOf(0);
			mons.remove(zero_index);
				
		}
		return mons.get(0); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int result;
		LinkedList<Integer> mons = new LinkedList<Integer>();
		for(int i = 0; i < N; i++) {
			mons.add(sc.nextInt());
		}
		
		result = dame_mons(mons);
		System.out.println(result);
		
		sc.close();
	}

}
