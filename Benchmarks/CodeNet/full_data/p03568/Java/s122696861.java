import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N]; 
        for(int i = 0; i < N; i++){
            A[i] = input.nextInt();
        }
        int Times = 1;
        for(int i = 0; i < N; i++){
            Times *= 3;
        }
        System.out.println(Times - similarA(N, A));
    }
    private static int similarA(int N, int[] A){
        int times = 1;
        int kind;
        for(int i = 0; i < N; i++){
            if(A[i] % 2 == 0){
                kind = 1;
            }
            else{
                kind = 2;
            }
            times *= (3 - kind);
        }
        return times;
    }
}