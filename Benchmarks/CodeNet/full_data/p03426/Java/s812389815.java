import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        HashMap<Integer,Integer[]> A = new HashMap();
        for(int i=0;i<W;i++){
            for(int j=0;j<H;j++){
                Integer a[] = {i,j};
                A.put(sc.nextInt(), a);
            }
        }
        long Q = sc.nextLong();
        
        //System.out.println(A.get(6)[0]);
        
        for(long i=0;i<Q;i++){
            long cost=0;
            int L = sc.nextInt();
            int R = sc.nextInt();
            for(int t=L;t != R ; t+=D){
                long x = Math.abs(A.get(t)[0]-A.get(t+D)[0]);
                long y = Math.abs(A.get(t)[1]-A.get(t+D)[1]);
                cost += x+y;
            }
            System.out.println(cost);
        }
    }
}