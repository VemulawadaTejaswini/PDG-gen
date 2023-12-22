import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int maxLen = 0;
        int tmpLen = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A' || S.charAt(i) == 'C' || S.charAt(i) == 'G' || S.charAt(i) == 'T') {
                tmpLen++;
            } else {
                if (maxLen < tmpLen) {
                    maxLen = tmpLen;
                    tmpLen = 0;
                }
            }
        }

        System.out.println(maxLen);
    }
}
