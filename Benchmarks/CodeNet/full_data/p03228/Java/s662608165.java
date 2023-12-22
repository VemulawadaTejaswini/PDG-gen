
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int K = s.nextInt();
        
        for(int i = 0; i < K; i++){
            if(i % 2 == 0){
                B += A / 2;
                A /= 2;
            } else {
                A += B / 2;
                B /= 2;
            }
        }
        
        System.out.println(A + " " + B);
    }
    
}
