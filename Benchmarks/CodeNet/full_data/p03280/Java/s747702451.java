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
        intans = a*b - (a+b-1);

        PrintWriter out = new PrintWriter(System.out);
        out.println(intans);
        out.flush();
        scan.close();
    }
}