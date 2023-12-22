import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for(int i = 2; i < n; i++){
            if(i*i <= n) ans = i*i;
            else break;
        }
        System.out.println(ans);
    }
}

