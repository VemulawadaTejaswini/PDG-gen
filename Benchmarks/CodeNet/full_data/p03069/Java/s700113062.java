import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        boolean start = false;
        int ans = 0;
        int blk = 0;
        for (int i = 0; i < n; i++) {
            if(s[i] == '.' && start){
                ans++;
            }
            if(s[i] == '#'){
                start = true;
                blk++;
            }
        }
        System.out.println(Math.min(ans, blk));
        sc.close();
    }

}
