import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        String S = sc.next();
        int[] l = new int[Q];
        int[] r = new int[Q];
        
        String s = "";
        for(int i=0; i<Q; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
            s = S.substring(l[i]-1, r[i]);
            String[] sp = s.split("");
            int count = 0;
            for(int j=1; j<sp.length; j++) {
                if(sp[j-1].equals("A") && sp[j].equals("C")) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}