import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = Arrays.stream(sc.nextLine().split(" +")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(nums);
        System.out.println(nums[0]+nums[1]+10*nums[2]);
        sc.close();
    }
}
