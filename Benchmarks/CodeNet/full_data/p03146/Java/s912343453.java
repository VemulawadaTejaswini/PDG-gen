import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<Integer>();
		
		int s = sc.nextInt();
		set.add(s);
		int before = s;
		
		for(int i = 2;;i++) {
			if(set.contains(f(before))) {
				System.out.println(i);
				break;
			}else {
				before = f(before);
				set.add(before);
			}
		}
	}
	
	static int f(int x) {
		if(x % 2 == 0) {
			return x / 2;
		}else {
			return (x * 3 + 1);
		}
	}
}