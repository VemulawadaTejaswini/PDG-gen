import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> length = new ArrayList<Integer>();
		long sum = 0;
		for(int i = 0; i < N; i++) {
			length.add(sc.nextInt());
			for(int j = i - 1; j >= 0; j--) {
				for(int k = j - 1; k >= 0; k--)
					if(length.get(k) < length.get(i) + length.get(j)) {
						if(length.get(i) < length.get(k) + length.get(j)) {
							if(length.get(j) < length.get(k) + length.get(i)) {
								sum++;
							}
						}
					
				}
			}
		}
		System.out.println(sum);

	}

}
