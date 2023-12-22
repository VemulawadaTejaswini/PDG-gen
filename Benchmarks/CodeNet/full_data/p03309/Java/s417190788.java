import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = sc.nextInt();
long[] a=new long[n+1];
long[] B=new long[n+1];
long b;
for (int i = 1; i <= n; i++) {a[i]=sc.nextLong();B[i]=a[i]-i;}
Arrays.sort(B);
if(n%2==0){
    b=(B[n/2]+B[n/2+1])/2;
}else{
    b=B[n/2+1];
}
long ans=0;
for (int i = 1; i <= n; i++) {
    ans+=abs(a[i]-b-i);
}
out.println(ans);
}}