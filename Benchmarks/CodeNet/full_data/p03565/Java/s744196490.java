import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        char[] s=sc.next().toCharArray();
        char[] t=sc.next().toCharArray();
        TreeSet<String> ts=new TreeSet<>();
        int sizeS=s.length;
        int sizeT=t.length;
        for (int i = 0; i <= sizeS-sizeT; i++) {
            int count=0,temp=0;
            for (int j = i; j < sizeT+i; j++) {
                if(s[j]=='?'||s[j]==t[j-i]){
                    count++;
                    temp=i;
                }
            }
            if(count==sizeT){
                String ans="";
                for (int j = 0; j < sizeS; j++) {
                    if(j<temp){
                        if(s[j]=='?')ans+='a';
                        else ans+=s[j];
                    }else{
                        if(s[j]=='?')ans+=t[j-temp];
                        else ans+=s[j];
                    }
                }
                ts.add(ans);
            }
        }
        out.println(ts.size()==0?"UNRESTORABLE":ts.pollFirst());
    }
}