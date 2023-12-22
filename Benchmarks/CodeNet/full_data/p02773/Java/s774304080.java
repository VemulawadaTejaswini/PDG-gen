import java.util.*;
public class Main1 {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                int n = sc.nextInt();
                String[] q = new String[n];
                for(int i = 0 ; i < n ; i++){
                        q[i] = sc.next();
                }
                for(String s : q){
                        int c = 0;
                        if(hs.containsKey(s)) c = (int)hs.get(s);
                        hs.put(s , c + 1);
                }
                int[] qq = {0};
                hs.forEach((s , c) -> {
                        qq[0] = Math.max(qq[0] , (int)c);
                });
                hs.forEach((s , cc) -> {
                        if((int)cc == qq[0]) System.out.println(s);
                });
                sc.close();
        }
}