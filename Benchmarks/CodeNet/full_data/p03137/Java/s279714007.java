import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();

        int koma = scanner.nextInt();
        int zahyou = scanner.nextInt();

        int[] zahyou_array = new int[zahyou];
        for(int i = 0;i<zahyou;i++) {
        	zahyou_array[i] = scanner.nextInt();
        }

        Arrays.sort(zahyou_array);

        int[] dist_array = new int[zahyou-1];
        int tmp = 0;
        for(int j=0;j<zahyou;j++) {
        	if(j!=0) {
        		dist_array[j-1] = zahyou_array[j] - tmp;
        	}
        	tmp = zahyou_array[j];
        }

        Arrays.sort(dist_array);

        int sum = 0;
        for(int k=0;k<((zahyou-1)-(koma-1));k++) {
        	sum+=dist_array[k];
        }

        System.out.println(sum);

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