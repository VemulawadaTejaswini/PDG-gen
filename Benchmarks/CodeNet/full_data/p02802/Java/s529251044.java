import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int waCount = 0;
        int acCount = 0;

        boolean skipFlg = false;

        int p = 0;
        int prevP = 0;
        String prevS;
        String s = null;

        for (int i = 0; i < m; i++) {
            prevP = p;
            p = sc.nextInt();
            prevS = s;
            s = sc.next();
            if (prevP == p) {
                if (skipFlg || prevS.equals(s)) {
                    skipFlg = false;
                    continue;
                }
            }
            skipFlg = false;

            if ("WA".equals(s)) {
                waCount++;
            } else {
                acCount++;
                skipFlg = true;
            }
        }

        System.out.println(acCount + " " + waCount);
    }

}