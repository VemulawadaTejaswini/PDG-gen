import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		FastScanner f = new FastScanner(); //Replace "problem" with problem name
        
        int[] powers = {1,2,4,8,16,32,64};
        int n = f.nextInt();
        for(int i = 0; i < powers.length; i++){
        	if (n > powers[i]){
        		break;
        	}
        }
        System.out.println(i-1);
	}

	public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            st = null;
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}
