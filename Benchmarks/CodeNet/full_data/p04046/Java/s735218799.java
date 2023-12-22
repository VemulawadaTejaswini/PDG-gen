import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private static PrintWriter out;

    private static <T> void mprintln(T ... ar){
        for(T i: ar) out.print(i + " ");
        out.println();
    }

    public static void main(String[] args) throws FileNotFoundException{

        // Input from file
        // File inputFile = new File("JavaFile.txt");
        // File outputFile = new File("JavaOutputFile.txt");
        // FileReader fileReader = new FileReader(inputFile);
        // Here it ends

        MyScanner sc = new MyScanner();
        // MyScanner sc = new MyScanner(fileReader);

        out = new PrintWriter(new BufferedOutputStream(System.out)); // Output to console
        // out = new PrintWriter(new PrintStream(outputFile)); // Output to file

        getAns(sc);

        out.close();
    }

    /*
     *Don't use builtin function (Math.ceil)
     */

    static final long MOD = (long) (1e9 + 7);
    static long[] fact, inv, factInv;

    private static void getAns(MyScanner sc){
        long h = sc.nl(), w = sc.nl(), a = sc.nl(), b = sc.nl();
        long ans = 0;

        fact = new long[(int) 3e5];
        inv = new long[(int) 3e5];
        factInv = new long[(int) 3e5];
        fact[0] = inv[0] = factInv[0] = 1;

        for(int i = 1; i < 3e5; i++){
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = modPow(i, MOD - 2, MOD);
            factInv[i] = factInv[i - 1] * inv[i] % MOD;
        }

//        Arrays.stream(fact).limit(10).forEach(k -> out.print(k + " ")); out.println();
//        Arrays.stream(inv).limit(10).forEach(k -> out.print(k + " ")); out.println();
//        Arrays.stream(factInv).limit(10).forEach(k -> out.print(k + " ")); out.println();

        for(int i = 0; i < h - a; i++){
            ans += nCr(i + b - 1, i) * nCr((h - i - 1) + (w - b - 1),  h - i - 1);
            ans %= MOD;
        }

        out.println(ans);
    }

    private static long modPow(long x, long y, long mod) {
        long res = 1;
        while(y > 0){
            if(y % 2 == 1)
                res = (res * x) % mod;

            y >>= 1;
            x = (x * x) % mod;
        }

        return res;
    }

    private static long nCr(long n, long r) {
        if(n - r < 0 || r < 0) return 0;
        return fact[(int) n] * factInv[(int) r] % MOD * factInv[(int) (n - r)] % MOD;
    }

    static class MyScanner{
        BufferedReader br;
        StringTokenizer st;

        MyScanner(FileReader fileReader){
            br = new BufferedReader(fileReader);
        }

        MyScanner(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nn(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine(){
            String ans = "";
            try {
                ans = br.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ans;
        }

        char nc(){
            return nn().charAt(0);
        }

        int ni(){
            return Integer.parseInt(nn());
        }

        long nl(){
            return Long.parseLong(nn());
        }

        double nd(){
            return Double.parseDouble(nn());
        }

        int[] niArr0(int n){
            int[] ar = new int[n];
            for(int i = 0; i < n; i++) ar[i] = ni();
            return ar;
        }

        int[] niArr1(int n){
            int[] ar = new int[n + 1];
            for(int i = 1; i <= n; i++) ar[i] = ni();
            return ar;
        }

        long[] nlArr0(int n){
            long[] ar = new long[n];
            for(int i = 0; i < n; i++) ar[i] = nl();
            return ar;
        }

        long[] nlArr1(int n){
            long[] ar = new long[n + 1];
            for(int i = 1; i <= n; i++) ar[i] = nl();
            return ar;
        }
    }
}