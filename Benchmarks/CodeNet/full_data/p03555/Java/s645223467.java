//package Contest077;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
            String str1 = sc.next();
            String str2 = sc.next();
            StringBuilder sb = new StringBuilder(str1);
            sb = sb.reverse();
            str1 = sb.toString();
            if(str1.equals(str2))
                out.println("YES");
            else
                out.println("NO");

        out.flush();
    }
}
