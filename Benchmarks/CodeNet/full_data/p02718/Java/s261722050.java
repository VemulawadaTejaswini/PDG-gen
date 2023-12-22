import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        Integer A[] = new Integer[N];
        int total = 0;



        for(int i=0; i < N; i++){
            A[i] = sc.nextInt();
            total += A[i];
        }

        Arrays.sort(A, Collections.reverseOrder());
        
        int flag = 0;
        
        for(int i = 0; i < M; i++){
            if(A[i] < total/4/M){
                flag = 1;
                break;
            }     
        }

        if(flag==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}