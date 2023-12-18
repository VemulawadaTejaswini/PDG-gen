class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		scanner.close();
		int measure = i*j;
		int circuit = i*2 + j*2;
		System.out.println(measure + " "+ circuit);
	}
}
