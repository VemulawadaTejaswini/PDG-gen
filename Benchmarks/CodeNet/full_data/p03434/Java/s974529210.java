import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        
        Arrays.sort(A, Collections.reverseOrder());
        
        int alice = 0;
        int bob = 0;
        for(int i = 0; i < N; i++){
            if(i % 2 == 0){
                alice += A[i];
            }else{
                bob += A[i];
            }
        }
        
        System.out.println(alice - bob);
    }
}
