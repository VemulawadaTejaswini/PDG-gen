import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        boolean isYes = true;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
            sum += nums.get(i);
        }
        in.close();
        Collections.sort(nums);
        for (int i = 0; i < m; i++) {
            if (nums.get(nums.size()-1-i) < sum/(4.0*m)) {
                System.out.println("No");
                isYes = false;
                break;
            }
        }
        if (isYes) {
            System.out.println("Yes");
        }
    }
}