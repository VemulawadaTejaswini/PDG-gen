import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = Long.parseLong(scan.next());
		long K = Long.parseLong(scan.next());
		LinkedList<Character> str = new LinkedList<>();
		while(scan.hasNext()) {
			str.add((char)scan.nextByte());
		}
		for(int i= 0; i < K; i++) {
			if (str.getFirst() == 'a') {
				str.removeFirst();
				str.addFirst('b');
			}
			for(int j = 0; j < N; j++) {
				str.removeFirst();
				str.addLast('a');
			}
		}
		System.out.println(String.valueOf(str));
	}
}
