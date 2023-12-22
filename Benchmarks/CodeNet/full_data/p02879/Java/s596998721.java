import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        int int1 = Integer.parseInt(scan.next());
        int int2 = Integer.parseInt(scan.next());
//        int int3 = Integer.parseInt(scan.next());
//        int int4 = Integer.parseInt(scan.next());
//        double db = Double.parseDouble(scan.next());
        int ans_int = 0;
        String ans = "";
//        String temp_str1 = "";
//        String temp_str2 = "";
        int temp_int1 = 0;
//        String str1 = scan.next();
//        String str2 = scan.next();
//        String str3 = scan.next();
        ArrayList<Integer> list = new ArrayList<>();
        if(int1 <10&&int2<10){
            ans_int = int1*int2;

        }else{
            ans_int = -1;
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(ans_int);
        out.flush();
        scan.close();
    }
}