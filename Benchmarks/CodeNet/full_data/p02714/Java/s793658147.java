import java.util.Map.Entry;
import java.util.*;

import org.w3c.dom.css.Counter;

public class Main {
//public class App {

    public static void main(String[] args){
     //スキャン
     Scanner s = new Scanner(System.in);
       // 入力
       int n = Integer.parseInt(s.next());
        String text =s.next();

        HashSet<String> A = new HashSet<String>();
   
        int an = 0;
        for(int i = 3 ;i<=n;i++){
            String huge = text.substring(i-1,i);
            A.clear();
            A.add(huge);
            for(int i2 =2; i2 < i;i2++){
                String huge2 = text.substring(i2-1,i2);
                if(! A.contains(huge2)){
                    A.add(huge2);
                    for(int i3 =1; i3 < i2;i3++){
                            if(! A.contains(text.substring(i3-1,i3))&&i-i2 != i2-i3){
                                an++;
                            }
                    }
                    A.remove(huge2);
                }
            }
        }
    System.out.println(an);
    }
}



