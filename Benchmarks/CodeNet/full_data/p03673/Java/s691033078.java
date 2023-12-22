import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int[] arr = new int[N];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			arr[i] = reader.nextInt();
		}
		for (int i = 0; i < N/2*2; i+=2) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(arr[i+1]);
			tmp.addAll(list);
			tmp.add(arr[i]);
			list = tmp;
		}
		if (N % 2 == 1) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(arr[N-1]);
			Collections.reverse(list);
			tmp.addAll(list);
			list = tmp;

		}

		for (int num : list) {
			System.out.print(num + " ");
		}

		reader.close();
	}


}



