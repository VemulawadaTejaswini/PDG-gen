import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int len;
    static boolean ans = false;
    static String line1, line2;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        line1 = br.readLine();
        line2 = br.readLine();
        len = line1.length();
        //boolean ans = false;
        //boolean next = false;
        int x = 0;
        int index1, index2;
        for (int i = 0; i < line1.length(); i++) {
            for (int j = 0; j < line2.length(); j++) {
                if (line1.charAt(i) == line2.charAt(j)) {
                    check(i, j);
                }
                
            }
        }
        System.out.println(ans?"Yes":"No");
    }
    
    public static void check(int i, int j) {
        int count = 0;
        while (true) {
            if (i >= len) i -= len;
            if (j >= len) j -= len;
            if (line1.charAt(i) == line2.charAt(j)) {
                i++;
                j++;
                count++;
                if (count == len) {
                    ans = true;
                    return;
                }
                continue;
            }
            else break;
        }
    }
}
