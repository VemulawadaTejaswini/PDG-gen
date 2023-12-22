import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		final int s = sc.nextInt();
		
		int i = 1;
		final List<Integer> a = new ArrayList<>();
		int tail = s;
		while (true) {
			i++;
			final int an = f(tail);
			
			final boolean satisfy = a.stream().anyMatch(j -> j == an);
			
			if (satisfy) {
				break;
			}
			
			tail = an;
			a.add(an);
		}
		
		System.out.println(i);
	}
	
	private static int f(int n) {
		if (n % 2 == 0) {
			return n / 2;
		} else {
			return 3 * n + 1;
		}
	}

}