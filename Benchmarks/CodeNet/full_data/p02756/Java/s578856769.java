import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    static final int MAX = (int)1e5+5;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int q = Integer.parseInt(sc.next());
        int r = 0;
        String[] z = {"",""};
        
        for(int i=0; i<q; i++){
            int t = Integer.parseInt(sc.next());
            if(t==1){
                r ^= 1;
            }else{
                int f = Integer.parseInt(sc.next());
                String c = sc.next();
                z[(r+f)%2] += c;
            }
        }
        
        StringBuffer sb = new StringBuffer(z[1]);
        
        String t = sb.reverse().toString() + s + z[0];
        if(r==1){
            sb = new StringBuffer(t);
            t = sb.reverse().toString();
        }
        
        System.out.println(t);
    }
    
}
