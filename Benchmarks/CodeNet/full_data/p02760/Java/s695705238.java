import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		int[] pos = new int[100+1];
		for(int i=1; i<=9; i++) {
			pos[in.nextInt()] = i;
		}

		int N = in.nextInt();
		Set<Integer> card = new HashSet<>();
		for(int i=0; i<N; i++) {
			card.add(pos[in.nextInt()]);
		}

		boolean isBingo =
				card.containsAll(Arrays.asList(1,4,7)) ? true
				: card.containsAll(Arrays.asList(2,5,8)) ? true
				: card.containsAll(Arrays.asList(3,6,9)) ? true
				: card.containsAll(Arrays.asList(1,2,3)) ? true
				: card.containsAll(Arrays.asList(4,5,6)) ? true
				: card.containsAll(Arrays.asList(7,8,9)) ? true
				: card.containsAll(Arrays.asList(1,5,9)) ? true
				: card.containsAll(Arrays.asList(3,5,7)) ? true
				: false;
		System.out.println(isBingo ? "Yes" : "No");

	}
 
 
	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}

}