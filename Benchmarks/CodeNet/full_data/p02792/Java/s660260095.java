import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());

        int[][] C = new int[9][9];
        int L, U, D;
        for(int i=1;i<N;i++){
            L = i % 10;
            if(L==0) continue;
            D = 1;
            while(i>=D*10) D=D*10;
            U = i/D;

            C[L-1][U-1] += 1;
        }

        int R=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                R += C[i][j] * C[j][i];
            }
        }

        System.out.println(R);
    }
}
