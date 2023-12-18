class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] ar = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(ar);
		System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
	}
}
