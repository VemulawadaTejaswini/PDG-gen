import java.util.*;

public class Main{

    static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }

    static long lcm(long a,long b){
        return a/gcd(a,b)*b;
    }
    public static void main(String[] srgs){
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        int c=0;
        for(int i=0;i<s.length();i++)if(s.charAt(i)!=s.charAt(s.length()-1-i))c+=1;
        System.out.println(c/2);

    }
}
