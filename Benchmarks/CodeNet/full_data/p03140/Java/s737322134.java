import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        int ans = 0;

        for(int i=0; i<n; i++){
            int tmp = 0;
            char ca = a.charAt(i);
            char cb = b.charAt(i);
            char cc = c.charAt(i);
            if(ca == cb) tmp++;
            if(cb == cc) tmp++;
            if(cc == ca) tmp++;
            if(tmp == 0) ans += 2;
            if(tmp == 1) ans += 1;
        }

        System.out.println(ans);
    }
}