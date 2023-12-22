import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        Set<Integer> colors = new HashSet<Integer>();
        colors.add(a);
        colors.add(b);
        colors.add(c);

        PrintWriter out = new PrintWriter(System.out);
        out.println(colors.size());
        out.flush();
        sc.close();
    }
}