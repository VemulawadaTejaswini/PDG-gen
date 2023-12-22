import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int ans = 0;
        for(int i=0; i<n; i++){
            char ac = a.charAt(i);
            char bc = b.charAt(i);
            char cc = c.charAt(i);
            if(ac == bc && bc == cc){
                //
            }else if(ac == bc || bc == cc || cc == ac){
                ans ++;
            }else{
                ans += 2;
            }
        }
        System.out.println(ans);
    }
}