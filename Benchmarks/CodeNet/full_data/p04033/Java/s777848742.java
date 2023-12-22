import java.util.*;
public class Main {
    
    static Set<Integer> m = new HashSet<Integer>();
    static void solve(){
        Scanner sc = new Scanner(System.in);
        sc.nextInt(); int NOC = sc.nextInt(), count=0;
        m.add(1);
        while (NOC-->0) {
            int s = sc.nextInt(), e = sc.nextInt();
            if(m.contains(s)) {
                if(s==1) m.remove(1); // Special case   
                if(!m.contains(e)) m.add(e);
                else m.remove(s);
            }
        }
        System.out.println(m.size());
        sc.close();
    }
  
    public static void main(String args[]) {
        solve();
    }

}   
