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

            
            int count = 1;
            int pos = 0;
            for(int i = 0; i < N-1;i++){
                
                if(pos == 1 && A[i+1] < A[i]){
                    count++;
                    pos = 0;
                    continue;
                }
                if(pos == -1 && A[i+1] > A[i]){
                    count++;
                    pos = 0;
                    continue;
                }
                if(A[i+1] > A[i])
                    pos = 1;
                if(A[i+1] < A[i])
                    pos = -1;
                
            }
            System.out.println(count);
    }
}