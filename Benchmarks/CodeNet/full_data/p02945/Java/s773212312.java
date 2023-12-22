import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;

    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        out.println(IntStream.of(a + b, a - b, a * b).max().getAsInt());
    }
}
