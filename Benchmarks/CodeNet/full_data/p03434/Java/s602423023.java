import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(sc.next());
        }
        
        Arrays.sort(A);
        
        
        int a=0,b=0;
        for(int i = N-1; i > -1 ; i--){
            int n = A[i];
            if(i%2 == 0){
                a += n;
            }else{
                b += n; 
            }
        }
        
        System.out.println(b-a);
    }
}