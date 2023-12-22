import java.io.*;

/**
 * Created by Ayushi on 22 Mar 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String a = buffer.readLine();
        int n = a.length();
        buffer.close();

        String ar = new StringBuilder(a).reverse().toString();
        String b = a.substring(0, (n-1)/2);
        String br = new StringBuffer(b).reverse().toString();
        String c = a.substring(((n+3)/2)-1, n);
        String cr = new StringBuffer(c).reverse().toString();

        if (a.equals(ar) && b.equals(br) && c.equals(cr)) System.out.println("Yes");
        else System.out.println("No");
    }
}
