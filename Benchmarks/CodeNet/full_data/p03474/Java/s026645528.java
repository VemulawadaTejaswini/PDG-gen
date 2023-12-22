import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int a = in.nextInt();
        int b = in.nextInt();
        String S = in.nextLine();
        boolean hyphen = false;




        int count =0;
        for (int j =0 ; j < S.length()-1; j++ )
        {
            if(S.charAt(j)=='-')
            {
                count++;
            }
        }

        if (count == 1 && S.charAt(a)=='-')
        {
            hyphen = true;
        }

        else
            {
                System.out.println("No");
                System.exit(0);

            }

        if (hyphen == true)
        {
            if (S.length()-2 == a+b-1)
            {
                System.out.println("Yes");
            }
        }
        else
            {
                System.out.println("No");
            }


        }







    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            st = null;
            try {
                return br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}
