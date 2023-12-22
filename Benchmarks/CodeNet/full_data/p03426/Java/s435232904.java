import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        HashMap<Integer,Integer> Ax = new HashMap();
        HashMap<Integer,Integer> Ay = new HashMap();
        for(int i=0;i<W;i++){
            for(int j=0;j<H;j++){
                int A = Integer.parseInt(sc.next());
                Ax.put(A, i);
                Ay.put(A, j);
            }
        }
        long Q = sc.nextLong();
        
        for(long i=0;i<Q;i++){
            long cost=0;
            int L = sc.nextInt();
            int R = sc.nextInt();
            for(int t=L;t != R ; t+=D){
                long x = Math.abs(Ax.get(t)-Ax.get(t+D));
                long y = Math.abs(Ay.get(t)-Ay.get(t+D));
                cost += x+y;
            }
            System.out.println(cost);
        }
    }
}