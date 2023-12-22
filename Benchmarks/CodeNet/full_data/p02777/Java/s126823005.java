import java.util.*;
import java.io.* ;
/*
NOTES:
-more than 10 digits (10^10), use long
-prefix sum of 1's and -1's to control flow of highlighting a region
-log(a)/log(b) = log base b of a
-create a position array if trying to see if elements show up next to each other sequentially
 i.e. elements 1,2,3 are within 3 spots of each other in an array
      arr[scannedInt - 1] = i; (position of i at p[i] in original)
- use a freq array when counting instances of an element occurring
- increment the counter first before simulating anything turn-based (two player game)

 */

public class Main {
    static long mod = (long)(Math.pow(10, 9) + 7);
    public static String alpha = "zabcdefghijklmnopqrstuvwxy";
    public static void main(String[] args) throws IOException{
        FastReader in = new FastReader();
        long t= 1;
        while (t-- > 0) {
            String s = in.next();
            String p = in.next();
            int a = in.nextInt();
            int b = in.nextInt();
            String u = in.next();
            if(u.equals(s)) System.out.println((a-1)+" "+b);
            else if (u.equals(p)) System.out.println((a)+" "+(b-1));
            else System.out.println(a+" "+b);



        }

    }

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
                }
                catch (IOException  e) { e.printStackTrace();
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

    static ArrayList sieve(){
        ArrayList<Integer> primes = new ArrayList<>();
        int size = 1000001;
        int[] arr = new int[size+1];
        for(int i = 2; i*i<=size; i++){
            if(arr[i] == 0 && (long) (i*i)<=size)
                for(int pp = i*i; pp<=size; pp+=i) arr[pp]++;
        }
        for(int i = 2; i<=size; i++){
            if(arr[i]==0) primes.add(i);
        }
        return primes;
    }


    static boolean isPalindrome(String s){
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }

    static ArrayList factors(long n ){
        ArrayList<Long> facts = new ArrayList<>();
        for(int i = 1; i<=(int)Math.sqrt(n); i++){
            if(n%i == 0){
                if( i == Math.sqrt(n)) facts.add((long)i);
                else{
                    facts.add((long)i);
                    facts.add(n/i);
                }
            }
        }
        Collections.sort(facts);
        return facts;
    }

    static boolean isPrime (int n){
        if(factors(n).size() ==2) return true;
        else return false;
    }





    static long GCD(long a, long b) {
        // Everything divides 0
        if (a == 0) return b;
        if (b == 0) return a;

        // base case
        if (a == b) return a;

        // a is greater
        if (a > b) return GCD(a-b, b);
        return GCD(a, b-a);
    }
    static long LCM(long a, long b){
        return (a*b)/(GCD(a,b));
    }
    static String rev(String s){
        char[] arr = s.toCharArray();
        for(int i = 0; i<(s.length()+1)/2; i++){
            char temp = arr[i];
            arr[i] = arr[s.length()-i-1];
            arr[s.length()-i-1] = temp;
        }
        String fin = new String(arr);
        return fin;
    }
    static long pow(long a, long N) {
        if (N == 0) return 1;
        else if (N == 1) return a;
        else {
            long R = pow(a,N/2);
            if (N % 2 == 0) {
                return R*R;
            }
            else {
                return R*R*a;
            }
        }
    }

    static long powMod(long a, long N) {
        if (N == 0) return 1;
        else if (N == 1) return a % mod;
        else {
            long R = powMod(a,N/2) % mod;
            R *= R;
            R %= mod;
            if (N % 2 == 1) {
                R *= a;
                R %= mod;
            }
            return R % mod;
        }
    }

}