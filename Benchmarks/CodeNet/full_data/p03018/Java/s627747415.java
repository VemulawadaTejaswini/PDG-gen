import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int N = s.length;

        int i = 0;
        long ans = 0;
        int aNum = 0;
        while (i < N) {
            if (s[i] != 'A') {
                i++;
                aNum = 0;
                continue;
            }
            while (i < N && s[i] == 'A') {
                aNum++;
                i++;
            }
            while (i < N-1 && s[i] == 'B' && s[i+1] == 'C') {
                ans += aNum;
                i += 2;
            }
        }

        System.out.println(ans);
    }
}

