
import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //int H = Integer.valueOf(s.next());
        //社員番号
        int N = Integer.valueOf(s.next());
        int K = Integer.valueOf(s.next());
        int k = K-1;
        //部下持ち数
        int hoge=N-K+2;
		for(int i = K; i <= N+1; i++) {
            for(int i2 =0; i2<= i-1;i2++){
                hoge += N-(2*i2);
            }
        }

        System.out.println(hoge);

    }
}