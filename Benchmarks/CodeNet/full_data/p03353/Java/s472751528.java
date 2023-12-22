import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        String s=sc.next();
        int n=s.length();
        int k=sc.nextInt();
        TreeSet<String> ts=new TreeSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                ts.add(s.substring(i,i+j));
            }
        }
        for (int i = 0; i < k; i++) {
            String p=ts.pollFirst();
            if(i==k-1)out.println(p);
            
        }
    }
}