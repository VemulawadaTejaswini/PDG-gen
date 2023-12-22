import java.util.*;

public class Main{

    static int mod = (int) 1e9 + 7;
    static int dx[] = {-1, 0, 1, 0}, dy[] = {0, -1, 0, 1};
    static int INF = Integer.MAX_VALUE/2;

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        //Queue<int[]> q = new ArrayDeque<int[]>();
        Integer n = new Integer(scan.nextInt());
        Integer k = new Integer(scan.nextInt());
        ArrayList<Integer> p = new ArrayList<Integer>();

        for(int i=0;i<n;i++) p.add(scan.nextInt());
    
        //Collections.sort(a);

        double max = 0.0;
        for(int i=0;i<n-k+1;i++){
            double e = 0.0;
            for(int l=0;l<k;l++){
                double et = 0.0;
                for(int j=1;j<=p.get(i+l);j++) et += j;
                e += et/p.get(i+l);
            }
            if(e > max) max = e;
        }
        System.out.println(max);
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
    }


}