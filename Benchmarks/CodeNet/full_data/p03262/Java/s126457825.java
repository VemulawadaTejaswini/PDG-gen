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
        int target=0;
        int tmpNow;
        if(a==1) {
        	target=Math.abs(scanner.nextInt()-b);
        }else {
        	for(int i=0;i<a;i++) {
            	tmpNow=Math.abs(scanner.nextInt()-b);
            	if(i!=0) {
            		target=saidaikouyaku(target,tmpNow);
            	}else {
            		target=tmpNow;
            	}
            }
        }

        System.out.println(target);

    }

    public int saidaikouyaku(int x,int y) {
    	int tmp1;
    	int tmp2;
    	if(x>y) {
    		tmp1 = y;
    		tmp2 = x;
    	}else if(y>x){
    		tmp1 = x;
    		tmp2 = y;
    	}else {
    		return x;
    	}
    	int tmp3;
    	while ((tmp3 = tmp2 % tmp1) != 0) {
            tmp2 = tmp1;
            tmp1 = tmp3;
        }
    	return tmp1;
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
