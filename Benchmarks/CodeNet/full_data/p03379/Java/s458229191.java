import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                int n = sc.nextInt();
                int[] x = new int[n];
                int[] q = new int[n];
                for(int i = 0 ; i < n ; i++){
                        x[i] = sc.nextInt();
                        q[i] = x[i];
                }
                sc.close();
                Arrays.sort(q);
                double a = (q[n / 2 - 1] + q[n / 2]) / 2.0;
                for(int i = 0 ; i < n ; i++){
                        if(x[i] < a) System.out.println(q[n / 2]);
                        else System.out.println(q[n / 2 - 1]);
                }
        }
}