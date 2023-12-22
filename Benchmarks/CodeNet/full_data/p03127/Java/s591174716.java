import java.util.*;

public class Main{
	
	// a < b
	public static int gcv(int a, int b){
		if(b % a == 0){
			return a;
		}
		
		int mod = b % a;
		
		return gcv(mod, a);
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> monsters = new LinkedList<>();
		
		// input
		int num = scan.nextInt();
		for(int i = 0; i < num; i++){
			monsters.add(scan.nextInt());
		}
		
		// check
		Collections.sort(monsters);
		while(monsters.size() > 1){
			monsters.push(gcv( monsters.pop(), monsters.pop()));
		}
		
		// answer
		System.out.println(monsters.pop());
	}
}