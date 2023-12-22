


import java.io.*;
import java.util.*;

public class A {
    String filename = "";

    final int INF = 1_000_000_000;

    void solve() {
        char[] a = readString().toCharArray();
        Arrays.sort(a);
        out.print(a[0] == a[1] && a[2] == a[3] ? "Yes" : "No");
    }

    public static void main(String[] args) throws FileNotFoundException {
        new A().run();
    }
    void run() throws FileNotFoundException {
        init();
        solve();
        out.close();
    }
    BufferedReader in;
    PrintWriter out;

    StringTokenizer tok = new StringTokenizer("");

    void init() throws FileNotFoundException {
        if(!filename.equals("")) {
            in = new BufferedReader(new FileReader(new File(filename + ".in")));
            out = new PrintWriter(new File(filename + ".out"));
            return;
        }

        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
    }

    String readLine(){
        try{
            return in.readLine();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    String readString(){
        while(!tok.hasMoreTokens()){
            String nextLine = readLine();
            if(nextLine == null) return null;
            tok = new StringTokenizer(nextLine);
        }
        return tok.nextToken();
    }

    int readInt(){
        return Integer.parseInt(readString());
    }
    long readLong(){
        return Long.parseLong(readString());
    }
    int[] readIntArray(int n){
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = readInt();
        }
        return a;
    }
    int[] castInt(List<Integer> list){
        int[] a = new int[list.size()];
        for(int i = 0;i<a.length;i++){
            a[i] = list.get(i);
        }
        return a;
    }
}