import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void exec(InputStream in, PrintStream out){
        Scanner sc = new Scanner(in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = Math.max(a,b);
        int m = Math.min(a,b);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(m);
        }
        out.println(sb.toString());
    }

    public static void main(String[] args) {
        exec(System.in, System.out);
    }
}