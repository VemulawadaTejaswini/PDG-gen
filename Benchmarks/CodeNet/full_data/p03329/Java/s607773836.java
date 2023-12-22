import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int n = scanner.nextInt(); //行数
        int count = 0;

        int s[] = {1, 6, 9, 12, 18, 18, 24, 27, 30, 36, 36, 45, 54, 63, 72, 72, 81, 108, 144, 162, 180, 216, 243, 324, 405, 432, 486, 567, 648, 648, 729, 864, 1080, 1296, 1458, 2187, 2592, 2916, 3645, 3888, 4374, 5103, 5184, 5832, 6480, 6561, 7776, 13122, 15552, 19683, 23328, 26244, 31104, 32805, 38880, 39366, 45927, 46656, 52488, 59049, 93312};
        int w[] = {1, 6, 9, 36, 81, 216, 729, 1296, 6561, 7776, 46656, 59049};

        for (int j=0;j<100;j++) {
        	for (int i=0;i<100;i++) {
            	if(s[i+1]>n) {
            		n-=s[i];
            		for(int k=0;k<w.length;k++) {
            			if((s[i]/w[11-k]==1)||
            				(s[i]/w[11-k]==2)||
            				(s[i]/w[11-k]==3)||
            				(s[i]/w[11-k]==4)||
            				(s[i]/w[11-k]==5)||
            				(s[i]/w[11-k]==6)||
            				(s[i]/w[11-k]==7)||
            				(s[i]/w[11-k]==8)) {
            				count += s[i]/w[11-k];
            				break;
            			}
            		}
            		break;
            	}
            }
        	if (n==0) {
        		break;
        	}
        }
        System.out.println(count);



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