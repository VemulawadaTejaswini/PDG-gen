import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        final int K = scan.nextInt();
        final int Q = scan.nextInt();
        
        int[] A = new int[Q];
        for(int i = 0; i < Q; i++){
            A[i] = scan.nextInt();
        }
        scan.close();
        int[] point = new int[N];
        for(int i = 0; i < N; i++){
            point[i] = 0;
        }
        for(int i = 0; i < Q; i++){
            point[A[i] - 1] += 1;
        }

        for(int i = 0; i < N; i++){
            if(K - (Q - point[i]) > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
           
}
