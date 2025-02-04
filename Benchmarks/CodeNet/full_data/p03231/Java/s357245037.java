import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();
        String t=sc.next();
        int lcm=n/gcd(n,m)*m;
        HashMap<Integer,Character> mapS=new HashMap<>();
        HashMap<Integer,Character> mapT=new HashMap<>();
        int ntmp=lcm/n;
        int mtmp=lcm/m;
        for (int i = 0; i < n; i++) {
            mapS.put(i*ntmp+1,s.charAt(i));
        }
        for (int i = 0; i < m; i++) {
            mapT.put(i*mtmp+1,t.charAt(i));
        }
        for (int i = 1; i <= lcm; i++) {
            if(mapS.get(i)!=null&&mapT.get(i)!=null&&mapS.get(i)!=mapT.get(i)){
                out.println(-1);
                exit(0);
            }
        }
        out.println(lcm);
    }
    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}