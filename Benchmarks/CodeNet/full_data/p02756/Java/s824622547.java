import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        int q = Integer.parseInt(sc.next());
        boolean isR = false;
        for (int i = 0; i < q; i++) {
            int t = Integer.parseInt(sc.next());
            if (t == 1) {
                isR = !isR;
            } else {
                int f = Integer.parseInt(sc.next());
                String c = sc.next();
                if (f == 1) {
                    if (isR) {
                        sb.append(c);
                    } else {
                        sb.insert(0, c);
                    }
                } else {
                    if (isR) {
                        sb.insert(0, c);
                    } else {
                        sb.append(c);
                    }
                }
            }
        }
        System.out.println(isR ? sb.reverse().toString() : sb.toString());
    }
}