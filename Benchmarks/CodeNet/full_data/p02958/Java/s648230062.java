import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(sc.next());

        }
        int k = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] != i+1) {
                k++;
            }
        }
        if(k == 0 || k == 2) {
            out.println("YES");
        } else {
            out.println("NO");
        }

        out.flush();

    }

}
