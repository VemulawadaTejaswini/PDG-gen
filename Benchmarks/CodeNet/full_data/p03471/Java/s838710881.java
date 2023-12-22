import java.util.*;


public class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c10000 = 0;
        int c5000 = 0;
        int c1000 = 0;

        boolean solved = false;
        for(int i = 0; i <= n; i++) {
            c10000 = i;
            for (int j = 0; j <= n - i; j++) {
                c5000 = j;
                c1000 = n-j-i;
                int cm = m -10000*c10000 -5000*c5000 -1000*c1000;
                if(cm == 0){
                    solved = true;
                    break;
                }
            }
            if(solved){
                break;
            }else if(i == n){
                c10000 = -1;
                c5000 = -1;
                c1000 = -1;
            }
        }

        System.out.println(c10000 + " " + c5000 + " " + c1000);
    }

    public static void main(String[] args) {
        solve();
    }
}
