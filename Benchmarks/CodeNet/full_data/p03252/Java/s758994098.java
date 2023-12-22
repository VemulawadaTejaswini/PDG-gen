import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        String s=sc.next();
        String t=sc.next();
        //-97
        int[] x=new int[26];
        int c=0;
        HashSet<Character> S=new HashSet<>();
        HashSet<Character> T=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char p=s.charAt(i);
            S.add(p);
            char q=t.charAt(i);
            T.add(q);
            if(x[(int)(p-97)]==0){
                x[(int)(p-97)]=(int)q;
            }else{
                if(x[(int)(p-97)]!=(int)q){
                    out.println("No");
                    exit(0);
                }
            }
        }
        if(S.size()!=T.size()){
            out.println("No");
        }else{
            out.println("Yes");
        }
    }
    //階乗
static long fact(long a){
    long b=1;
    for (long i = 1; i <= a; i++) {
        b*=i;
    }
    return b;
}
//最大公約数
static int gcd (int a, int b) {
    int temp;
    while((temp = a%b)!=0) {
        a = b;
        b = temp;
    }
    return b;
}
//※最小公倍数はa*b/gcd(a,b)である
//二項係数
static long combi (long a, long b) {
    b=min(a-b,b);
    return permu(a,b)/fact(b);
}
//順列
static long permu(long a,long b){
    long temp=1;
    for (long i =a ; i > a-b; i--) {
        temp*=i;
    }
    return temp;
}
}