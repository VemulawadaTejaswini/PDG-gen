

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		int nReq = Reader.nextInt();
		int len = Reader.nextInt();
		int cntB[][] = new int[len][len];
		int cntW[][] = new int[len][len];
		for(int i = 0; i < nReq; i++) {
			int x = Reader.nextInt();
			int y = Reader.nextInt();
			char ch = Reader.next().charAt(0);
			int rx = (x / len) % 2;
			int ry = (y / len) % 2;
			if( (ch == 'B' && (rx + ry) % 2 == 0) ||
				((ch == 'W') && (rx + ry) % 2 == 1) ){
				cntB[x % len][y % len]++;
			}
			else if( (ch == 'W' && (rx + ry) % 2 == 0) || 
					(ch == 'B' && (rx + ry) % 2 == 1) ){
				cntW[x % len][y % len]++;
			}
		}

		int[][] dpW = new int[len][len];
		int[][] dpB = new int[len][len];
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				dpW[i][j] = (i == 0 ? 0 : dpW[i - 1][j]) + 
						(j == 0 ? 0 : dpW[i][j - 1]) - 
						( (i == 0 || j == 0) ? 0 : dpW[i - 1][j - 1]) + 
						cntW[i][j];
				dpB[i][j] = (i == 0 ? 0 : dpB[i - 1][j]) + 
						(j == 0 ? 0 : dpB[i][j - 1]) - 
						( (i == 0 || j == 0) ? 0 : dpB[i - 1][j - 1])
						+ cntB[i][j];
			}
		}
//		for(int i = 0; i < len; i++) {
//			for(int j = 0; j < len; j++)
//				System.out.print("" + dpW[i][j] + " ");
//			System.out.println();
//		}
		int ans = 0;
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				int amo = 0;
				amo = dpB[i][j] + dpW[len - 1][len - 1] - dpW[i][j];
				if(amo > ans)
					ans = amo;
				amo = dpW[i][j] + dpB[len - 1][len - 1] - dpB[i][j];
				if(amo > ans)
					ans = amo;
			}
		}
		System.out.println(ans);
	}

}

/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
    public static void main(String[] args) {
    	
    }
}