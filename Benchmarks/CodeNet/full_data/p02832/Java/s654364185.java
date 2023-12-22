import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Pair> pairs = new ArrayList<>();
		for(int i=0;i<N;i++) {
			Pair pair = new Pair();
			pair.count=i+1;
			pair.value=sc.nextInt();
			pairs.add(pair);
		}
		int tmp=1;
		int count=0;
		for(Pair pair:pairs) {
			if(pair.value==tmp) {
				tmp++;
			}else {
				count++;
			}
		}
		if(tmp==1) {
			System.out.println(-1);
		}else {
			System.out.println(count);
		}
	}

}
class Pair{
	public Integer count;
	public Integer value;
}