import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int X;
        
        if(A + B > A - B){
            X = A + B;
        }else{
            X = A - B;
        }
        
        if(X < A * B){
            X = A * B;
        }
        
       System.out.println(X);
    }
}