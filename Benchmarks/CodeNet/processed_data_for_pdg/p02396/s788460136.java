public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int count = 1;
        int num = inp.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        while (num != 0) {
            nums.add(num);
            num = inp.nextInt();
        }
        for (int n : nums) {
            System.out.println("Case " + count + ": " + n);
            count++;
        }
    }
}
