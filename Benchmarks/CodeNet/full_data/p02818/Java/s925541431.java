import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        
        A -= K;
        if(A < 0){
            B += A;
            A = 0;
            if(B < 0){
                B = 0;
            }
        }
        
        System.out.println(A + " " + B);
    }
}