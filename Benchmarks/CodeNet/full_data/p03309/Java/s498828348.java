import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int b = -200000;
        int tmp = 0;
        int tmp2 = Integer.MAX_VALUE;
        int output = 0;
        while (true) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] - i - b < 0) {
                    tmp -= nums[i] - i - b;
                } else {
                    tmp += nums[i] - i - b;
                }

            }
            if(tmp2<tmp){
                System.out.println(tmp2);
                return;
            }
            tmp2=tmp;
            tmp=0;
            b++;
        }

    }

}