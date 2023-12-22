import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        check(num);
    }

    public static void check(String num) {
        String[] strs = num.split(" ");
        int[] nums = new int[strs.length];
        for(int i=0; i<strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        int result = nums[2]-(nums[0]-nums[1]);
        if(result > 0){
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}