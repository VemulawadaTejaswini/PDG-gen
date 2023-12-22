import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        int max = 0; 
        int secondmax = 0;
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            if(max < A[i]){
                secondmax = max;
                max = A[i];
            } else if(secondmax < A[i]){
                secondmax = A[i];
            }
        }
        
        for(int i = 0; i < N; i++){
            if(max == A[i]){
                System.out.println(secondmax);
            } else{
                System.out.println(max);
            }
        }
    }
}
