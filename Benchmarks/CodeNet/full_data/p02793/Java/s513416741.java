import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    static int N = (int)1e9 + 7;
    public static void main(String[] args){
        MyReader mr = new MyReader();
        PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = mr.nextInt();
        int[] arr = mr.nextIntArray(n);

        BigInteger l = BigInteger.valueOf(arr[0]);

        for(int i = 1;i<n;i++){
            l = lcm(l,BigInteger.valueOf(arr[i]));
        }

        BigInteger sum = BigInteger.valueOf(0);
        for(int num : arr){
            BigInteger tmp = l.divide(BigInteger.valueOf(num));
            sum = sum.add(tmp);

        }



        System.out.println(sum.mod(BigInteger.valueOf(N)).toString());







    }

    static BigInteger lcm(BigInteger a, BigInteger b){
        BigInteger gcd = a.gcd(b);
        BigInteger mul = a.multiply(b);
        BigInteger res = mul.divide(gcd);
        return res;
    }



    static class MyReader {
        BufferedReader br;
        StringTokenizer st;

        MyReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
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
            String res = "";
            try {
                res = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return res;
        }

        int[] nextIntArray(int n){
            try{
                st = new StringTokenizer(br.readLine());
            }
            catch (Exception e){
                e.printStackTrace();
            }
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            return arr;
        }

        long[] nextLongArray(int n){
            try{
                st = new StringTokenizer(br.readLine());
            }
            catch (Exception e){
                e.printStackTrace();
            }
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            return arr;
        }

        String[] nextStringArray(int n){
            String res = "";
            try{
                res = br.readLine();
            }
            catch (Exception e){
                e.printStackTrace();
            }

            String[] arr = res.split(" ");
            return arr;
        }
    }

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}


