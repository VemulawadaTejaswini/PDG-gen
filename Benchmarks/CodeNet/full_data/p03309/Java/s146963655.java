import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String s = sc.next();
int n = sc.nextInt();
long[] a=new long[n];
long b;
for (int i = 0; i < n; i++) {a[i]=sc.nextInt();}
if(n%2==0){
    b=(a[n/2]+a[n/2-1])/2;
}else{
    b=a[(n-1)/2];
}
long ans=0;
for (int i = 0; i < n; i++) {
    ans+=abs(a[i]-(i+1+b));
}
out.println(ans);
}}