import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		ArrayList<Pair> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(new Pair(i+1,sc.next(), Integer.parseInt(sc.next())));
		}
		Collections.sort(list, new PairComparator());
		
		for (int i = 0; i < N; i++) {
			System.out.println(list.get(i).num);
		}
		
		
	}


}
class Pair{
	int num;
	String name;
	int score;
	
	Pair(int num, String name, int score){
		this.num = num;
		this.name = name;
		this.score = score;
	}
}

class PairComparator implements Comparator<Pair> {

	@Override
	public int compare(Pair p1, Pair p2) {
		if(p2.name.compareTo(p1.name) != 0)
			return p1.name.compareTo(p2.name);
		else {
			return p2.score < p1.score ? -1 : 1;
		}
	}
}

