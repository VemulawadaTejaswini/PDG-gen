import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int k=scanner.nextInt();
		Set<Integer>set=new HashSet<>();
		
		int cnt = 0;
		int ab=a;
		while (cnt <= k&&a<=b) {
			set.add(a);
			a++;
			cnt++;
		}
		
		cnt=0;
		while (cnt <= k&&ab>=b) {
			set.add(b);
			a--;
			cnt++;
		}
		
		for(int i:set) {
			System.out.println(i);
		}
	}
}