import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        
        int Y;
        int Z;
        
        if(K + X < 1000000){
            Y = X + K;
        }else{
            Y = 1000000;
        }
        
        if(K - X > -1000000){
            Z = X - K + 1;
        }else{
            Z = -1000000;
        }
        
        for(int i = Z; i < Y; i++){
            System.out.println(i);
        }
    }
}