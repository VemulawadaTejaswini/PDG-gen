import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> l = new ArrayList<>();
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        rec(0);
        int res = 0;
        for (String s : l) {
            boolean b3 = false;
            boolean b5 = false;
            boolean b7 = false;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '3') {
                    b3 = true;
                } else if (c == '5') {
                    b5 = true;
                } else {
                    b7 = true;
                }
                if (b3 && b5 && b7) {
                    res++;
                    break;
                }
            }
        }
        System.out.println(res);
    }

    private static void rec(long n) {
        long n3 = n * 10 + 3;
        long n5 = n * 10 + 5;
        long n7 = n * 10 + 7;
        if (n3 <= N) {
            l.add(String.valueOf(n3));
            rec(n3);
        }
        if (n5 <= N) {
            l.add(String.valueOf(n5));
            rec(n5);
        }
        if (n7 <= N) {
            l.add(String.valueOf(n7));
            rec(n7);
        }
        return;
    }
}
