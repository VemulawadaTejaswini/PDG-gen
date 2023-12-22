import java.util.*;

class Main {
    public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[] A = new int[3];
        int sum = 0;
        for(int i = 0; i<3; i++){
            A[i] = stdIn.nextInt();
            sum += A[i];
        }

        if(sum >= 22)
            System.out.print("bust");
        else
            System.out.print("win");
      


    }
}