import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//D	Restore the Tree
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf(sc.nextLine());
		List<Input> inList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			Input in = new Input();
			in.a = Integer.valueOf(sc.nextInt());
			in.b = Integer.valueOf(sc.nextInt());
			inList.add(in);
		}

		Collections.sort(inList, new Comparator<Input>() {

			@Override
			public int compare(Input o1, Input o2) {
				return Long.valueOf(o2.a + o2.b).compareTo(Long.valueOf(o1.a + o1.b));
			}
		});

		long p1 = 0;
		long p2 = 0;
		for (int i = 0; i < inList.size(); i++) {
			if (i % 2 == 0) {
				p1 += inList.get(i).a;
			} else {
				p2 += inList.get(i).b;
			}
		}
		System.out.println(p1 - p2);

		sc.close();
	}

	static class Input {
		long a;
		long b;
	}
}
