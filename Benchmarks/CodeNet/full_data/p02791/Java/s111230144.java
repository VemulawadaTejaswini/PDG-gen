import java.util.*;

public class Main {

    private static int lowElements(List<Integer> nums) {
        Set<Integer> failed = new HashSet<>();

        int start = 0;

        while (start < nums.size() - 1 && nums.get(start) < nums.get(start + 1)) {
            start++;
            failed.add(start);
        }

        for (int j = start; j < nums.size(); j++) {
            for (int i = j; i < nums.size(); i++) {
                if (nums.get(i) > nums.get(j)) {
                    failed.add(i);
                }
            }
        }

        return nums.size() - failed.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        System.out.println(lowElements(nums));
    }

}
