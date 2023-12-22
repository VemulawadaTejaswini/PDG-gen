import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++){
            int x = i;
            int sum = 0;
            while(x > 0){
                sum += x % 10;
                x /= 10;
            }
            if(a <= sum && sum <= b){
                ans += i;
            }
        }
        System.out.println(ans);
    }
}