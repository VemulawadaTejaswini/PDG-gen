import java.util.HashMap;
import java.util.Scanner;

public class solve2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int counter = 0;
		HashMap<Integer, Integer> hash = new HashMap<>();

		int[] array = new int[N];
		for (int i = 0; i < N; i++) {

			array[i] = scan.nextInt();
			if (hash.get(array[i]) == null)
				hash.put(array[i], 1);
			else
				hash.put(array[i], (hash.get(array[i])) + 1);

			if (hash.get(array[i] - 1) == null)
				hash.put(array[i] - 1, 1);
			else
				hash.put(array[i] - 1, hash.get(array[i] - 1) + 1);

			if (hash.get(array[i] + 1) == null)
				hash.put(array[i] + 1, 1);
			else
				hash.put(array[i] + 1, hash.get(array[i] + 1) + 1);

		}
		Object[] array2 = hash.keySet().toArray();
		int max = 0;
		int j= 0;
		for (int i = 0; i < array2.length; i++) {
			if ((int) hash.get(array2[i]) > max){
				max = (int) hash.get(array2[i]);
			j = i;	
			}
			
		}
		System.out.println(max);
//		System.out.println(array2[j]);

	}

}
