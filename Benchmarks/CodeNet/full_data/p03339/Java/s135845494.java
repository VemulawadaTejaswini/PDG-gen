import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    final String W_STR = "W";
    final String E_STR = "E";
    final char[] W_CHAR = W_STR.toCharArray();
    final char[] E_CHAR = E_STR.toCharArray();

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int a = scanner.nextInt();
        String s = scanner.next();

        int min = a;
        String bef;
        String aft;
        String leader;

        int allLength = s.length();

        for (int i = 0;i<=(a-1);i++) {
        	bef = s.substring(0, i);
        	aft = s.substring(i+1,allLength);
        	int cnt = 0;
        	leader = s.substring(i,i+1);
        	int befLen = bef.length();
        	int aftLen = aft.length();

        	// リーダーが東⇒向いている
        	if (leader.equals(E_STR)) {
        			//手前側は西←向いている人をカウント
        			cnt += simple(bef,W_CHAR[0]);
        			//奥側は東⇒向いている人をカウント
        			cnt += simple(aft,E_CHAR[0]);
        	//　リーダーが西←を向いている
        	}else {
        			//手前側は西←を向いている
        			cnt += simple(bef,W_CHAR[0]);
        			cnt += simple(aft,E_CHAR[0]);
        	}


        	if (min >= cnt) {
        		min = cnt;
        	}
        }
        System.out.println(min);

    }

    private int simple(String str, char target) {
		// TODO 自動生成されたメソッド・スタブ
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