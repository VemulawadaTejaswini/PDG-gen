
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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
    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;

        while (i < j)
        {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[])
    {
        FastReader obj = new FastReader();
        StringBuffer str = new StringBuffer(obj.next());
        int left = (str.length()-1)/2,right = (str.length()+3)/2;
        if(isPalindrome(str.toString()))
        {
            if(isPalindrome(str.substring(0,left)))
            {
                if(isPalindrome(str.substring(right-1,str.length())))
                {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
