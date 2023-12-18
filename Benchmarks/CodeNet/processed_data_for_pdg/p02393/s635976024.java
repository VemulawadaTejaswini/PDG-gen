class Main {
	public static void main(String[] args) {
		String line;
		List<Integer> input = new ArrayList<>();
		Scanner stdIn = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			input.add(stdIn.nextInt());
		}
		Collections.sort(input);
		System.out.println(input.get(0) + " " + input.get(1) + " " + input.get(2));
	}
}
