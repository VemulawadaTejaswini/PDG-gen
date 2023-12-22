import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        String strans = "";
        int intans = 0;
            if(a%b == 0){
                strans = "0";
            }else{
                strans = "1";
            }
        PrintWriter out = new PrintWriter(System.out);
        out.println(strans);
        out.flush();
        scan.close();
    }
}