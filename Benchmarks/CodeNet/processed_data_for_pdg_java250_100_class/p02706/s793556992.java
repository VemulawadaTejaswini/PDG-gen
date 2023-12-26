 public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int sum = 0;
		for(int i = 0 ; i < m ; i++)
			sum += input.nextInt();
		System.out.println(n >= sum ? n - sum : -1);
	}
}
