import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
//処理
HashMap<Integer,Integer> x=new HashMap<>();
int n=sc.nextInt();
int[] a=new int[n+1];
for (int i = 1; i <= n; i++) {
    a[i]=sc.nextInt();
    x.put(a[i],x.getOrDefault(a[i],0)+1);
}
int ans=0;
for (Integer i:x.keySet()) {
    ans+=x.get(i)-i;
}
out.println(ans);
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
    long temp1=1;
    for (long i = a; i > a-b; i--) {
        temp1*=i;
    }
    return temp1/fact(b);
}
}