public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c	 = scanner.nextInt();
		List<Integer> integerList = Arrays.asList(a,b,c);
		Collections.sort(integerList);
		System.out.println(integerList.get(0) + " " + integerList.get(1) + " "
				+ integerList.get(2));
	}
}
