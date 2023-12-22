import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = sc.nextInt();
int k = sc.nextInt();
int[] x=new int[n];
for (int i = 0; i < n; i++) {x[i]=sc.nextInt();}
int ans=x[n-1]-x[0]+abs(x[0])+abs(x[n-1]);
int temp;
    for (int i = 0; i <= n-k; i++) {
        ans=min( ans , min( x[i+k-1]-x[i]+abs(x[i]) , x[i+k-1]-x[i]+abs(x[i+k-1]) ) );
    }
out.println(ans);
}}