        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;
public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        String str1 = scan.next();
        int ans_int = 0;
        double ans_dob = 0;
        String ans = "";
        if(str1.charAt(0) == '1'){
            ans_int += 1;
        }
        if(str1.charAt(1) == '1'){
            ans_int += 1;
        }
        if(str1.charAt(2) == '1'){
            ans_int += 1;
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans_int);
        out.flush();
        scan.close();
    }
}
