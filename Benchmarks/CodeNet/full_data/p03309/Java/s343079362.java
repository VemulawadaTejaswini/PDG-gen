import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = sc.nextInt();
long[] B=new long[n+1];
long b;
for (int i = 1; i <= n; i++) {B[i]=sc.nextLong()-i;}
Arrays.sort(B);
b=B[n/2];
long ans=0;
for (int i = 1; i <= n; i++) {
    ans+=abs(B[i]-b);
}
out.println(ans);
}}