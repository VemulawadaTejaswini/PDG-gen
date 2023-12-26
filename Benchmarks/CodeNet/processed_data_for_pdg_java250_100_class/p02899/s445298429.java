public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] array = new String[N];
		for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
			array[Ai-1] = Integer.toString(i+1);
		}
		System.out.println(String.join(" ", array));
		sc.close();
	}
}
