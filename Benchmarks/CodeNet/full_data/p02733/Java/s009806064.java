import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] white = new int[h+1][w];
        for(int i = 1; i <= h; i++){
            char[] choco = sc.next().toCharArray();
            int j = 0;
            int jw = 0;
            for(char c : choco){
                white[i][j] = white[i-1][j] + (c-'0') + jw;
                if(c == '1'){
                    jw++;
                }
                j++;
            }
        }
        //printArr(white,h+1,w);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < (1 << (h-1)); i++){
            int tmp = 0;
            ArrayList<Integer> cutList = new ArrayList();
            cutList.add(h);
            for(int j = 0; j < (h-1); j++){
                if((i >> j) % 2 == 1){
                    tmp++;
                    cutList.add(h-1-j);
                }
            }
            cutList.add(0);
            //System.out.print(i + " ");
            //System.out.println(cutList);
            int[] del = new int[cutList.size()-1];
            boolean flg = true;
            for(int j = 0; j < w; j++){
                boolean devide = false;
                for(int i2 = 0; i2 < del.length; i2++){
                    int c1 = cutList.get(i2);
                    int c2 = cutList.get(i2+1);
                    if(j == 0 && white[c1][j] - white[c2][j] > k){
                        flg = false;
                        break;
                    }else if(j != 0 && white[c1][j] - white[c2][j] - white[c1][j-1] + white[c2][j-1] > k){
                        flg = false;
                        break;
                    }
                    int wc = white[c1][j] - white[c2][j] - del[i2];
                    if(wc > k){
                        devide = true;
                        break;
                    }
                }
                if(!flg) break;
                if(devide){
                    for(int i2 = 0; i2 < del.length; i2++){
                        int c1 = cutList.get(i2);
                        int c2 = cutList.get(i2+1);
                        del[i2] += white[c1][j-1] - white[c2][j-1];
                    }
                    tmp++;
                }
            }
            if(flg){
                ans = Math.min(ans,tmp);
            }
        }
        System.out.println(ans);
    }
    
    public static void printArr(int[][] arr, int h, int w){
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return;
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

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}