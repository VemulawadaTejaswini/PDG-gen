import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (String.valueOf(i).length() == 1) {
                count++;
            } else if (String.valueOf(i).length() % 2 != 0) {
                count++;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        out.flush();
        sc.close();
    }
}