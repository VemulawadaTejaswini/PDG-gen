import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = Integer.parseInt(sc.next());
int[] x=new int[n+1];
    for (int i = 1; i <= n; i++) {
        x[i]=Integer.parseInt(sc.next());
    }
    Arrays.sort(x);
    out.println(x[n/2]);
}
}