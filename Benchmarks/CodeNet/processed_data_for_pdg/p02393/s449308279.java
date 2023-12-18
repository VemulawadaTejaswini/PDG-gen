public interface Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] d = {a,b,c};
		Arrays.sort(d);
		System.out.printf("%d %d %d\n", d[0], d[1],d[2]);
	}
}
