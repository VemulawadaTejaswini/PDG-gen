import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int tempt = Integer.parseInt(sc.next());
        int tempa = Integer.parseInt(sc.next());
        for (int i = 0; i < n - 1; i++) {
            int t = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next());
            if (t >= tempt && a >= tempa) {
                tempt = t;
                tempa = a;
            } else if (t < tempt && a < tempa) {
                if (tempt > tempa) {
                    int ratio = (int) Math.ceil(tempt / (double) t);
                    tempt = ratio * t;
                    tempa = ratio * a;
                } else {
                    int ratio = (int) Math.ceil(tempa / (double) a);
                    tempt = ratio * t;
                    tempa = ratio * a;
                }
            } else if (t < tempt) {
                int ratio = (int) Math.ceil(tempt / (double) t);
                tempt = ratio * t;
                tempa = ratio * a;
            } else if (a < tempa) {
                int ratio = (int) Math.ceil(tempa / (double) a);
                tempt = ratio * t;
                tempa = ratio * a;
            }
        }
        System.out.println(tempt + tempa);
    }
}