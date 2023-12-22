import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		Set<Integer> anss = new HashSet<>();
		
		for (int i = 0; i < k; i++){
			if (a + i < b)
			anss.add(a + i);
		}
		
		for (int i = 0; i < k; i++){
			if (b - i > a)
			anss.add(b - i);
		}
		
		for (int ans : anss){
			System.out.println(ans);
		}
	}
}