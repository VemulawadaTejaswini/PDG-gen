import java.util.Scanner;

/**
 * <p>Description: </p>
 * <p>Company: http://www.dmall.com</p>
 *
 * @author yong.zhang@dmall.com
 * @version 1.0.0
 * @date 2019/12/21 21:02
 */
public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = str.charAt(0);
        System.out.println((char) (c + 1));
    }
}