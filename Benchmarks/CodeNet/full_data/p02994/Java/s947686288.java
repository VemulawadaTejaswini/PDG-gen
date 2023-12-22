import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int l = in.nextInt();
        int sum = 0;
        int first = l;
        int last = l + n - 1;
        boolean zero = false;
        for (int i = 1; i <= n; i++) {
            zero = zero || (l + i - 1 == 0);
            sum += l + i - 1;
        }

        if (zero) out.println(sum);
        else {
            if (Math.abs(sum - last) > Math.abs(sum -first)) out.println(sum - last);
            else out.println(sum - first);
        }

        out.close();
    }
}