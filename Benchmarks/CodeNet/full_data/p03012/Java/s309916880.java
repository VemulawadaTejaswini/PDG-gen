import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();

        int n = scanner.nextInt();
        int sum = 0;
        int tmp = 0;
        int[] intArray = new int[n];

        for(int i = 0; i < n; i++) {
        	tmp = scanner.nextInt();
        	intArray[i] = tmp;
        	sum += tmp;
        }

        tmp = 100*n; // 初期値で最大の重さをセット
        int tmp2 = 0;

        for(int j = 0; j < n-1; j++) {
        	tmp2 += intArray[j];
        	if(Math.abs(sum-tmp2-tmp2) < tmp) {
        		tmp = Math.abs(sum-tmp2-tmp2);
        	}
        }

        System.out.println(tmp);


    }

    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";
        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public String next() {
            try {
                if (i < s.length) return s[i++];
                String line = br.readLine();
                while (line.equals("")) {line = br.readLine();}
                s = line.split(reg, 0);
                i = 0;return s[i++];
            } catch (Exception e) {e.printStackTrace();}
            return null;
        }
        public int nextInt() {
            try {return Integer.parseInt(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public double nextDouble() {
            try {return Double.parseDouble(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public long nextLong()  {
            try {return Long.parseLong(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
    }
}