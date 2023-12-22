import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class MyScanner {
    BufferedReader br;

    MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int intLine() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public String line() throws IOException {
        return br.readLine();
    }

    public int[] intArray() throws IOException {
        String[] in = br.readLine().split(" ");
        int n = in.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            res[i] = Integer.parseInt(in[i]);
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        MyScanner sc = new MyScanner();

        int[] nd = sc.intArray();
        int n = nd[0];
        int d = nd[1];
        int[][] x = new int[n][d];
        for(int i = 0; i < n; i++) {
            x[i] = sc.intArray();
        }
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int d = Integer.parseInt(in[1]);
        int[][] x = new int[n][d];
        for(int i = 0; i < n; i++) {
            in = br.readLine().split(" ");
            for(int j = 0; j < d; j++) {
                x[i][j] = Integer.parseInt(in[j]);
            }
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int d2 = 0;
                for(int k = 0; k < d; k++) {
                    d2 += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
                }
                boolean flag = false;
                for(int k = 1; k <= d2; k++) {
                    if(k * k == d2) {
                        flag = true;
                        break;
                    }
                }
                if(flag) ans++;
            }
        }

        System.out.println(ans);
        //sc.br.close();
    }
}