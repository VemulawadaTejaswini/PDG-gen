import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
       FastReader s = new FastReader();
        int N = s.nextInt();
        String s1=s.next();
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    if((s1.charAt(i)!=s1.charAt(j))&&(s1.charAt(k)!=s1.charAt(j))&&(s1.charAt(i)!=s1.charAt(k))&&(2*j!=i+k))
                        sum+=1;
                }
            }
        }
        System.out.println(sum);
    }

    private static boolean isPrime(int n) {
        if (n == 2)
            return true;
        else if ((n % 2 == 0 && n > 2) || n < 2)
            return false;
        else {
            for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }


    }

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

}