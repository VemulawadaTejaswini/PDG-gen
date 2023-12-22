import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by hikigineer on 2017/03/04.
 */
public class Main {
    static Scanner in;
    static PrintWriter out;
    static String INPUT = "";

    public static void main(String[] args) throws Exception
    {
        in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
        out = new PrintWriter(System.out);
        String O = in.next();
        String E = in.next();

        int i;
        String result = "";
        for(i = 0; i < E.length(); i++)
            result += String.valueOf(O.charAt(i)) + String.valueOf(E.charAt(i));
        if(O.length() - E.length() == 1)
            result += String.valueOf(O.charAt(i));
        out.println(result);
        out.flush();
    }

}