import java.io.*;

public class Main {

    static InputReader in = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    //static Scanner in = new Scanner(new BufferedInputStream(System.in));

    /**
     * @param args
     * @throws IOException
     */

    static int n;
    static int[] a=new int[500000];

    public static void main(String[] args) throws IOException {

        n=in.nextInt();
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }

        int count1=0,count2=0,now=1;
        for(int i=0;i<n;i++){
            if(a[i]==now){
                count1++;
                now++;
            }
        }
        now=n;
        for(int i=n-1;i>=0;i--){
            if(a[i]==now){
                count2++;
                now--;
            }
        }

        if(count1>count2){
            out.print(n-count1);
        }else{
            out.print(n-count2);
        }

        out.close();
    }

    static class InputReader {

        BufferedReader br;

        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
        }

        public int nextInt() throws IOException {
            int c = br.read();
            while (c <= 32) {
                c = br.read();
            }
            boolean negative = false;
            if (c == '-') {
                negative = true;
                c = br.read();
            }
            int x = 0;
            while (c > 32) {
                x = x * 10 + c - '0';
                c = br.read();
            }
            return negative ? -x : x;
        }

        public long nextLong() throws IOException {
            int c = br.read();
            while (c <= 32) {
                c = br.read();
            }
            boolean negative = false;
            if (c == '-') {
                negative = true;
                c = br.read();
            }
            long x = 0;
            while (c > 32) {
                x = x * 10 + c - '0';
                c = br.read();
            }
            return negative ? -x : x;
        }

        public String next() throws IOException {
            int c = br.read();
            while (c <= 32) {
                c = br.read();
            }
            StringBuilder sb = new StringBuilder();
            while (c > 32) {
                sb.append((char) c);
                c = br.read();
            }
            return sb.toString();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

    }

}
