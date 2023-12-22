import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        String line = readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        Integer a = Integer.parseInt(st.nextToken());	/* 胃袋耐久期間 */
        Integer b = Integer.parseInt(st.nextToken());	/* 賞味期限期間 */

        /* 賞味期限までに食べた場合 */
        if ( (a <= 8)&&(b<=8)) {
        	System.out.println("Yay!");
        }else {
        	System.out.println(":(");
        }

    }

    private static String readLine() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}