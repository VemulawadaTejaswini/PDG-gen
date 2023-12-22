import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int[] p = new int[a];
        int[] q = new int[b];
        int[] r = new int[c];
        for(int i = 0; i < a; i++){
            p[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < b; i++){
            q[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < c; i++){
            r[i] = Integer.parseInt(sc.next());
        }
        
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        int[] s = new int[x+y];
        for(int i = 1; i <= x; i++){
            s[i-1] = p[a-i];
        }
        for(int i = 1; i <= y; i++){
            s[x+i-1] = q[b-i];
        }
        Arrays.sort(s);
        
        int ri = c-1;
        int si = x+y-1;
        long ans = 0;
        for(int i = 0; i < x+y; i++){
            if(ri >= 0 && r[ri] > s[si]){
                ans += r[ri];
                ri--;
            }else{
                ans += s[si];
                si--;
            }
        }
        System.out.println(ans);
    }
}