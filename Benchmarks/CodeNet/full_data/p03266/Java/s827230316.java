import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long ans = 0;
        int c=0;
        int g=0;
        for(int i=1;i<=N;i++){
            if(i%K==0){
                c++;
            }
            if(K%2==0&&i%K==K/2){
                g++;
            }
        }
        System.out.println((int)Math.pow(c,3)+(int)Math.pow(g,3));
    }
}

