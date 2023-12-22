import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                int n = sc.nextInt();
                int k = sc.nextInt();
                sc.close();
                int[] q = new int[n + 1];
                q[0] = 1;
                for(int i = 1 ; i <= n ; i++){
                        q[i] = Math.min(q[i - 1] + k , q[i - 1] * 2);
                }
                System.out.println(q[n]);
        }
}