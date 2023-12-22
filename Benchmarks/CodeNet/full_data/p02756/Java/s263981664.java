
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();

        boolean isHanten = false;

        StringBuffer sb = new StringBuffer(s);

        for (int i = 0; i < q; i++) {
            int f = sc.nextInt();
            if (f == 1) {
                isHanten = !isHanten;
            } else {
                if (sc.nextInt() == 1) {
                    if (isHanten) {
                        sb.append(sc.next());
                    } else {
                        sb.insert(0, sc.next());
                    }
                } else {
                    if (isHanten) {
                        sb.insert(0, sc.next());
                    } else {
                        sb.append(sc.next());
                    }
                }
            }
        }
        if (isHanten) {
            System.out.println(sb.reverse());
        } else {
            System.out.println(sb);
        }
    }
}
