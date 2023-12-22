import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$) {
      //類題:ABC-105D-Candy Distribution
        Scanner sc = new Scanner(in);
      //解説どおりやる(このコードだとソートをしないのでo(N)で解けます)
        int n=sc.nextInt();
        long[] a=new long[n+1];
        a[0]=0;
        HashMap<Long,Long> m=new HashMap<>();
        m.put(0l,1l);
      //はじめ0で初期化(こうすると最後数え上げるときにうまくいく)
        for (int i = 1; i <n+1; i++) {
            a[i]=a[i-1]+sc.nextLong();
            m.put(a[i],0l);
        }
        long ans=0;
      //自分より手前にある,自分と同じ値の個数を数える(累積和の考えより) 
        for(int i=0;i<=n;i++){
          //m.get(a[i]):a[i]よりも手前にある,a[i]と同じ値の個数
          //当然、初めての出現だと0
            ans+=m.get(a[i]);
          //出現回数を増やす(次に出てきたときは+1(今見ているa[i]の分の個数)された値が足される)
            m.put(a[i],m.get(a[i])+1l);
        }
        out.println(ans);
    }
}