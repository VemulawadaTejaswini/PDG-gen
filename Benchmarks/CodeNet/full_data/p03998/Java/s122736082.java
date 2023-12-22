import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stra = sc.nextLine();
        String strb = sc.nextLine();
        String strc = sc.nextLine();

        int cntA = 0;
        int cntB = 0;
        int cntC = 0;
        int nextIda = 0;
        int nextIdb = 0;
        int nextIdc = 0;
        char next = 'a';
        char ans = 'x';

        outline: while (true) {
            switch (next) {
            case 'a':
                cntA++;
                if (cntA > stra.length()) {
                    ans = 'a';
                    break outline;
                }
                next = stra.charAt(nextIda);
                nextIda++;
                break;
            case 'b':
                cntB++;
                if (cntB > strb.length()) {
                    ans = 'b';
                    break outline;
                }
                next = strb.charAt(nextIdb);
                nextIdb++;
                break;
            case 'c':
                cntC++;
                if (cntC > strc.length()) {
                    ans = 'c';
                    break outline;
                }
                next = strc.charAt(nextIdc);
                nextIdc++;
                break;
            }
        }

        if (ans == 'a') {
            System.out.println('A');
        } else if (ans == 'b') {
            System.out.println('B');
        } else {
            System.out.println('C');
        }
    }
}