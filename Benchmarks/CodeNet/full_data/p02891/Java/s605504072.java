
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long rep = sc.nextInt();
        char[] sq = S.toCharArray();
        long ans = 0;
        for(int i=1;i<sq.length;i++){
            if(sq[i-1]==sq[i]){
                sq[i]='.';
                ans++;
            }
        }
        ans*=rep;
        if(sq[0] == sq[sq.length-1]){
            ans += (rep-1) ;
        }
        //System.out.println(new String(sq));
        System.out.println(ans);
    }
}