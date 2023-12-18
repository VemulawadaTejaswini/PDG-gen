public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		List<Integer> numbers = Arrays.asList(a, b, c);
		Collections.sort(numbers);
		String output = numbers.stream().map(s -> s.toString()).collect(Collectors.joining(" "));
		System.out.println(output);
	}
}
