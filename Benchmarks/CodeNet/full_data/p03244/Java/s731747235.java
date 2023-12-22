
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		Set<Integer> set = new HashSet<>();
		set.add(-1);
		for(int i = 0; i < N; i++) {
			int thenum = sc.nextInt();
			num[i] = thenum;
			set.add(thenum);
		}
		int fastest = 100000;

		for(int comb0 : set) {
			for(int comb1 : set) {
				if(comb0 == comb1)continue;
				int current = 0;
				for(int k = 0; k < num.length; k++) {
					if(k % 2 == 0) {
						if(num[k] != comb0)current++;
					}else {
						if(num[k] != comb1)current++;
					}
				}
				if(current < fastest)fastest = current;
			}
		}
		System.out.println(fastest);

	}

}
