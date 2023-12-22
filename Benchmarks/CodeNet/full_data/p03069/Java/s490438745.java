import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String[] str = s.split("");

        int allBlackCount = 0;
        for (int i = 0; i < str.length; i++) {
            if (".".equals(str[i])) {
                allBlackCount++;
            }
        }
        int allWhiteCount = 0;
        for (int i = 0; i < str.length; i++) {
            if ("#".equals(str[i])) {
                allWhiteCount++;
            }
        }
        int whiteStartCount = 0;
        boolean whiteZone1 = true;
        boolean blackZone1 = false;
        for (int i = 0; i < str.length; i++) {
            if ("#".equals(str[0])) {
                whiteStartCount = Integer.MAX_VALUE;
                break;
            }
            if (whiteZone1 && !blackZone1 && ".".equals(str[i])) {
                continue;
            }
            if (whiteZone1 && !blackZone1 && "#".equals(str[i])) {
                whiteZone1 = false;
                blackZone1 = true;
                continue;
            }
            if (!whiteZone1 && blackZone1 && "#".equals(str[i])) {
                continue;
            }
            if (!whiteZone1 && blackZone1 && ".".equals(str[i])) {
                whiteZone1 = true;
                whiteStartCount++;
                continue;
            }
            if (whiteZone1 && blackZone1 && "#".equals(str[i])) {
                continue;
            }
            whiteStartCount++;
        }

        int blackStartCount = 0;
        boolean whiteZone2 = false;
        boolean blackZone2 = false;
        for (int i = 0; i < str.length; i++) {
            if (".".equals(str[0])) {
                blackStartCount = Integer.MAX_VALUE;
                break;
            }
            if (!whiteZone2 && !blackZone2 && "#".equals(str[i])) {
                blackStartCount++;
                continue;
            }
            if (!whiteZone2 && !blackZone2 && ".".equals(str[i])) {
                whiteZone2 = true;
                continue;
            }
            if (whiteZone2 && !blackZone2 && ".".equals(str[i])) {
                continue;
            }
            if (whiteZone2 && !blackZone2 && "#".equals(str[i])) {
                whiteZone2 = false;
                blackZone2 = true;
                continue;
            }
            if (!whiteZone2 && blackZone2 && "#".equals(str[i])) {
                continue;
            }
            if (!whiteZone2 && blackZone2 && ".".equals(str[i])) {
                blackStartCount++;
                whiteZone2 = true;
                blackZone2 = true;
                continue;
            }
            if (whiteZone2 && blackZone2 && "#".equals(str[i])) {
                continue;
            }
            blackStartCount++;
        }
        System.out.println(Math.min(whiteStartCount,
                Math.min(blackStartCount, Math.min(allWhiteCount, allBlackCount))));
    }

}
