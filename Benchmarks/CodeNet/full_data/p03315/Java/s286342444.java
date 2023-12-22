import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        String A = scanner.next();
        int ans = 0;

        for(int i = 1; i < 4; i++) {

        		if(A.substring(i,i+1).equals("+")) {
        			ans++;
        		}else {
        			ans--;
        		}
        }
        System.out.println(ans);

     }
