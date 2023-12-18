class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[3];
		numbers[0] = scanner.nextInt();
		numbers[1] = scanner.nextInt();
		numbers[2] = scanner.nextInt();
		Arrays.sort(numbers);
		System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
	}
}
