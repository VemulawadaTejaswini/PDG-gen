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
        int intans = 0;
        int odd = 0;
        int eve = 0;
            if(a%b==0){
                intans = 0;
            }else{
                intans = a%b + b - b;
            }
        PrintWriter out = new PrintWriter(System.out);
        out.println(intans);
        out.flush();
        scan.close();
    }
}