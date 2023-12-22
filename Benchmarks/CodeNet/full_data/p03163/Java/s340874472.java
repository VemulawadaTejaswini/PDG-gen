import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
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

    static  class Item{
        int weight;
        long value;

        public Item(int weight, long value) {
            this.weight = weight;
            this.value = value;
        }
    }

    public static void main(String[] args) {

    FastReader sc = new FastReader();

    int n = sc.nextInt();
    int w = sc.nextInt();

    Item ap[] = new Item[n+1];
    ap[0] = new Item(0,0);
    for(int i=1; i<n+1; i++){
        ap[i] = new Item(sc.nextInt(), sc.nextLong());
    }

    long table[][] = new long[n+1][w+1];

    for(int i=0; i<n+1; i++){
        for(int j=0; j<w+1; j++){
            if(i==0 || j==0){
                table[i][j] = 0;
            }else if(ap[i].weight<=j){
                table[i][j] = Math.max(ap[i].value+table[i-1][j-ap[i].weight],table[i-1][j]);
            }else{
                table[i][j] = table[i-1][j];
            }

        }
    }
    System.out.println(table[n][w]);

    }

}
