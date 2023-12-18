class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[3];
		nums[0] = scan.nextInt();
		nums[1] = scan.nextInt();
		nums[2] = scan.nextInt();
		Arrays.sort(nums);
		System.out.println(nums[0]+" "+nums[1]+" "+nums[2]);
	}
}
