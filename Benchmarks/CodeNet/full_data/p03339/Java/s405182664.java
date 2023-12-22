import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    final static String W_STR = "W";
    final static String E_STR = "E";
    final static char W_CHAR2 = 'W';
    final static char E_CHAR2 = 'E';

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int a = scanner.nextInt();
        String s = scanner.next();

        int min = a;
        String bef;
        String aft;

        int allLength = s.length();
        int cnt = 0;

        for (int i = 0;i<=(a-1);i++) {
        	bef = s.substring(0, i);
        	aft = s.substring(i+1,allLength);
        	cnt = 0;

        	//手前側は西←向いている人をカウント
        	cnt += simple(bef,W_CHAR2);
        	cnt += simple(aft,E_CHAR2);
        	if (min >= cnt) {
        		min = cnt;
        	}
        }
        System.out.println(min);

    }

    private static int simple(String str, char target) {
    	int count = 0;
    	for(char x: str.toCharArray()){
    		if(x == target){
    			count++;
    		}
    	}
    	return count;
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