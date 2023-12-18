public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums ={ Integer.parseInt(lines[0]), Integer.parseInt(lines[1]), Integer.parseInt(lines[2]) };
		for(int i = 0; i < nums.length - 1;i++) {
			for(int j = 0; j < nums.length - 1; j++){
				if(nums[j] > nums[j + 1]) {
					int x = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = x;
				}
			}
		}
		System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
	}
}
