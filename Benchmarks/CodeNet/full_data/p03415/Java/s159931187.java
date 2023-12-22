import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String S1 = sc.next();
        String S2 = sc.next();
        String S3 = sc.next();
        sc.close();

        out.printf("%c%c%c\n", S1.charAt(0), S2.charAt(1), S3.charAt(2));
        out.flush();
    }
}
