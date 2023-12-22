import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int sum = 0;

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                for(int k=1; k<=N; k++){
                    sum = sum + gcd(gcd(i, j),k);
                }
            }
        }


        System.out.println(sum);

        
    }
    static int gcd(int a, int b) {//最大公約数を求める
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}    

