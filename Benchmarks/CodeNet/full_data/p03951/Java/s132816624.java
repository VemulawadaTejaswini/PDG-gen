import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.text.DecimalFormat;
import java.util.*;




public class Main {



    public static void main(String[] args) throws Exception {
        IO io = new IO(null, null);
        int n = io.getNextInt();
        ArrayList<Long> X = new ArrayList<>(n);
        for (int i = 0;i < n;i++) X.add(io.getNextLong());
        int m = io.getNextInt();
        long K = io.getNextLong();
        int [] A = new int[m];
        for (int i = 0;i < m;i++) A[i] = io.getNextInt() - 1;

        TreeMap<ArrayList<Long>,Integer> HM = new TreeMap<>(new Comparator<ArrayList<Long>>() {
            @Override
            public int compare(ArrayList<Long> o1, ArrayList<Long> o2) {
                for (int i = 0;i < n;i++) {
                    if (o1.get(i).equals(o2.get(i))) continue;
                    else {
                        long d = o1.get(i) - o2.get(i);
                        if (d < 0) return -1;
                        else return 1;
                    }
                }
                return 0;
            }
        });
        int t = 0;
        while (!HM.containsKey(X)){
            ArrayList<Long> Y = (ArrayList<Long>)X.clone();
            HM.put(Y,t++);
            for (int a : A)
                X.set(a,X.get(a+1) + X.get(a-1) - X.get(a));
        }
        int s = HM.get(X);
        int len = t - HM.get(X);
        if (K > s)
            K = (K - s)%len + s;
        for (ArrayList<Long> x : HM.keySet())
            if (HM.get(x) == K) {
                X = x;
                break;
            }
        for (long x : X)
            io.println(x);
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
