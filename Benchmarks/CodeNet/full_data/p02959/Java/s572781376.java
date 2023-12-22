import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer N = Integer.parseInt(scan.next());
        Long A[] = new Long[N+1];
        Long B[] = new Long[N];

        for(int i=0;i<N+1;i++){
            A[i] = Long.parseLong(scan.next());
        }
        for(int i=0;i<N;i++){
            B[i] = Long.parseLong(scan.next());
        }

        long counter = 0;
        for(int i=0;i<N;i++){
            if(A[i] <= B[i]){
                counter += A[i];
                B[i] -= A[i];
                A[i] = 0L;                
            }else{
                counter += B[i];
                A[i] -= B[i];
                B[i] = 0L;
            }

            if(B[i] != 0L){
                if(A[i+1] <= B[i]){
                    counter += A[i+1];
                    B[i] -= A[i+1];
                    A[i+1] = 0L;                
                }else{
                    counter += B[i];
                    A[i+1] -= B[i];
                    B[i] = 0L;
                }
            }
        }
        
        System.out.println(counter);
    }
}