import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long r = 1;
        long l = 1;
        for(int i=0; i<N; i++){
            long T = sc.nextInt();
            long A = sc.nextInt();
            long x = (long)Math.ceil((double)r/T);
            long y = (long)Math.ceil((double)l/A);
            long k = Math.max(x,y);
            r=k*T;
            l=k*A;
        }
        System.out.println(r+l);
    }
}