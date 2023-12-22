import java.util.*;

public class Main {
    static int n;
    static int m;
    static char[] c;
    static String[] pm = {"+", "-"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.next().toCharArray();

        boolean ok = false;
        String op1 = "+";
        String op2 = "+";
        String op3 = "+";

        for (int i = 0; i < 2; i++) {
            int r1 = 0;
            op1  = pm[i];
            r1 = calc(op1, Character.getNumericValue(c[0]), Character.getNumericValue(c[1]));
            for (int j = 0; j < 2; j++) {
                op2  = pm[j];
                int r2 = calc(op2, r1, Character.getNumericValue(c[2]));
                for (int k = 0; k < 2; k++) {
                    op3  = pm[k];
                    int r3 = calc(op3, r2, Character.getNumericValue(c[3]));
                    if (r3 == 7) {
                        ok = true;
                        break;
                    }
                }
                if (ok) break;
            }
            if (ok) break;
        }
        System.out.println(c[0]+op1+c[1]+op2+c[2]+op3+c[3]+"=7");
    }
    static int calc (String op, int a, int b) {
        if ("+".equals(op)) {
            return a + b;
        } else {
            return a - b;
        }
    }
}

