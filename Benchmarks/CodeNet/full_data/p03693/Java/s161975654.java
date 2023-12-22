package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class Gayle1_1 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String checkString = in.next();
        for (int ii=0;ii<checkString.length();ii++) {
            String chkchr = checkString.substring(ii,ii+1);
            if (checkString.indexOf(chkchr.charAt(0))!=ii) {
                out.print("exist");
                return;
            }
        }
        out.print("not exist");
        return;
    }
}
