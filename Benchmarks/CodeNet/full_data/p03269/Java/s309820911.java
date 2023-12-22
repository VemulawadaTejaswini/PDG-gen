import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        int L = scan.nextInt();
        Task tsk = new Task();
        tsk.solve(L);
    }

    static class Task{
        public void solve(int L) {
            int n = 32 - Integer.numberOfLeadingZeros(L);
            List<String> lst = new ArrayList<>();
            for (int i=0;i<n;i++) {
                int bit = (L >> (n - 1 - i)) & 1;
                int num = (1 << (n - 1 - i));
                lst.add((i + 1) + " " + (i + 2) + " " + (bit == 1? num: 0));
                if (bit == 1) lst.add((i + 1) + " " + (i + n + 2) + " 0");
                if (i > 0) {
                    lst.add((i + n + 1) + " " + (i + n + 2) + " " + num);
                    lst.add((i + n + 1) + " " + (i + n + 2) + " 0");
                }
            }
            lst.add(n + 1 + " " + (2 * n + 1) + " 0");
            System.out.println(2 * n + 1 + " " + lst.size());
            for (String s: lst) System.out.println(s);
        }
    }
}
