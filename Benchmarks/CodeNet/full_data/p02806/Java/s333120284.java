import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Pair> pairs = new ArrayList<Pair>();
		for(int i=0;i<N;i++) {
			Pair pair = new Pair();
			pair.title = sc.next();
			pair.length = sc.nextInt();
			pairs.add(pair);
		}
		String X = sc.next();
		boolean flag = false;
		int total = 0;
		for(Pair pair:pairs) {
			
			if(flag) {
				total+=pair.length;
			}
			if(pair.title.equals(X)) {
				flag = true;
			}
		}
		System.out.println(total);
	}

}
class Pair {
	public String title;
	public Integer length;
}
