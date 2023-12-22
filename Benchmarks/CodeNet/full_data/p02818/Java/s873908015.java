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

        a = a-k;
        cnt=Math.abs(a);
        if(a<=0){
        	a=0;
        }
        b-=cnt;
        if(b<=0){
        	b=0;
        }
        
        System.out.println(a + " " + b);
    }
}
