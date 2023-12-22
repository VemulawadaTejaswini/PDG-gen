import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scan s = new Scan();
        int A = s.nI();
        int B = s.nI();
        int[] N = new int[2];
        int res = -1;
        for(int i=0;i<2000;i++){
            N[0] = (int)Math.floor(i * 0.08);
            N[1] = (int)Math.floor(i * 0.10);
            if(A == N[0] && B == N[1]){
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
    
    static class Scan{
        private static Scanner sc = new Scanner(System.in);
        public static int nI(){
            return Integer.parseInt(sc.next());
        }
        public static long nL(){
            return Long.parseLong(sc.next());
        }
        public static String nS(){
            return sc.next();
        }
        public static double nD(){
            return Double.parseDouble(sc.next());
        }
    }
}
