import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long ans = 0;
        // 文字列切り出し
        for(int i = 1; i <= k; i++) {
            for(int j = 1; j <= k; j++) {
                for(int h = 1; h <= k; h++) {
                    ans += gcd(i, gcd(j, h));
                }
            }
        }
        
        System.out.println(ans);
    }

    // 最大公約数
    static int gcd(int a, int b) {
        return b>0 ? gcd(b, a%b) : a;
    }
}
