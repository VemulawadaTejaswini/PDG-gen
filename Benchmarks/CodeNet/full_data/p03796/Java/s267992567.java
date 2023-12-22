import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int ans=1;
int n = Integer.parseInt(sc.next());
for (int i = 1; i <= n; i++) {
ans*=i;
ans=ans%1000000007;
}
    out.println(ans);
}}