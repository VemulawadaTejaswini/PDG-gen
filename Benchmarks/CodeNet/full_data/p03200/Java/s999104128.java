import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        char[] cArray = S.toCharArray();

        long weight = 0;
	long cnt = 0;
	for(int i = N-1; i>=0; i--) {
            if(cArray[i] == 'W') weight++;
            if(cArray[i] == 'B') cnt = cnt + weight;
        }

	System.out.println(cnt);
    }
}