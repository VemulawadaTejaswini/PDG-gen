import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                long c = sc.nextLong();
                long[] h = new long[n];
                for(int i = 0 ; i < n ; i++){
                        h[i] = sc.nextLong();
                }
                sc.close();
                long[] q = new long[n];
                Arrays.fill(q ,(long)(9 * Math.pow(10 , 19)));
                q[0] = 0;
                for(int i = 1 ; i < n ; i++){
                        for(int j = 0 ; j < i ; j++){
                                q[i] = Math.min(q[i] , q[j] + c + (h[i] - h[j]) * (h[i] - h[j]));
                        }
                }
                System.out.println(q[n - 1]);
        }
}