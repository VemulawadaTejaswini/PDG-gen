//https://atcoder.jp/contests/abc162/tasks/abc162_d


import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(in.nextLine());
        String S = in.nextLine();

        int rCount = 0, gCount = 0, bCount = 0;
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'R') rCount++;
            else if (S.charAt(i) == 'G') gCount++;
            else bCount++;
        }

        int anti =0;
        for (int i = 0; i < S.length() -2; i++) {
            for (int j = i+1; j < S.length() -1; j++) {
                int k = 2 * j - i;
                if(k >= S.length()) continue;

                if(S.charAt(i) != S.charAt(j) && S.charAt(k) != S.charAt(j) & S.charAt(i) != S.charAt(k)) anti++;


            }
        }


        out.println(rCount * gCount * bCount - anti);





        in.close();
        out.close();
    }
}
