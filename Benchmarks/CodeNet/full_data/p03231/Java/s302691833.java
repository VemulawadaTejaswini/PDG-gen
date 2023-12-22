import java.util.Deque;
import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    static int lcm (int a, int b) {
    	int temp;
    	long c = a;
    	c *= b;
    	while((temp = a%b)!=0) {
    		a = b;
    		b = temp;
    	}
    	return (int)(c/b);
    }

    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String s = br.readLine();
        String t = br.readLine();
        
        int x = lcm(n, m);
        int ans = x;
        outer: for (int i = x; (i <= (n-1)*i/n + 1) || (i <= (m-1)*i/m + 1); i += x) {
            //System.out.println(i);
            for (int j = 0; j < n; j += i/n) {
                for (int k = 0; k < n; k += i/m) {
                    
                    if (j*i/n+1 == k*i/m+1) {
                        //System.out.println("aaa");
                        if (s.charAt(j) == t.charAt(k)) {
                            ans = -1;
                            break outer;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
