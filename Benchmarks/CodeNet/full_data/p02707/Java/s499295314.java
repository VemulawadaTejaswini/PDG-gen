import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int[] A = new int[N];
        for (int i=1; i<N;i++){
            A[i] = stdIn.nextInt();
        }
        
        int[] Sub_N = new int[N];
        for (int j = 1; j<N; j++){
            for(int k=1; k<N; k++){
                if(j == A[k]){
                    Sub_N[j-1] += 1;
                }
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(Sub_N[i]);
        }


    }
}