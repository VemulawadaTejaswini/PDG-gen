import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        check(num);
    }

    public static void check(String line) {
        String[] strs = line.split(" ");
        int[] nums = new int[strs.length];
        for(int i=0; i<strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        for(int i=1;i<nums[0];i++) {
            if(i*(nums[1]+nums[1]+1) >= nums[0]) {
                System.out.println(i);
                break;
            }
        }
    }
}