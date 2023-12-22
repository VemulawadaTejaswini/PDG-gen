import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxDiff = -1;
        int targetId = 0;
        int[] array = new int[5];
        for(int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            int target = num / 10 * 10 + 10;
            array[i] = num;
            int diff = target - num;
            if(diff >= maxDiff) {
                maxDiff = diff;
                targetId = i;
            }
        }
        int ans = 0;
        for(int i = 0; i < 5; i++) {
            if(targetId != i) {
                int num = array[i] / 10 * 10 + 10;
                ans += num;
            } else {
                ans += array[i];
            }
        }
        System.out.println(ans);
    }
}