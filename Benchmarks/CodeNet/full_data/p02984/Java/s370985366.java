import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        sc.close();

        int[] c = new int[N+1];
        int max = 2*Math.max(A[0], A[1]);
        loop: for(int i = 0; i <= max; i=i+2){
            c[0] = i;
            for(int j = 1; j < N+1; j++){
                c[j] = 2*A[j-1] - c[j-1];
                if(c[j] < 0){
                    continue loop;
                }
            }
            if(c[N] == c[0])
                break;
        }

        for(int i = 0; i < N; i++){
            System.out.print(c[i] + " ");
        }
    }
}