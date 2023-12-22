import java.util.*;

public class Main {

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        int n = chars.length;
        
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if(chars[i] != chars[i + 1]) {
                ans = Math.max(i + 1, n - i - 1);
            }
        }
        
        System.out.println(ans);
    }

    public static void main(String[] args){
        new Main().run();
    }
}