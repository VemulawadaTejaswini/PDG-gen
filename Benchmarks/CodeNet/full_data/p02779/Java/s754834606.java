import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String s  = "YES";
		Set<Integer> a = new HashSet<>();
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			if(a.contains(num)){
				s = "NO";
				break;
			} else {
				a.add(num);
			}
		}
		sc.close();
		System.out.println(s);
	}

}