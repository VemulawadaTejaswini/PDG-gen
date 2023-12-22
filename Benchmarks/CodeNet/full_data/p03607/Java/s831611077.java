import java.util.*;

// ABC 62-D
// http://abc062.contest.atcoder.jp/tasks/arc074_b

public class Main {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			int index = numbers.indexOf(num);
			
			if (index >= 0) {
				numbers.remove(index);
			} else {
				numbers.add(num);
			}
		}
		
		System.out.println(numbers.size());
	}
}