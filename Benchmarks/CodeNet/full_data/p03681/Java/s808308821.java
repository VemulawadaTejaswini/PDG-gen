import java.util.Scanner;

/**
 * Created by suzuki on 17/06/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if(Math.abs(N - M) > 1){
            System.out.println(0);
        }else {
            int ans = cut(pattern(N) * pattern(M));
            if(Math.abs(N - M) == 0){
                ans = cut(ans * 2) ;
            }
            System.out.println(ans);
        }
    }
    public static final int pattern(int n){
        int rtn = 1;
        while (n != 1){
           rtn = cut(rtn * n) ;
           n--;
        }
        return rtn;
    }
    public static final int cut(int n){
        return n % 1000000007;
    }
}