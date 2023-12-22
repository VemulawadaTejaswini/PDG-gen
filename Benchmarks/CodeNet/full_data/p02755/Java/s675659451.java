import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aa = (int) (a * 12.5);
        int bb = 10 * b;
        if (aa / 10 == b) {
            System.out.println(aa);
        } else {
            if (bb * 0.08 == a) {
                int cc = aa + 1;
                while (cc < bb) {
                    if (cc / 10 == b) {
                        System.out.println(cc);
                        return;
                    }
                    cc++;
                }
            }
            System.out.println(- 1);
        }
    }
}