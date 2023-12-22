import java.util.Scanner;

/**
 * <p>ClassName:  </p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author zhangyong
 * @version 1.0.0
 * @date 2019/12/10 22:39
 */
public class Solution {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        int count = 0;
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left += 1;
                right -= 1;
                continue;
            } else {
                left += 1;
                right -= 1;
                count += 1;
            }
        }
        System.out.println(count);
    }
}