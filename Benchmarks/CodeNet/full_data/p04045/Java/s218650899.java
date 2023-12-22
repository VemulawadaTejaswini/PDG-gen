import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String[] d=new String[k];
        for (int i = 0; i < k; i++) {
            d[i]=sc.next();
        }
        int ans=n;
        while(true){
            int c=0;
            String s=String.valueOf(ans);
            for (int i = 0; i < k; i++) {
                if(s.contains(d[i])){
                    c=1;
                    break;
                }else{
                    c=0;
                }
            }
            if(c==0)break;
            ans+=c;
        }
        out.println(ans);
    }
}