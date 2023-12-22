import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Pair<F, S>{
	F first;
	S second;
	public Pair(F f, S s) {
		first = f;
		second = s;
	}
}

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Pair<Integer, Integer>[] dishes = new Pair[N];
		for(int i = 0; i < N; i++) {
			dishes[i] = new Pair<Integer, Integer>(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(dishes, new Comparator<Pair<Integer, Integer>> () {
			public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
				return - (o1.first + o1.second) + (o2.first + o2.second);
			}
		});
		long Takahashi = 0, Aoki = 0;
		for(int i = 0; i < N; i++) {
			if(i % 2 == 0) {
				Takahashi += (long)dishes[i].first;
			}
			else {
				Aoki += (long)dishes[i].second;
			}
		}
		System.out.println(Takahashi - Aoki);
	}
}