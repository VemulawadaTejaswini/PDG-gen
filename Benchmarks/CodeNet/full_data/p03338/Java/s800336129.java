import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int a = scanner.nextInt();
        String s = scanner.next();

        int max = 0;
        String bef;
        String aft;

        for (int i = 0;i<a;i++) {
        	bef = s.substring(0, i+1);
        	aft = s.substring(i+1,s.length());
        	int cnt = 0;

        	String[] bef2 = bef.split("");
        	Set<String> hash_set = new HashSet<String>();
        	/*
        	for(String tmp : bef2) {
        		hash_set.add(tmp);
        	}
        	*/
        	for(int j=0;j<bef2.length;j++) {
        		hash_set.add(bef2[j]);
        	}
        	/*
        	for(String tmp : hash_set){
        		if(aft.contains(tmp)) {
        			cnt++;
        		}
        	}
        	*/
        	Iterator<String> iterator = hash_set.iterator();
        	for (int k=0;k<hash_set.size();k++) {
        		if(aft.contains(iterator.next())) {
        			cnt++;
        		}
        	}
        	if (cnt >= max) {
        		max = cnt;
        	}
        }
        System.out.println(max);

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
