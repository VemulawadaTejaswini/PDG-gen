import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int a = scanner.nextInt();

        int[] sosuu = {3 ,5 ,7 ,11 ,13};
        /*
         * 3,5,7  = 105 #3,5,7,15,21,35
         * 3,3,3,5= 135 #3,5,9,15,27,45
         * 3,3,5,5= 225 X
         * 3,5,11 = 165 #3,5,11,15,33,55
         * 3,5,13 = 195 #3,5,13,15,39,65
         * 5,7,11 = 385 X
         */

        if (a < 105) {
        	System.out.println(0);
        }else if(a < 135) {
        	System.out.println(1);
        }else if(a < 165) {
        	System.out.println(2);
        }else if(a < 195) {
        	System.out.println(3);
        }else {
        	System.out.println(4);
        }

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