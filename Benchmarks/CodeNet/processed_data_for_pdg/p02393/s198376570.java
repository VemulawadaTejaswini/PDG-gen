public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 3;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        int dummy;
        for (int i = len-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    dummy = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = dummy;
                }
            }
        }
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
        sc.close();
    }
}
