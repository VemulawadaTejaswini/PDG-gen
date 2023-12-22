// Created By Jefferson Samuel on 23/08/20 at 2:47 PM

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

class Main {


    static void solve() throws Exception {

        int N = scanInt();
        int L = scanInt();
        ArrayList<Integer> lis = new ArrayList<>();
        ArrayList<Integer> lin = new ArrayList<>();
        for(int i = 0;i<L;i++)
            lis.add(scanInt());
        for(int i = 0;i<10;i++)
            if(!lis.contains(i))
                lin.add(i);

         char k[] = Integer.toString(N).toCharArray();
         for(int j  = 0 ; j< k.length;j++)
         {
             int count = 1;
             if(!lin.contains(k[j]-'0'))
             {
                 if(count == 1)
                 {
                     for(int t : lin)
                     {
                         if(t > (k[j] - '0'))
                         {
                             k[j] = (char) ('0' + t);
                             break;
                         }
                     }
                     count++;
                 }
                 else
                 {
                     k[j] = (char)('0' +lin.get(0));
                 }

             }
         }
         out.println(new String(k));

    }




    // dont touch this side
    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        } catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}