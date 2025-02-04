import java.util.*;
 
class Main {
    void solve(){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), K = in.nextInt();
        int sum = 0;
        for(int i = 0; i < N; i++){
            int x = in.nextInt();
            sum += Math.min(Math.abs(x - K), x) * 2;
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        new Main().solve();
    }
}