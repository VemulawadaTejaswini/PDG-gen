import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int H, N;
        H = Integer.parseInt(scanner.next());
        N = Integer.parseInt(scanner.next());

        int[] A = new int[N], B = new int[N];
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(scanner.next());
            B[i] = Integer.parseInt(scanner.next());
        }

        int[][] C = new int[N][H+1];

        C[0][0] = 0;

        for(int h=0;h<=H;h++){
            C[0][h] = (h/A[0])*B[0];
            if(h - (h/A[0])*A[0] > 0) {
                C[0][h] += B[0];
            }

            for(int i=1;i<N;i++){
                C[i][h] = C[i-1][h];
                int t = 1;
                while(h-t*A[i]>=0){
                    if(C[i][h] > C[i-1][h-t*A[i]] + t*B[i]){
                        C[i][h] = C[i-1][h-t*A[i]] + t*B[i];
                    } else{
                        break;
                    }
                    t++;
                }
            }
        }

        System.out.println(C[N-1][H]);
    }
}
