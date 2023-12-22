import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int N;
        N = Integer.parseInt(scanner.next());

        int[] P = new int[N];

        for(int i=0;i<N;i++)
            P[i] = Integer.parseInt(scanner.next());


        int[] M = new int[N];
        int max=0, j, L, R;
        for(int i=N-1;i>=0;i--){
            L = -1;
            R = max;
            while(R-L > 1){
                int mid = L + (R-L)/2;
                if(P[i] < M[mid])
                    R = mid;
                else
                    L = mid;
            }
            if(max == R) max++;
            M[R] = P[i];
        }

        System.out.println(max);
    }
}
