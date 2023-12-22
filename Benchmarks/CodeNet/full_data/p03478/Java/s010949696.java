import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ans = 0;
        for(int i = 1; i<=n; i++) {
            int ic = i;
            int sum = 0;
            while(ic>0) {
                sum += ic % 10;
                ic = ic / 10;
            }
            if(sum >= a && sum <= b) {
                ans+=i;
            }
        }
        System.out.println(ans);
    }
}