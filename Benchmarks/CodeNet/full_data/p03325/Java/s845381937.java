import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> aEven = new ArrayList<>(); 
		for(int i = 0; i < n; i++) {
			int ai = sc.nextInt();
			
			if((ai % 2) == 0) {
				aEven.add(ai);
			}
		}
		
		aEven.sort(null);
		
		int count = 0;
		System.out.println(operation(aEven, count));
		
		
	}
	
	static int operation(ArrayList<Integer> al, int count) {
		if(al.size() == 0) {
			return count;
		}else {
			
			int target = al.get(al.size() - 1);
			target = target / 2;
			count++;
			
			if((target % 2) == 0) {
				al.set(al.size() - 1, target);
			}else {
				al.remove(al.size() - 1);
			}
			
			count = operation(al, count);
			
			return count;
		}
		
	}
}