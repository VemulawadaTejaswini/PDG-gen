import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sbl = new StringBuilder();
        StringBuilder sbr = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        boolean normal = true;
        int q = Integer.parseInt(sc.next());
        for(int i=0; i<q; i++) {
            int t = Integer.parseInt(sc.next());
            if(t == 1) {
                if(normal) normal = false;
                else normal = true;
            }else {
                int f = Integer.parseInt(sc.next());
                String c = sc.next();
                if(f == 1) {
                    if(normal) sbl.append(c);
                    else sbr.append(c);
                }
                else {
                    if(normal) sbr.append(c);
                    else sbl.append(c);
                }
            }
        }
        if(normal) {
            sb.append(sbl.reverse());
            sb.append(s);
            sb.append(sbr);
        }
        else {
            sb.append(sbr.reverse());
            sb.append(s);
            sb.append(sbl);
        }
        System.out.println(String.valueOf(sb));
    }
}