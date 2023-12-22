import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = Long.parseLong(sc.next());
        String[] sp = S.split("");
        int i = 0;
        String ans;
        while(true) {
            if(sp[i].equals("1") && i < K) {
                i++;
                continue;
            }else {
                ans = sp[i];
                break;
            }
        }
        System.out.println(ans);
    }
}