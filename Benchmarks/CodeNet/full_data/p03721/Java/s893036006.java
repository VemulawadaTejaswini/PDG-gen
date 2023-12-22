import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		List<P> list = new ArrayList<>();

		for(int i = 0; i < n; i++){
			list.add(new P(scanner.nextInt(), scanner.nextInt()));
		}

		list.sort((a,b) -> a.n - b.n);
		long count = 0;
		for(int i = 0; i < n-1; i++){
			count += list.get(i).k;
			if(count > k - 1){
				System.out.println(list.get(i).n);
				break;
			}
		}
	}
}

class P{
	int n;
	int k;
	public P(int n, int k) {
		this.n = n;
		this.k = k;
	}
}