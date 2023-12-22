import java.util.*;

class Main {

    public static void main(String args[]){
        Main main = new Main();
    }

    public Main(){
        Scanner SC = new Scanner(System.in);
        int N = Integer.parseInt(SC.next());
        int M = Integer.parseInt(SC.next());

        int[] NUM = new int[N];
        boolean[] T = new boolean[N];
        for(int i=0;i<N;i++) T[i] = false;

        int A = 0;
        int P = 0;
        for(int i=0;i<M;i++){
            int p = Integer.parseInt(SC.next())-1;
            boolean S = SC.next().equals("AC");
            if(T[p]) continue;

            if(S){
                A++;
                P += NUM[p];
            }
            else {
                NUM[p]++;
            }

            T[p] = S;
        }

        System.out.println(A + " " + P);
    }

}
