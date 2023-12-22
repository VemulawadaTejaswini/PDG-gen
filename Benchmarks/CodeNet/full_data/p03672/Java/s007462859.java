import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ln = br.readLine();
        String ans = getAnswerString(ln);
        System.out.println(ans.length());
    }
    
    private static String getAnswerString(String st) {
        int st_len = st.length();
        st = delOneChar(st);
        while (!isDoubled(st)) {
            st = delOneChar(st);
        }
        return st;
    }
    
    private static boolean isDoubled(String st) {
        int st_len = st.length();
        if (st_len == 1) {
            return true;
        }
        if (st_len%2 != 0) {
            return false;
        }
        int start1 = 0;
        int start2 = st_len/2;
        
        while (start1 < st_len/2) {
            char st1 = st.charAt(start1);
            char st2 = st.charAt(start2);
            if (st1 != st2) {
                return false;
            }
            start1++;
            start2++;
        }
        return true;
    }
    
    private static String delOneChar(String st) {
        return st.substring(0, st.length() - 1);
    }
}
