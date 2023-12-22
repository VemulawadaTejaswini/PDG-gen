import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final Long H = Long.parseLong(sc.next());
        final Long W = Long.parseLong(sc.next());
        out.println((H * W) % 2 == 0 ? (H * W) / 2 : ((H * W) / 2) + 1);

        out.flush();
    }
}