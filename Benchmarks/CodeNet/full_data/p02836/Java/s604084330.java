import java.util.*;
public class Main {
    /**
     * @param args
     */
    public static void main(final String[] args) {
 		Scanner sc = new Scanner(System.in);
 		final String aStr = sc.next();;
 
        /** 不一致件数カウント */
        int aCount = 0;
        /** インクリメント変数 */
        int aI = 0;
 
        while (aI * 2 < aStr.length()) {
            if (aStr.charAt(aI) == aStr.charAt(aStr.length() - aI - 1)) {
                // 何もしない
            } else {
                aCount++;
            }
            aI++;
        }
        System.out.println(aCount);
    }
}