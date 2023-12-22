import java.util.*;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();
    	String[] S = new String[N];
    	long ans = 0L;
    	int[] c_s = new int['z'+1];
    	int[] c_t = new int['z'+1];


    	for (int i = 0; i < N; i++)
    		S[i] = sc.next();

    	for (int i = 0; i < N; i++) {
    		for (int j = i+1; j < N; j++) {

    			Arrays.fill(c_s, 0);
    			Arrays.fill(c_t, 0);

    			String s = S[i];
    			String t = S[j];
    			if (s.equals(t))
    				continue;
 				
 				for (int k = 0; k < 10; k++) {
 					char cs = s.charAt(k);
 					char ct = t.charAt(k);
 					c_s[cs]++;
 					c_t[ct]++;

 				}

 				for (int k = 'a'; k <= 'z'; k++) {

 					if (c_s[k] != c_t[k]) {
 						break;
 					}
 					if (k == 'z') {
 						ans++;
 					}
 				}
    		}
    	}
    	System.out.println(ans);
    }
}