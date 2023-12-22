import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double K = scanner.nextDouble();

        Double sum1,sum2,sum3;
        sum1 = A * Math.pow(2,K) + B + C;
        sum2 = A + B * Math.pow(2,K) + C;
        sum3 = A + B + C * Math.pow(2,K);
        int answer = 0;
        if ((sum1 >= sum2)&&(sum1 >= sum3)) {
        	answer = sum1.intValue();
        }else if ((sum2 >= sum1)&&(sum2 >= sum3)) {
        	answer = sum2.intValue();
        }else if ((sum3 >= sum2)&&(sum3 >= sum1)) {
        	answer = sum3.intValue();
        }
        System.out.println(String.valueOf(answer));

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