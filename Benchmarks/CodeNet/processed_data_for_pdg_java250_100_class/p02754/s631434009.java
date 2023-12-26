public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long target = sc.nextLong();
		long b = sc.nextLong();
		long r = sc.nextLong();
		long sum = r + b;
		long count = target / sum;
		long answer = b * count;
		answer += Math.min(target%sum, b);
		System.out.println(answer);
	}
}
