
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.text.DecimalFormat;
import java.util.*;




public class Main {
    private static final int mod = 1000000007;
    private static int K;
    private static int [] A;

    private static long f(long n){
        for(int x : A)
            n -= n%x;
        return n ;
    }

    public static void main(String[] args) throws Exception{
        IO io = new IO(null,null);
        K = io.getNextInt();
        A = new int[K];
        for (int i = 0;i < K;i++)
            A[i] = io.getNextInt();

        if (f(Long.MAX_VALUE) < 2) io.println(-1);
        else {
            long s = 2,e = Long.MAX_VALUE;
            while (s < e) {
                long m = s + (e-s)/2;
                if (f(m) >= 2) e = m;
                else s = m + 1;
            }
            long l = s;
            if (f(l) != 2) {
                io.println(-1);
                io.close();
                System.exit(0);
            }
            e = Long.MAX_VALUE;
            while (s < e) {
                long m = s + (e-s+1)/2;
                if (f(m) == 2) s = m;
                else e = m-1;
            }
            io.println(l + " " + e);
        }
        io.close();
    }
}



class IO{
    private BufferedReader br;
    private StringTokenizer st;
    private PrintWriter writer;
    private String inputFile,outputFile;

    public boolean hasMore() throws IOException{
        if(st != null && st.hasMoreTokens()) return true;
        if(br != null && br.ready()) return true;
        return false;
    }
    public String getNext() throws FileNotFoundException, IOException{
        while(st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public String getNextLine() throws FileNotFoundException, IOException{
        return br.readLine().trim();
    }

    public int getNextInt() throws FileNotFoundException, IOException{
        return Integer.parseInt(getNext());
    }
    public long getNextLong() throws FileNotFoundException, IOException{
        return Long.parseLong(getNext());
    }

    public void print(double x,int num_digits) throws  IOException{
        writer.printf("%." + num_digits + "f" ,x);
    }
    public void println(double x,int num_digits) throws  IOException{
        writer.printf("%." + num_digits + "f\n" ,x);
    }
    public void print(Object o) throws  IOException{
        writer.print(o.toString());
    }

    public void println(Object o) throws  IOException{
        writer.println(o.toString());
    }
    public IO(String x,String y) throws FileNotFoundException, IOException{
        inputFile = x;
        outputFile = y;
        if(x != null) br = new BufferedReader(new FileReader(inputFile));
        else br = new BufferedReader(new InputStreamReader(System.in));
        if(y != null) writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
        else writer = new PrintWriter(new OutputStreamWriter(System.out));
    }

    protected void close() throws IOException{
        br.close();
        writer.close();
    }
    public void outputArr(Object [] A) throws IOException{
        int L = A.length;
        for (int i = 0;i < L;i++) {
            if(i > 0) writer.print(" ");
            writer.print(A[i]);
        }
        writer.print("\n");
    }
}
