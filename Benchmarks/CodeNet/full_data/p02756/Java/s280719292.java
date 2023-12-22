import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int q = Integer.parseInt(sc.next());
        for(int i=0; i<q; i++) {
            int t = Integer.parseInt(sc.next());
            if(t == 1) {
                sb = sb.reverse();
            }else {
                int f = Integer.parseInt(sc.next());
                String c = sc.next();
                if(f == 1) sb.insert(0, c);
                else sb.append(c);
                s = String.valueOf(sb);
            }
        }
        System.out.println(sb);
    }
}