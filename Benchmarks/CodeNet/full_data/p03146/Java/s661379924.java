import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int s=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        set.add(s);
        int temp=s,ans=0,size=set.size();
        while (true){
            ans++;
            if(temp%2==0)temp/=2;
            else temp=3*temp+1;
            set.add(temp);
            if(set.size()==size)break;
            size=set.size();
        }
        out.println(ans+1);
    }
}