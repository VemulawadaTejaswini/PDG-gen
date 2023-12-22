import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        int count = 0;
        for (int i = min; i <= max; i++) {
            if (isKaibun(i)) count++;
        }

        System.out.println(count);
    }

    private static boolean isKaibun(int n) {
        boolean isKaibun = true;
        String nString = Integer.toString(n);

        for (int i = 0; i < nString.length(); i++) {
            if (nString.charAt(i) == nString.charAt(nString.length()-1-i)) continue;

            // 文字が違うため回文ではない
            isKaibun = false;
            break;
        }

        return isKaibun;
    }
}
