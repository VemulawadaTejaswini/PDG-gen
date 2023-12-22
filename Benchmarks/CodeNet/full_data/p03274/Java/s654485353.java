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
        int b = scanner.nextInt();
        int lange = 0;
        int max = 0;
        int min = 0;
        int tmpMin = 0;
        int trueMin = 0;

        Integer[] input = new Integer[a];
        for (int i=0;i<a;i++) {
        	input[i] = scanner.nextInt();
        }


        for (int j=0;j<a-b+1;j++) {
        	lange = input[b-1+j] - input[j];
    		min = input[j];
    		max = input[b-1+j];

    		if (min>=0) {
    			tmpMin = lange + min;
            }else if(max < 0) {
            	tmpMin = lange + Math.abs(max);
            }else {
            	tmpMin = lange + Math.min(max, Math.abs(min));
            }
    		if(j==0) {
    			trueMin = tmpMin;
    		}else {
    			if(trueMin>tmpMin) {
    				trueMin = tmpMin;
    			}
    		}
        }
        System.out.println(trueMin);

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