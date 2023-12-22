import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        int int1 = Integer.parseInt(scan.next());
        int int2 = Integer.parseInt(scan.next());
        int int3 = Integer.parseInt(scan.next());
//        String str1 = scan.next();

//        String str1 = scan.next();

        int ans_int = 0;
        double ans_dob = 0;
        String ans = "";

        ans_int = int1 * int3 - int2;

        PrintWriter out = new PrintWriter(System.out);
        out.println(ans_int);
        out.flush();
        for(int i  = 1; i <10 ; i++){
            ans_int = ans_int * int1 -int2;
            out.println(ans_int);
            out.flush();
        }

        scan.close();
    }
}
