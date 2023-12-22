import java.util.stream.IntStream;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        long sum = IntStream.range(0, N).mapToLong(i -> Integer.parseInt(sc.next())).sum();
        out.println(sum - N);
        
        out.flush();
    }
}