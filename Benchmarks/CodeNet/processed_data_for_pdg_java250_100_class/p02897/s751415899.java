public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		double result = 0.0;
		double cnt = 0;
		for(int i = 1;i<=N;i++) {
			if(i%2 == 1) {
				cnt++;
			}
		}
		result = cnt/N;
		System.out.println(result);
	}
}
