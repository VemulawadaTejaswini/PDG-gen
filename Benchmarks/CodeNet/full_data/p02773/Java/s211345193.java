import java.util.*;
public class Main{
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
                String[] u = new String[n];
                int[] yono = {0};
                hs.forEach((s , cc) -> {
                        if((int)cc == qq[0]){
                                u[yono[0]] = (String)s;
                                yono[0]++;
                        }
                });
                sc.close();
                String[] it = new String[yono[0]];
                for(int i = 0 ; i < yono[0] ; i++){
                        it[i] = u[i];
                }
                Arrays.sort(it);
                for(int i = 0 ; i < yono[0] ; i++){
                        System.out.println(it[i]);
                }
        }
}