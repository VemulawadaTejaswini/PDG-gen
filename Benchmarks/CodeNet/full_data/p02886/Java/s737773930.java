import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>(N);
		long sum = 0;
		for(int i = 0; i < N; i++) {
			arr.add(sc.nextInt());
		}
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				sum += arr.get(i) * arr.get(j);				
			}
		}
		System.out.println(sum);

	}

}
