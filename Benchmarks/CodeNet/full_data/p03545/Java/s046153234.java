import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.next();
        String[] sp = l.split("");
        int[] n = new int[4];
        for(int i=0; i<4; i++) {
            n[i] = Integer.parseInt(sp[i]);
        }
        String[] op = new String[3];
        int ans = n[0];
        for(int i=0; i<8; i++) {
            ans = n[0];
            for(int j=0; j<3; j++) {
                if((1 & i >> j) == 1) {
                    ans += n[j+1];
                    op[j] = "+";
                }else {
                    ans -= n[j+1];
                    op[j] = "-";
                }
            }
            if(ans == 7) {
                break;
            }
        }
        System.out.println(n[0]+op[0]+n[1]+op[1]+n[2]+op[2]+n[3]+"=7");
    }
}