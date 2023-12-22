import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
    	int[] time = new int[5];
    	int[] sabun = new int[5];
    	int[] jun = new int[5];
    	int result=0;
        try {
        	for (int i = 0; i<5;i++ ) {
        		time[i] = sc.nextInt();
        		sabun[i] = 10-time[i]%10==10? 0:10-time[i]%10;
        	}
        	int idx=0;
        	for(int check=0;check<10;check++) {
        		//System.out.println("check:"+check);
        		for (int i=0;i<5;i++) {
        			if (sabun[i]==check) {
        				//System.out.println("sabun["+i+"] : "+sabun[i]);
        				jun[idx]=i;
        				idx++;
        			}
        		}
        	}

        	int cnt=0;
        	for (int i : jun) {
        		//System.out.println("result : "+ result);
        		if (cnt != 4) result += time[i]+sabun[i];
        		else result += time[i];
        		cnt++;
        	}
        	/*
        	for(int i=0;i<5;i++) {
        		System.out.println(time[i]+" ,"+sabun[i]+" ,"+jun[i]);
        	}*/
        	System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}