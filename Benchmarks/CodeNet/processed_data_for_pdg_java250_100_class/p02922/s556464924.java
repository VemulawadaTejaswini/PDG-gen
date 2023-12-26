public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int ans = 0;
		int count = 1;
		while(count<B) {
			count = count -1;
			count = count + A;
			ans = ans + 1;
		}
		System.out.println(ans);
	}
}
