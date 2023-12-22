import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int cost0 =0;
        int costN =0;
        int [] A = new int[M];
        for (int i =0;i<M;i++){
            A[i] = sc.nextInt();
        }
        for (int i =X;i>1;i--){
            for (int j =0;j< M;j++){
                if(A[j] == i){
                    cost0++;
                }
            }
        }
        for (int i =X;i<N-1;i++){
            for (int j =0;j< M;j++){
                if(A[j] == i){
                    costN++;
                }
            }
        }
        System.out.println(Math.min(cost0,costN));
    }
}
