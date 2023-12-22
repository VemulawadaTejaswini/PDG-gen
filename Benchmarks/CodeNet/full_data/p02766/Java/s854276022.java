import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        while(n != 0){
            n /= d;
            ans++;
        }
        System.out.println(ans);
    }
}
