import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = check("3", n) + check("5", n) + check("7", n);
        System.out.println(num);
    }

    public static int check(String cc, int n) {
        long ct = Long.parseLong(cc);
        int ret = 0;
        if (ct > n)
            return 0;
        boolean a1 = false;
        boolean a2 = false;
        boolean a3 = false;
        for (int i = 0; i < cc.length(); i++) {
            if (cc.charAt(i) == '3')
                a1 = true;
            if (cc.charAt(i) == '5')
                a2 = true;
            if (cc.charAt(i) == '7')
                a3 = true;
        }
        if (a1 && a2 && a3)
            ret++;
        ret += check(cc + "3", n) + check(cc + "5", n) + check(cc + "7", n);
        return ret;
    }

}
