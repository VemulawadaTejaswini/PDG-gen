import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());

		int[] cake = new int[T];

		for(int i = 0; i < T; i++){
			cake[i] = Integer.parseInt(sc.next());
		}

		int max = getArrayMax(cake);

		int day = Math.max(0, (max - (K/2 + 1))*2 + (K+1) % 2);

		System.out.println(day);

	}

	static int getArrayMax(int[] array){
		int max = 0;
		for(int i = 0; i < array.length; i++){
			max = Math.max(max, array[i]);
		}
		return max;
	}
}
