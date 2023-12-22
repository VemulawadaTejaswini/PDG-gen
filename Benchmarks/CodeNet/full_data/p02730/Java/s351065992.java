import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String s,t,ans;
        boolean eq,eq2;        
        Integer n;

        ans="";
        s=sc.next();
        n=s.length();
        StringBuffer str = new StringBuffer(s);
        t=str.reverse().toString();

        eq=s.equals(t);
        t=s.substring((n+1)/2, n);
        s=s.substring(0,(n-1)/2);
        eq2=s.equals(t);
        
        if(eq && eq2){
            ans="Yes";
        }else{
            ans="No";
        }

        System.out.println(ans);

    }
}