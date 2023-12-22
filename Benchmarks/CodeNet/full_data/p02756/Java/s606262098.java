import java.util.Scanner;

public class Main {
    static long q;
    static String s;
    static String t; //反転する文字列

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        q = sc.nextInt();
        t = "";

        for (int i = 0; i < q; i++) {
            if (sc.nextInt() == 1) {
                String tmp = s;
                s = t;
                t = tmp;
            } else {
                if (sc.nextInt() == 1) {
                    t += sc.next();
                } else {
                    s += sc.next();
                }
            }
        }
        //tを反転
        StringBuffer str = new StringBuffer(t);
        str.reverse();

        System.out.println(str + s);
    }
}