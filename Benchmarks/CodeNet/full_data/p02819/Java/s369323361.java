import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        //与えられた数が素数か素数でないかを見分けるには，2からN−1までの整数で割り切れるかどうか
        for (int n=x; ; n++) {
            if (judgeNumber(n)) {
                System.out.println(n);
                break;
            }
        }
    }
    
    private static boolean judgeNumber(int n) {
        for (int i=2; i<=n-1; i++) {
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}