import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Set<Integer> value = new HashSet<>();

		for(int i=0 ; i<num ; i++) {
			int a = sc.nextInt();

			if(value.contains(a)) {
				System.out.print("No");
				return;
			}
			else {
				value.add(a);
				continue;
			}
		}
		System.out.print("Yes");
		sc.close();
	}
}