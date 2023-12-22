import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long K = scanner.nextLong();
		int Q = scanner.nextInt();
		HashMap<Integer, Long> hashMap = new HashMap<Integer, Long>();

		for (int i = 1; i <= N; i++) {
			hashMap.put(i, (long) 0);
		}

		for (int i = 0; i < Q; i++) {
			int I = scanner.nextInt();
			hashMap.put(I, hashMap.get(I) + 1);
		}

		for (int i = 1; i <= N; i++) {
			if(hashMap.get(i) + K - Q > 0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		
	}
}
