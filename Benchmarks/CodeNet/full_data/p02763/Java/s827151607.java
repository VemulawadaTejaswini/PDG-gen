import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder s = new StringBuilder(in.next());
        int q = in.nextInt();
        for(int i=0; i<q; i++) {
            int type = in.nextInt();
            if(type==1) {
                int iq = in.nextInt();
                String cq = in.next();
                s.replace(iq-1, iq, cq);
            }
            else if(type==2) {
                int l = in.nextInt();
                int r = in.nextInt();
                Set<Character> m = new HashSet<>();
                for(int j=l; j<=r; j++) {
                    char c = s.charAt(j-1);
                    m.add(c);
                }
                System.out.println(m.size());
            }
        }
    }
}
