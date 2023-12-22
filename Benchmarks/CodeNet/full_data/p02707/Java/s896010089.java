import java.util.*;

class Main{
    public Main(){
        Scanner SC = new Scanner(System.in);
        int N = Integer.parseInt(SC.next());
        int[] A = new int[N];
        for(int i=0;i<N-1;i++){
            A[Integer.parseInt(SC.next())-1] += 1;
        }
        for(int i=0;i<N;i++){
            System.out.println(A[i]);
        }
    }

    public static void main(String args[]){
        Main main = new Main();
    }
}
