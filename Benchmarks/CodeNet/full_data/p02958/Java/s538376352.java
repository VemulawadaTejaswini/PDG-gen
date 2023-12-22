import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int one = 0;
		int two = 0;
		int cnt = 0;
		int last = Integer.parseInt(sc.next());
		int[] array = new int[N];
		array[0] = last;
		for (int i = 0; i < N - 1; i++) {
			int current = Integer.parseInt(sc.next());
			if (cnt >= 2) {
				System.out.println("NO");
				sc.close();
				return;
			}
			array[i + 1] = current;
			if (current < last) {
				cnt++;
				if (cnt == 1) {
					one = i;
				} else if (cnt == 2) {
					two = i + 1;
				} else if (cnt > 2) {
					System.out.println("NO");
					sc.close();
					return;
				}
			}
			last = current;

		}
		sc.close();
		if (cnt == 2) {
			int tmp = array[two];
			array[two] = array[one];
			array[one] = tmp;
			int last_ = array[0];
			for (int i = 0; i < N - 1; i++) {
				if (last_ > array[i + 1]) {
					System.out.println("NO");
					return;
				}
				last = array[i + 1];
			}
		}else if (cnt == 1) {
			if(one != N-2) {
				if(array[one] > array[N-1]) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}
}