
import java.util.*;
import java.io.*;

/**
 * @author AnonymousP
 * @__WHEN YOU FEEL LIKE QUITTING, THINK ABOUT WHY YOU STARTED__@
 */
//COMBINATON = nCr = n*(n-1)/2
public class Main{

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        String s = sc.next();
        int ans = 0;
        /*
         i=======j
         0 ----> 1,2,3 (3-0)
         1 ----> 2,3   (3-1)
         2 ----> 3     (3-2)
         (s.length()-i)
        
         s.length()==4
         i<3(s.length()-1)
         j<s.length()-i
        
        
         */
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = 1; j < s.length() - i; j++) {
                //    System.out.println(i+" "+(j));
                //HAVE A LOOK HERE COMMMENT LINE//
                //    System.out.println(i+" "+(i+j));

                if (s.charAt(i) == s.charAt(i + j)) {
                    ans++;
                }
            }
        }
        if (ans == 2) {
            out.println("Yes");
            out.flush();
        } else {
            out.println("No");
            out.flush();
        }
    }

    //************************************************************************//
//CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_CLASS_//
//*******FAST IO*************FAST IO***************FAST IO****************//
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

   //*******FAST IO*************FAST IO***************FAST IO****************//
}
