import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = Integer.parseInt(sc.next());
int[] a=new int[n+1];
int temp=1,c=0;
    for (int i = 1; i <= n; i++) {
        a[i]=Integer.parseInt(sc.next());

    if(a[i]!=2)c++;
    }
    if(c==n){
        out.println("-1");exit(0);
    }
    int i=0;
    while (temp!=2) {
        i++;
        if(temp==a[temp]||temp==a[a[temp]]){
            out.println("-1");
            exit(0);
        }else{
        temp=a[temp];
        }
    }
    out.println(i);
}
}