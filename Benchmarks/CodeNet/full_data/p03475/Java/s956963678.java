import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = sc.nextInt();
int[] c=new int[n];
int[] s=new int[n];
int[] f=new int[n];
for (int i = 1; i < n; i++) {
    c[i]=sc.nextInt();
    s[i]=sc.nextInt();
    f[i]=sc.nextInt();
}
for (int i = 1; i < n; i++) {
    int t=0;
    for (int j = i; j < n; j++) {
        if(t<s[j]){t=s[j];}else if(t%f[j]!=0){t+=(f[j]-t%f[j]);}
        t+=c[j];
    }
    out.println(t);
}
out.println(0);
}}