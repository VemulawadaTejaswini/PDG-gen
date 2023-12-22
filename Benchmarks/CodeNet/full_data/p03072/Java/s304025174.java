import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int N = Integer.parseInt(in.next());
			int[] hills = new int[N];
			
			for (int i = 0; i < N; i++) {
				hills[i] = in.nextInt();
			}
			
			int coutner = 1;
			boolean isHigh = false;
			for (int i = 1; i < N; i++) {
				int hill_i = hills[i];
				for (int j = 0; j < i; j++) {
					int hill_j = hills[j];
					if (hill_i < hill_j) {
						isHigh = false;
						break;
					} else {
						isHigh = true;
					}
				}
				if (isHigh) coutner++;
			}
			
			System.out.println(coutner);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
