import java.util.Scanner;

public class Main {
    static long q;
    static String s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        q = sc.nextInt();
        StringBuffer str = new StringBuffer(s);
        for (int i = 0; i < q; i++) {
            int method = sc.nextInt();
            if (method == 1) {
                str.reverse();
            } else {
               int place = sc.nextInt();
               if (place == 1) {
                   StringBuffer tmp = new StringBuffer(sc.next());
                   str = tmp.append(str);
               } else {
                   str.append(sc.next());
               }
            }
        }
        System.out.println(str);
    }
}