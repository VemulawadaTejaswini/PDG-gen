import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = Integer.parseInt(sc.next());
int[] x=new int[n+1];
for(int i=1;i<=n;i++){x[i]=Integer.parseInt(sc.next());}
HashMap<Integer,Integer> m=new HashMap<>();
for(int i=1;i<=n;i++){m.put(x[i], i);}
Arrays.sort(x);
for (int i = 1; i <= n; i++) {
if(m.get(x[i])<=n/2){
    out.println(x[n/2+1]);
}else{
    out.println(x[n/2]);
}
}
}
}