public interface Main {
	static int a = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d %d\n", a*b, (a+b)*2);
	}
}
