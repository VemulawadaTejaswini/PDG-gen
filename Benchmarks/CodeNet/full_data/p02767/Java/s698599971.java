import java.util.*;

class Main {

    public Main(){
        Scanner SC = new Scanner(System.in);
        int N = SC.nextInt();
        long[] X = new long[N];
        long S = 0;

        for(int i=0;i<N;i++){
            X[i] = SC.nextLong();
            S += X[i];
        }

        long P1 = S/N;
        long P2 = S/N+1;

        long R1=0,R2=0;
        for(int i=0;i<N;i++){
            R1 += (X[i]-P1) * (X[i]-P1);
            R2 += (X[i]-P2) * (X[i]-P2);
        }

        System.out.println(Math.min(R1,R2));
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
