import java.util.*;

public class Main{

    static int mod = (int) 1e9 + 7;
    static int dx[] = {-1, 0, 1, 0}, dy[] = {0, -1, 0, 1};
    static int INF = Integer.MAX_VALUE/2;

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        //Queue<int[]> q = new ArrayDeque<int[]>();
        Integer N = new Integer(scan.nextInt());
        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int i=0;i<N;i++) a.add(scan.nextInt());

        boolean flag = true;
        for(int i=0;i<N;i++){
            int t = a.get(i);
            if(t%2==0){
                if(!((t%3==0)||(t%5==0))) flag = false;
            }
        }

        if(flag)
            System.out.println("APPROVED");
        else
        System.out.println("DENIED");
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
    }


}