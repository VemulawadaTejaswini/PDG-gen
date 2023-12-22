import java.io.*;
import java.util.StringTokenizer;

public final class Main{
    public static void main(String[] args){
        java.util.Scanner stdIn = new java.util.Scanner(System.in);
        
        long n = stdIn.nextLong();
        double[] v = new double[(int)n];
        for(int i=0; i<v.length; i++){
            v[i] = stdIn.nextDouble();
        }

        Union union = new Union((int)n);
        
        for(int num=0; num<((int)n)-1; num++){
            int minVal = 10000;
            int minIdx = 0;
            for(int i=0; i<v.length; i++){
                if(minVal>v[i]){
                    minVal = (int)v[i];
                    minIdx = i;
                }
            }
            int secondVal = 10000;
            int secondIdx = 0;
            for(int i=0; i<v.length; i++){
                if(secondVal>v[i] && minIdx != i){
                    secondVal = (int)v[i];
                    secondIdx = i;
                }
            }
    
            double temp = (v[minIdx] + v[secondIdx]) / 2.0;
            v[minIdx] = temp;
            v[secondIdx] = 1000000;
    
            union.add(minIdx, secondIdx);
        }
        System.out.println(v[union.pare(1)]);
    }
}

class Union{
    int[] dis;
    public Union(int n){
        dis = new int[n];
        for(int i=0; i<dis.length; i++){
            dis[i] = i;
        }
    }

    public void add(int a, int b){
        dis[b] = a;
    }

    public int pare(int a){
        int idx = a;
        while(dis[idx] != idx){
            idx = dis[idx];
        }
        return idx;
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
