import java.io.*;
import java.util.StringTokenizer;

public final class Main{
    public static void main(String[] args){
        FastScanner stdIn = new FastScanner(System.in);
        
        int n = (int)stdIn.nextInt();
        long[] a = new long[n];
        for(int i=0; i<a.length; i++){
            a[i] = stdIn.nextLong();
        }

        if(n%3 == 0){
            int [] counter = new int[30];
            for(int i=0; i<a.length; i++){
                for(int j=30; j>0; j--){
                    if(a[i] >= twoD(j)){
                        a[i] -= twoD(j);
                        counter[j-1]++;
                    }
                }
            }
            for(int i=0; i<counter.length; i++){
                if(counter[i] != 0 && counter[i] != 2 * n / 3){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
            return;
        }else{
            for(int i=0; i<a.length; i++){
                if(a[i] != 0){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
            return;
        }
    }

    static long twoD(int n){
        long num = 1;
        for(int i=0; i<n; i++){
            num*=2;
        }
        return num;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }
    
    public long nextInt() {
        return Integer.parseInt(next());
    }

}
