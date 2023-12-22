import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main implements Comparable<Main> {
	int no;
	String name;

	Main(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int compareTo(Main main) {
		int ret = this.name.compareTo(main.name);

		if (ret != 0) {
			return ret;
		}
		return Integer.compare(this.no, main.no) * -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Main> main = new ArrayList<>();
		int[] point = new int[N]; 
		

		for(int i = 0; i < N; i++) {
			String str = sc.next();
			int n = sc.nextInt();
			main.add(new Main(n, str));
			point[i] = n;
		}

		Collections.sort(main);

		for(Main m : main) {
			for(int i = 0; i < N; i++) {
				if(point[i] == m.no) {
					System.out.println(i + 1);
					break;
				}
			}
		}
	}
}