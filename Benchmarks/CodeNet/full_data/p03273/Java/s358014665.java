import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String strTmp;
        List<Integer> ignoreRow = new ArrayList<Integer>();
        List<Integer> ignoreCol = new ArrayList<Integer>();

        String[][] input = new String[a][b];
        for (int i=0;i<a;i++) {
        	strTmp = scanner.next();
        	input[i] = strTmp.split("");
        	if(!strTmp.contains("#")) {
        		ignoreRow.add(i);
        	}
        }
        for (int j=0;j<b;j++) {
        	strTmp = "";
        	for (int k=0;k<a;k++){
        		strTmp += input[k][j].toString();
        	}
        	if(!strTmp.contains("#")) {
        		ignoreCol.add(j);
        	}
        }
        for (int l=0;l<a;l++) {
        	strTmp = "";
        	if (ignoreRow.contains(l)) {
        		continue;
        	}
        	for (int m=0;m<b;m++) {
        		if(!ignoreCol.contains(m)) {
        			strTmp += input[l][m].toString();
        		}
        	}
        	System.out.println(strTmp);
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