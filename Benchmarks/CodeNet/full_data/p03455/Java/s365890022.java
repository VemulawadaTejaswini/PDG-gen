import java.io.PrintWriter;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        int int1 = Integer.parseInt(scan.next());
        int int2 = Integer.parseInt(scan.next());
//        String str1 = scan.next();
//        String str2 = scan.next();
//        String str3 = scan.next();
        int ans_int = 0;
        String ans = "";
        if(((int1*int2)%2) == 0){
            ans = "Even";
        }else{
            ans = "Odd";
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
        scan.close();
    }
}
