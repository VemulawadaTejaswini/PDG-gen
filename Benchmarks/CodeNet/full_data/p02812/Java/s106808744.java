
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        String S = scan.next();

        int state = 0;
        int ans = 0;
        for(int i = 0; i < S.length(); i++){
            switch (state) {
                case 0: {
                    if (S.charAt(i) == 'A')
                        state = 1;
                    break;
                }

                case 1: {
                    if (S.charAt(i) == 'A')
                        state = 1;
                    else if (S.charAt(i) == 'B')
                        state = 2;
                    else
                        state = 0;
                    break;
                }

                case 2: {
                    if (S.charAt(i) == 'C') {
                        ans++;
                        state = 0;
                    }
                    else if(S.charAt(i) == 'A')
                        state = 1;
                    else
                        state = 0;
                    break;
                }
            }
        }

        os.println(ans);
    }
}