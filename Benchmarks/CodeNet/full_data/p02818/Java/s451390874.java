import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //宣言
        Scanner sc = new Scanner(System.in);
        long cnt;

        //入力情報取得
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();


        cnt=Math.min(a,k);
        a = a-cnt;
        k = k-cnt;
        
        cnt=Math.min(b,k);
        
        b= b-cnt;
        
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
    }
}
