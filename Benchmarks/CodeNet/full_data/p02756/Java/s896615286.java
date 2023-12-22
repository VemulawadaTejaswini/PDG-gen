import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = Integer.parseInt(sc.next());
        for(int i=0; i<q; i++) {
            int t = Integer.parseInt(sc.next());
            if(t == 1) {
                s = re(s);
            }else {
                int f = Integer.parseInt(sc.next());
                String c = sc.next();
                StringBuilder sb = new StringBuilder();
                sb.append(s);
                if(f == 1) sb.insert(0, c);
                else sb.append(c);
                s = String.valueOf(sb);
            }
        }
        System.out.println(s);
    }
    static String re(String s) {
		StringBuffer sb = new StringBuffer(s);
		String st = sb.reverse().toString();
		return st;
    }
}