public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		String answer = "No";
		for(int i = 1; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				if(i * j == N) {
					answer = "Yes";
				}
			}
		}
		System.out.println(answer);
	}
}
