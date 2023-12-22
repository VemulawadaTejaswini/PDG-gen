import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		HashSet<Integer> aArraySet = new HashSet<Integer>();

		for(int i=0; i<N; i++){
			int a = Integer.parseInt(sc.next());
			if (aArraySet.contains(a)){
				aArraySet.remove(a);
			}else {
				aArraySet.add(a);
			}
		}
		System.out.println(aArraySet.size());
    }
}