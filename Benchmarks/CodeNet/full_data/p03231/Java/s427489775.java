import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();
        String t=sc.next();
        int g=gcd(n,m);
        int lcm=n*m/g;
        for (int i = 0; i < g; i++) {
            if(i*n/g==i+m/g&&s.charAt(i)!=t.charAt(i)){
                out.println(-1);
                exit(0);
            }
        }
        out.println(lcm);
    }
    static int gcd(int a,int b){
        int temp;
        while((temp=a%b)!=0){
            a=b;
            b=temp;
        }
        return b;
    }
}