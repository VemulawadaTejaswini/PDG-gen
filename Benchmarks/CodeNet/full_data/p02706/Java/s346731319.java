import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int M = stdIn.nextInt();
        int[] A = new int[M];
        int Study_sum = 0;


        for (int i = 0; i<M; i++){
            A[i] = stdIn.nextInt();
        }
        
        for(int i=0; i<M; i++){
            Study_sum += A[i];
        }


        if ((N-Study_sum)>=0){
            System.out.print(N-Study_sum);
        }
        else{
            System.out.print("-1");
        }
    }
}