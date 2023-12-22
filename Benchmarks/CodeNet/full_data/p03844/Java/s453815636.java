import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int a = in.nextInt();
        String o = in.next();
        int b = in.nextInt();
        if (o.charAt(0)=='+')
            System.out.println(a+b);
        else
            System.out.println(a-b);


    }
}