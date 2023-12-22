import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        
        if(K == 1){
            if(A%2 == 1){
                A--;
            }
            A = (A/2);
            B += A;
        }else{
    
        for(int i=0; i<K/2; i++){
            if(A%2 == 1){
                A--;
            }
            A = (A/2);
            B += A;
            
            if(B%2 == 1){
                B--;
            }
            B = (B/2);
            A += B;
        }
        }
        
        
        System.out.println(A+" "+B);
    }
}
