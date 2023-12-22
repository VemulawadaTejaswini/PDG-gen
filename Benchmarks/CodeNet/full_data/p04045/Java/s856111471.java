import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static boolean canCreateNumFromLike(int r, int[] like) {
        int rDigitNum = String.valueOf(r).length();
        int[] rArray = new int[rDigitNum];
        for (int i = 0; i < rDigitNum; i++) {
            rArray[i] = String.valueOf(r).charAt(i) - '0';
        }

        for (int i = rDigitNum - 1; i >= 0; i--) {
            boolean matched = false;
            for (int j = 0; j < like.length; j++) {
                if (rArray[i] == like[j]) {
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] d = new Integer[k];
        for (int i = 0; i < k; i++) {
            d[i] = sc.nextInt();
        }
        int[] like = new int[10 - k];
        int likeIdx = 0;
        List<Integer> dList = Arrays.asList(d);
        for (int i = 0; i < 10; i++) {
            if (!dList.contains(Integer.valueOf(i))) {
                like[likeIdx] = i;
                likeIdx++;
            }
        }

        int result = n;
        while (true) {
            if (!canCreateNumFromLike(result, like)) {
                result++;
                continue;
            }
            break;
        }
        System.out.println(result);
    }

}
