import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for(int i = a; i <= b; i++){
            char[] c = String.valueOf(i).toCharArray();
            if(c[0] == c[4] && c[1] == c[3]) ans++;
        }
        System.out.println(ans);
    }
}
