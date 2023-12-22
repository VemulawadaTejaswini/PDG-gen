import java.util.*;

class Main {

    Main(){
        Scanner SC = new Scanner(System.in);
        int A = Integer.parseInt(SC.next());
        int B = Integer.parseInt(SC.next());
        int M = Integer.parseInt(SC.next());

        int A_MIN = Integer.MAX_VALUE, B_MIN = Integer.MAX_VALUE, Total_MIN = Integer.MAX_VALUE;

        int[] A_Cost = new int[A];
        for(int i=0;i<A;i++){
            A_Cost[i] = Integer.parseInt(SC.next());
            A_MIN = Math.min(A_MIN, A_Cost[i]);
        }

        int[] B_Cost = new int[B];
        for(int i=0;i<A;i++){
            B_Cost[i] = Integer.parseInt(SC.next());
            B_MIN = Math.min(B_MIN, B_Cost[i]);
        }

        Total_MIN = A_MIN + B_MIN;

        int x,y,c;
        for(int i=0;i<M;i++){
            x = Integer.parseInt(SC.next()) - 1;
            y = Integer.parseInt(SC.next()) - 1;
            c = Integer.parseInt(SC.next());

            Total_MIN = Math.min(Total_MIN, A_Cost[x] + B_Cost[y] - c);
        }

        System.out.println(Total_MIN);
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
