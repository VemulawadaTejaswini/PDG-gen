class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		scanner.close();
		int num = i*i*i;
		System.out.println(num);
	}
}
