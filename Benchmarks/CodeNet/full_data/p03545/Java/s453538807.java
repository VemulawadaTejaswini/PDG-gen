import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String S;
        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
        }
        char[] carr = S.toCharArray();
        int[] arr = new int[carr.length];
        for (int i = 0; i < carr.length; i++) {
            arr[i] = carr[i] - 48;
        }
        int baseMax = arr.length - 1;
        int bitSign = 0;
        while (bitSign < Math.pow(2, baseMax)) {
            StringBuilder sb = new StringBuilder();

            int result = arr[0];
            sb.append(arr[0]);

            for (int i = 0; i < baseMax; i++) {
                boolean isPlus = ((bitSign >>> (baseMax - 1 - i)) & 0x1) == 0;
                String s = isPlus ? "+" : "-";
                result += ((isPlus) ? (arr[i + 1]) : -(arr[i + 1]));
                sb.append(s).append(arr[i + 1]);
            }
            if (result == 7) {
                sb.append("=7");
                System.out.println(sb.toString());
                return;
            }
            bitSign++;
        }
    }
}
