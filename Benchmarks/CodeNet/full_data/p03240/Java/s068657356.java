import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int n = scanner.nextInt();
        if(n>=2) {
        	int x1 = scanner.nextInt();
        	int y1 = scanner.nextInt();
        	int h1 = scanner.nextInt();
        	int x2 = scanner.nextInt();
        	int y2 = scanner.nextInt();
        	int h2 = scanner.nextInt();
        	HashSet<String> tmpSet = new HashSet<String>();
        	String[] tmptmp = new String[2];

        	for(int cx=0;cx<=100;cx++) {
        		for(int cy=0;cy<=100;cy++) {
        			if((Math.abs(x1-cx)+Math.abs(y1-cy)+h1)==(Math.abs(x2-cx)+Math.abs(y2-cy)+h2)) {
        				tmpSet.add(String.valueOf(cx)+"-"+String.valueOf(cy));
        			}
        		}
        	}
        	if(n>=3) {
        		int tmpx;
        		int tmpy;
        		int tmph;
        		int tmpcx;
        		int tmpcy;

        		HashSet<String> tmpSet2 = new HashSet<String>();
        		for(int i=0;i<n-2;i++) {
        			tmpx = scanner.nextInt();
        			tmpy = scanner.nextInt();
        			tmph = scanner.nextInt();
        			for (String entry:tmpSet) {
        				tmptmp =entry.split("-");
        				tmpcx = Integer.parseInt(tmptmp[0]);
        				tmpcy = Integer.parseInt(tmptmp[1]);
        				if((Math.abs(x1-tmpcx)+Math.abs(y1-tmpcy)+h1)==(Math.abs(tmpx-tmpcx)+Math.abs(tmpy-tmpcy)+tmph)) {
        					tmpSet2.add(entry);
        				}
        			}
        			tmpSet=tmpSet2;
        			tmpSet2 = new HashSet<String>();
        		}
        	}
        	for (String entry:tmpSet) {
        		tmptmp =entry.split("-");
        		System.out.println(Integer.parseInt(tmptmp[0])+" "+Integer.parseInt(tmptmp[1])+" "+(Math.abs(x1-Integer.parseInt(tmptmp[0]))+Math.abs(y1-Integer.parseInt(tmptmp[1]))+h1));
        	}

        }else {
        	int x1 = scanner.nextInt();
        	int y1 = scanner.nextInt();
        	int h1 = scanner.nextInt();
        	System.out.println(x1+" "+y1+" "+h1);
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